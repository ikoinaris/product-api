package com.ikoinaris.product.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {

    @Id
    private String productId;
    private String name;
    private String code;
    private String title;
    private String description;
    private String imageUrl;
    private Double price;

    public Product() {
    }
}
