
package de.pizzaalex.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author AWagner
 */

@Entity
@Table
public class MyOrder implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "orderID" )
    private List<OrderedItem> items;
    @ManyToOne
    private Customer cus;
    private String ipAddr;
    private String sessId;
    private double total;
    
    
    public MyOrder(Customer cus) {
        this.orderID = 0;
        this.items = new ArrayList();
        this.cus = cus;
        this.sessId = "";
        this.ipAddr = "";
        this.total = 0;
    }

    public MyOrder() {
        this.orderID = 0;
        this.items = new ArrayList<>();
        this.sessId = "";
        this.ipAddr = "";
        this.total = 0;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderId(int id) {
        this.orderID = id;
    }

    public List<OrderedItem> getItems() {
        return items;
    }

    public void setItems(List<OrderedItem> items) {
        this.items = items;
    }

    
    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }
    
    public double getTotal() {
        total = 0;
        for (OrderedItem item:items){
            total += item.getPizza().getPrice();
        }    
        
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getSessId() {
        return sessId;
    }

    public void setSessId(String sessId) {
        this.sessId = sessId;
    }
    
    
    public int getCountByID(int id) {
        for (OrderedItem item:items){
            if (item.getPizza().getPizzaID()== id){
                return item.getCount();
            }
        }
        return 0;
    }
    
    
    public OrderedItem getItemByID(int id) {
        for (OrderedItem item:items){
            if (item.getPizza().getPizzaID()== id){
                return item;
            }
        }
        return null;
    }
    
      
    @Override
    public String toString() {
        String res = "";
        for (OrderedItem item:items) {
            res+= item.getCount() + " mal " + item.getPizza().toString()+ "\n\r";
        }
        
        return res;
    }
    
    
}
