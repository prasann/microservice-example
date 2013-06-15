package com.prasans;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
}
