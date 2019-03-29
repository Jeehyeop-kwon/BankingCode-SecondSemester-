/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking.Account;

import Banking.Customer;

/**
 *
 * @author jeehyeopkwon
 */
public class Account {
    
    private Customer customer; //calling the class as variable in another class
    private String accountType;
    private double balance;
    
    public Account (Customer customer, String accountType, double balance){
        this.customer = customer;
        this.accountType = accountType;
        this.balance = balance;
    
    }
      
    public Customer getCustomer(){
        return customer;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getAccountType(){
        return accountType;
    }
    
    public void setBalance(double balance) throws IllegalArgumentException {
        
        if( 0 > balance){
            throw new IllegalArgumentException("Please enter positive number for balance");
        } else {
            this.balance = balance;
        }
    }
    
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
   
    public void deposit (double balance) throws IllegalArgumentException {
        
        if( 0 > balance) {
            throw new IllegalArgumentException("Please enter positive number for balance");
        } else {
            this.balance = getBalance() + balance;
        }
    }
        
     public void withdrawal (double balance) throws IllegalArgumentException {
         
         if( 0 <= balance) {
            throw new IllegalArgumentException("Your balance is 0");
        } else {
            this.balance = getBalance() - balance;
        }
     }
     
     @Override
    public String toString(){
        return ("Your account type : " + accountType +"\n"+
                "Your balance: "+ balance + "\n");
    
   
    }
}
