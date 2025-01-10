package com.techie.mircroservices.product.repository;

import com.techie.mircroservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
