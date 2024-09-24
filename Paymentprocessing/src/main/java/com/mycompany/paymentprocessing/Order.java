/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentprocessing;

/**
 *
 * @author ABUBAKAR
 */
class Order {
    private String product;
    private double price;

public Order(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public void completeOrder() {
  Payment a=new Payment();
       
        a.processPayment(price);
        System.out.println("Order for " + product + " has been completed.");
    }
}
