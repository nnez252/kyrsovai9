package com.example.demo.services;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SockRepository {

    Object save(Sock updatedSock);

    Optional<Sock> findByColorAndSizeAndCottonPart(SocksColor color, SocksSize size, Object cottonPart);

    List<Sock> findAllByColorAndSizeAndCottonPartBetween(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax);
}
