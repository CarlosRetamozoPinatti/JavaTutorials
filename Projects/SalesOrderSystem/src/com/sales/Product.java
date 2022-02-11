package com.sales;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int prodCount;

    private Product(){
        this.idProduct = ++Product.prodCount;
    }
    public Product(String name, double price){
        this(); //This line calls the private constructor, initializing the id counter.
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
