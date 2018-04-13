/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pizzaalex.ejb;

import de.pizzaalex.model.Customer;
import de.pizzaalex.model.MyOrder;
import de.pizzaalex.model.Pizza;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author AWagner
 */

@Remote
public interface DataBeanRemote {
    public List<Customer> getCustomers();
    public Customer storeCustomer(Customer cus);
    
    
    public List<Pizza> getMenuList();
    public Pizza storePizza(Pizza p);
    public void removePizza(Pizza p);
    
    public void storeOrder(MyOrder ord);
    
}
