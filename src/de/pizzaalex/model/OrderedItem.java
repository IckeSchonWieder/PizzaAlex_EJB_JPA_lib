/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pizzaalex.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author AWagner
 */
@Entity
@Table
public class OrderedItem implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;
    
    @ManyToOne(targetEntity = MyOrder.class)
    @JoinColumn(name = "orderID" )
    private MyOrder order;
    @ManyToOne
    @JoinColumn(name = "pizzaID" )
    private Pizza pizza;
    private int count;

    public OrderedItem(Pizza pizza, int count) {
        this.pizza = pizza;
        this.count = count;
        
    }

    public OrderedItem() {
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

   

    public MyOrder getOrder() {
        return order;
    }

    public void setOrder(MyOrder order) {
        this.order = order;
    }
        

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double subTotal() {
        return this.count*this.pizza.getPrice();
    }
    
    
}
