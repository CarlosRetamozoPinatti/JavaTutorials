package com.computerproperties;

public class Order {
    private final int idOrder;
    private FullComputer fullComputer[];
    private static int orderCount;
    private static final int MAX_PCS = 10;
    private int pcList;

    public Order(){
        this.idOrder = ++Order.orderCount;
        this.fullComputer = new FullComputer[MAX_PCS];
    }

    public void addPc(FullComputer fullComputer){
        if(this.pcList < Order.MAX_PCS){
            this.fullComputer[this.pcList++] = fullComputer;

        }
        else {
            System.out.println("Limit Exceeded");
        }
    }

    public void showOrder(){
        System.out.println("Order #: " + this.idOrder);
        System.out.println("Computers in the order #: " + this.idOrder);
        for (int i = 0; i < this.pcList; i++){
            System.out.println(this.fullComputer[i]);

        }
    }
    
}
