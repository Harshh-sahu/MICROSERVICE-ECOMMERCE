package com.techie.mircroservices.product.controller;

import com.techie.mircroservices.product.dto.ProductRequest;
import com.techie.mircroservices.product.dto.ProductResponse;
import com.techie.mircroservices.product.model.Product;
import com.techie.mircroservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
 return productService.createProduct(productRequest);

    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {



        return productService.getAllProducts();
    }

}
