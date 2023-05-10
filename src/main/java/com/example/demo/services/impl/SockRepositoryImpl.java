package com.example.demo.services.impl;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import com.example.demo.services.SockRepository;
import com.example.demo.services.SockServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SockRepositoryImpl implements SockRepository {
    private SockRepository sockRepository;

    private SockServices sockServices;

    public SockRepositoryImpl(SockRepository sockRepository, SockServices sockServices) {
        this.sockRepository = sockRepository;
        this.sockServices = sockServices;
    }


    private List<Sock> socks = new ArrayList<>();
@Override
    public Sock save(Sock sock) {
        socks.add(sock);
        return sock;
    }



    @Override
    public List<Sock> findAllByColorAndSizeAndCottonPartBetween(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax) {
        return null;
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