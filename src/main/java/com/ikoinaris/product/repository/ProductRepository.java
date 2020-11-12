package com.ikoinaris.product.repository;

import com.ikoinaris.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productData", path = "productData")
public interface ProductRepository extends MongoRepository<Product, String> {
}
