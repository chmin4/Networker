package com.example.networker_test.controller.store;

import com.example.networker_test.domain.sotre.Product;
import com.example.networker_test.dto.user.request.UserCreateRequest;
import com.example.networker_test.service.store.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/store")
    public List<Product> getProduct (){
        return productService.getProduct();
    }

}
