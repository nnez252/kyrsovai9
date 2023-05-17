package com.example.demo.services;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;


import java.util.List;
import java.util.Optional;

public interface SockRepository {

    Object save(Sock updatedSock);

    List<Sock> findAllByColorAndSizeAndCottonPartBetween(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax);

    Optional<Sock> findByColorAndSizeAndCottonPart(SocksColor color, SocksSize size, int cottonPart);

    void delete(Sock sock);
}
