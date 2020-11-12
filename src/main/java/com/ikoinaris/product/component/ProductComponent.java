package com.ikoinaris.product.component;

import com.ikoinaris.product.model.Product;
import com.ikoinaris.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductComponent {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    private void init() {

        productRepository.deleteAll();

        Product product = new Product();
        product.setName("Huawei P9 Lite");
        product.setCode("HW9L");
        product.setTitle("HUAWEI P9 LITE");
        product.setDescription("Huawei P9 Lite Black");
        product.setImageUrl("huaweip9lite.jpg");
        product.setPrice(229.00);
        productRepository.save(product);

        product = new Product();
        product.setName("iPhone 7");
        product.setCode("IP7");
        product.setTitle("IPHONE 7");
        product.setDescription("iPhone 7 White");
        product.setImageUrl("iphone7.jpg");
        product.setPrice(799.00);
        productRepository.save(product);

        product = new Product();
        product.setName("Samsung Galaxy 9");
        product.setCode("SMGAL9");
        product.setTitle("SAMSUNG GALAXY 9");
        product.setDescription("Samsung Galaxy 9 Pink");
        product.setImageUrl("samsunggalaxy9.jpg");
        product.setPrice(319.00);
        productRepository.save(product);
    }
}
