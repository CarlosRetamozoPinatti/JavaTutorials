package com.sales;

public class Order {
    private int idOrder;
    private Product products[];
    private static int orderCount;
    private int prodCountTotal;
    private static final int MAX_PRODS = 10;

    public Order(){
        this.idOrder = ++Order.orderCount;
        this.products = new Product[Order.MAX_PRODS];
    }

    public void addProduct(Product product){
        if(this.prodCountTotal < Order.MAX_PRODS){
            this.products[prodCountTotal++] = product;
        }
        else {
            System.out.println("List Completed...");
        }
    }
    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < this.prodCountTotal; i++){
            Product product = this.products[i];
            total += product.getPrice();
            //another way to code it: total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder(){
        System.out.println("order ID = " + this.idOrder);
        double orderTotal = this.calculateTotal();
        System.out.println("order Total: $" + orderTotal);
        System.out.println("order Products: ");
        for (int i = 0; i < this.prodCountTotal; i++){
            System.out.println(this.products[i]);
        }

    }
}
