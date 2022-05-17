package com.ubi.vehicletracker.controller;

public class CopyExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Order orderOne = new Order();
        orderOne.id = 1;
        orderOne.price = 20.22;
        orderOne.product = "Watch";

        Order orderTwo = orderOne; //shallow copy
        orderTwo.id = 2;

        System.out.println(orderOne.id);
        System.out.println(orderTwo.id);

        Order orderThree = orderOne.clone();
        orderOne.id = 3;
        System.out.println(orderOne.id);
        System.out.println(orderThree.id);
    }
}

class Order implements Cloneable {
    int id;
    String product;
    double price;

    //deep copy
    public Order clone() throws CloneNotSupportedException {
        super.clone();
        Order newOrder = new Order();
        newOrder.id = id;
        newOrder.product = product;
        newOrder.price = price;

        return newOrder;
    }
}
