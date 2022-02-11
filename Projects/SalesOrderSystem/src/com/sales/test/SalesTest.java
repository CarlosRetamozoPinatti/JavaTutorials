package com.sales.test;

import com.sales.*;

public class SalesTest {
    public static void main(String[] args) {
        Product product01 = new Product("Shirt", 50.00);
        Product product02 = new Product("Jeans", 70.00);
        Product product03 = new Product("Shoes", 125.00);

        Order order01 = new Order();
        order01.addProduct(product01);
        order01.addProduct(product02);
        order01.addProduct(product03);
        order01.showOrder();

        Order order02 = new Order();
        order02.addProduct(product02);
        order02.addProduct(product02);
        order02.addProduct(product03);
        order02.addProduct(product01);
        order02.addProduct(product01);
        order02.showOrder();
    }
}
