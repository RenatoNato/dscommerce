package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public ProductDTO(){

    }

    public ProductDTO(String name, Long id, String description, Double price, String imgUrl) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }


    public ProductDTO(Product entity) {
        this.name = entity.getName();
        this.id = entity.getId();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
