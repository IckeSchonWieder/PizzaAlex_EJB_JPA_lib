
package de.pizzaalex.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author AWagner
 */

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class MyUser implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String username;
    private String password;
    private String userRole;

    
    
    public MyUser() {
    }

    public MyUser(String username, String userRole) {
        this.username = username;
        this.userID = 0;
        this.password = "";
        this.userRole = userRole;
    }
    
    
    
    public MyUser(int userID, String username, String password, String userRole) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int usID) {
        this.userID = usID;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    
    
    @Override
    public String toString() {
        return "User Nr " + userID + ": " + username 
                + ", PW: " + password + ". Rolle: "+ userRole;
    }
    
    
}
