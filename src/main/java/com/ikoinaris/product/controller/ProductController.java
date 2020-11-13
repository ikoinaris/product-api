package com.ikoinaris.product.controller;

import com.ikoinaris.product.model.Product;
import com.ikoinaris.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/docker-test")
    public String getDocker(){
        return "Docker Test run successfully!";
    }

    @GetMapping("/products")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
