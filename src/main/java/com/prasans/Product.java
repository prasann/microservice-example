package com.prasans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.msgpack.annotation.Message;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Message
public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
}
