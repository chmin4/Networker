package com.example.networker_test.domain.sotre;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private Long id;
    private Long price;
    private String name;
    private String image;

    public Product(Long id, Long price, String name, String image) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.image = image;
    }

    protected Product() {

    }
}
