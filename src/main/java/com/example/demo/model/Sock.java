package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
public class Sock {

    private Long id;

    private SocksColor color;

    private SocksSize size;

    private Integer cottonComposition;
    @EqualsAndHashCode.Exclude
    private Integer quantity;
    private int cottonPart;

}