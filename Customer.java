/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
import java.util.ArrayList;
public class Customer {
    private String password;
    private String username;
    private int customerId;
    ArrayList<Order> orders = new ArrayList<Order>();
    public Customer(int customerId,String password, String username){
        this.customerId = customerId;
        this.password = password;
        this.username = username;
    }

    public boolean Login(String username, String password){
        if(this.username.equals(username)){
            if(this.password.equals(password)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Order> viewOrderHistory(){
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
    public int getCustomerId(){return this.customerId;}
    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}

}
