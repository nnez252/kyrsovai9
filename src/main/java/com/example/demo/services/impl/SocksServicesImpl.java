package com.example.demo.services.impl;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import com.example.demo.services.SockRepository;
import com.example.demo.services.SockServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 @Service
 public class SocksServicesImpl implements SockServices {
    private SockRepository sockRepository;

    public void SockService(SockRepository sockRepository) {
        this.sockRepository = sockRepository;
    }

    public SocksServicesImpl(SockRepository sockRepository) {
        this.sockRepository = sockRepository;
    }

    public void addSock(Sock sock) {
        Optional<Sock> existingSock = sockRepository.findByColorAndSizeAndCottonPart(
                sock.getColor(), sock.getSize(), sock.getCottonPart());
        if (existingSock.isPresent()) {
            Sock updatedSock = existingSock.get();
            updatedSock.setQuantity(updatedSock.getQuantity() + sock.getQuantity());
            sockRepository.save(updatedSock);
        } else {
            sockRepository.save(sock);
        }
    }

    public void releaseSock(Sock sock) {
        Sock existingSock = sockRepository.findByColorAndSizeAndCottonPart(
                        sock.getColor(), sock.getSize(), sock.getCottonPart())
                .orElseThrow(() -> new RuntimeException("Sock not found"));
        if (existingSock.getQuantity() < sock.getQuantity()) {
            throw new RuntimeException("Not enough socks in stock");
        }
        existingSock.setQuantity(existingSock.getQuantity() - sock.getQuantity());
        sockRepository.save(existingSock);
    }

    public Integer getTotalQuantity(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax) {
        List<Sock> socks = sockRepository.findAllByColorAndSizeAndCottonPartBetween(color, size, cottonMin, cottonMax);
        return socks.stream().mapToInt(Sock::getQuantity).sum();
    }

    public void deleteSock(Sock sock) {
        Sock existingSock = sockRepository.findByColorAndSizeAndCottonPart(
                        sock.getColor(), sock.getSize(), sock.getCottonPart())
                .orElseThrow(() -> new RuntimeException("Sock not found"));
        if (existingSock.getQuantity() < sock.getQuantity()) {
            throw new RuntimeException("Not enough socks in stock");
        }
        existingSock.setQuantity(existingSock.getQuantity() - sock.getQuantity());
        sockRepository.save(existingSock);
    }
}

