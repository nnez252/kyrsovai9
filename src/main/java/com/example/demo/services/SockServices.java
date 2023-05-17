package com.example.demo.services;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import org.springframework.stereotype.Service;


public interface SockServices {

    void addSock(Sock sock);

    void releaseSock(Sock sock);

    Integer getTotalQuantity(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax);

    void deleteSock(Sock sock);
}
