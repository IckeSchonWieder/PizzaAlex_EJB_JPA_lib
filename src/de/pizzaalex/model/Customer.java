
package de.pizzaalex.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author AWagner
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName="UserID")
@NamedQueries({
    @NamedQuery(name = "query2", query = "SELECT c FROM Customer c")})

public class Customer extends MyUser{
    
   
    private String firstname;
    private String lastname;
    private String street;
    private String postalcode;
    private String city;
    

    public Customer(String firstname, String lastname, String street, 
                 String postalcode, String place, String username) {
        super(username, "customer");
        this.firstname = firstname;
        this.lastname = lastname;
        this.street = street;
        this.postalcode = postalcode;
        this.city = place;
    }

    public Customer() {
        super("", "customer");
        this.firstname = "";
        this.lastname = "";
        this.street = "";
        this.postalcode = "";
        this.city = "";
        
    }

    
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String fullName() {
        return firstname + " " + lastname;
    }
    
    @Override
    public String toString() {
        return firstname + " " + lastname + ", " +
               street + ", " + postalcode + " " + city;
               
    }
    
    
}
