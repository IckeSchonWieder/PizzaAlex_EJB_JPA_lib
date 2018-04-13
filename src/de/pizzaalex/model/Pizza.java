
package de.pizzaalex.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author AWagner
 */

@Entity
@Table
public class Pizza implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pizzaID;
    private String name;
    private double price;

    
    /**
     * Full constructor to create a new pizza.
     * @param name Name of the pizza.
     * @param price Price of the pizza.
     */
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /**
     * Second constructor to create a new pizza. Price is set to default value of 5.99.
     * @param name Name of the pizza.
     */
    public Pizza(String name) {
        this.name = name;
        this.price = 5.99;
    }
    
    /**
     * Standard Constructor. Price is set to default of 5.99
     */
    public Pizza() {
        this.price = 5.99;
    }

    public int getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(int pizzaId) {
        this.pizzaID = pizzaId;
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
        return "Nr: "+ pizzaID + ", "+ name+ ", Preis: " + price;
    }

    
}
