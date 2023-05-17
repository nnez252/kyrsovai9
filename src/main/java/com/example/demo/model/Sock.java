package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sock {

    private Long id;

    private SocksColor color;

    private SocksSize size;

    private Integer cottonComposition;

    private Integer quantity;
    private int cottonPart;

}