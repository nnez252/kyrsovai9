package com.example.demo.controller;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import com.example.demo.services.SockServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/socks")
public class SockController {

        private final SockServices sockService;

        public SockController(@Qualifier("sockServices") SockServices sockService) {
            this.sockService = sockService;
        }

        @PostMapping
        public ResponseEntity<Void> addSock(@RequestBody Sock sock) {
            sockService.addSock(sock);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @PutMapping
        public ResponseEntity<Void> releaseSock(@RequestBody Sock sock) {
            sockService.releaseSock(sock);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @GetMapping
        public ResponseEntity<Integer> getTotalQuantity(
                @RequestParam SocksColor color,
                @RequestParam SocksSize size,
                @RequestParam Integer cottonMin,
                @RequestParam Integer cottonMax) {
            Integer result = sockService.getTotalQuantity(color, size, cottonMin, cottonMax);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }

        @DeleteMapping
        public ResponseEntity<Void> deleteSock(@RequestBody Sock sock) {
            sockService.deleteSock(sock);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

