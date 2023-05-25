package com.example.demo.services.impl;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import com.example.demo.services.SockRepository;
import com.example.demo.services.SockServices;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
@Service
public class SockRepositoryImpl implements SockRepository {

    private Set<Sock> socks = new HashSet<>();
@Override
    public Sock save(Sock sock) {
        socks.add(sock);
        return sock;
    }



    @Override
    public List<Sock> findAllByColorAndSizeAndCottonPartBetween(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax) {
        return socks.stream()
                .filter(sock -> sock.getColor() == color && sock.getSize() == size && sock.getCottonPart() >= cottonMin && sock.getCottonPart() <= cottonMax)
                .collect(Collectors.toList());
    }
@Override
    public Optional<Sock> findByColorAndSizeAndCottonPart(SocksColor color, SocksSize size, int cottonPart) {
        return socks.stream()
                .filter(sock -> sock.getColor() == color && sock.getSize() == size && sock.getCottonPart() == cottonPart)
                .findFirst();
    }
@Override
    public void delete(Sock sock) {
        socks.remove(sock);
    }
}