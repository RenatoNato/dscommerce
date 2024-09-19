package com.devsuperior.dscommerce.entities;

public class OrderItem {

    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;

    public OrderItem() {}

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }


}
