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
public class CheckingAccount extends Account {
    
    private double monthlyFees;
    private double overDraftLimit;
    private double overDraftFees;
    private double overDraftInterest;
    private boolean overDraftActive;
    
    public CheckingAccount (Customer customer, String accountType, double balance){
        super(customer, accountType, balance);
    }
    
    public CheckingAccount (double monthlyFees, double overDraftLimit, double overDraftFees, 
           double overDraftInterest, Customer customer, String accountType, double balance){
        super(customer, accountType, balance);
      
        setMonthlyFees(monthlyFees);
        setOverDraftLimit(overDraftLimit);
        setOverDraftFees(overDraftFees);
        setOverDraftInterest(overDraftInterest);
      
    }
    public boolean getOverDraftActive() {
        
            return overDraftActive;
    }
    
    public void setOverDraftActive(boolean overDraftActive) {
        
            this.overDraftActive = overDraftActive;
    }
    
    public double getMonthlyFees(){
        return monthlyFees;
    }
    
    public void setMonthlyFees(double monthlyFees){
       
      if(!(0 <= monthlyFees && monthlyFees < 100)){
            throw new IllegalArgumentException("monthlyFees should be 0< monthlyFees <100");
        } else {
            this.monthlyFees = monthlyFees;
        }
    }
    
    public double getOverDraftLimit(){
        return overDraftLimit;
    }
    
    public void setOverDraftLimit(double overDraftLimit){
        if(!(overDraftLimit >= -2000 && overDraftLimit <= 0)){
            throw new IllegalArgumentException("monthlyFees should be -2000< overDraftLimit <0");
        } else {
            this.overDraftLimit = overDraftLimit;
        }
    }
    public double getOverDraftFees(){
        return overDraftFees;
    }
    
    public void setOverDraftFees(double overDraftFees){
        if(!(0 <= overDraftFees && overDraftFees < 100)){
            throw new IllegalArgumentException("overDraftFees should be 0< overDraftFees <100");
        }
        this.overDraftFees = overDraftFees;
    }
    
    public double getOverDraftInterest(double overDraftInterest){
        return overDraftInterest;
    }
    public void setOverDraftInterest(double overDraftInterest){
        if(!(0 <= overDraftInterest && overDraftInterest < 10)){
            throw new IllegalArgumentException("overDraftFees should be 0% <= overDraftInterest < 10%");
        }
        this.overDraftInterest = overDraftInterest;
    }
    /*
    @Override
     public void deposit (double balance) throws IllegalArgumentException {
        
        if( 0 > balance) {
            throw new IllegalArgumentException("Please enter positive number for balance");
        } else {
            super.getBalance();
        }
    }
     
    @Override
     public double withdrawal (double balance) throws IllegalArgumentException {
         
         if( 0 <= balance) {
            throw new IllegalArgumentException("Your balance is 0");
        } else {
            return this.balance = getBalance() - balance;
        }
     }
    */
    @Override
    public String toString(){
        return ("Your account type: " + getAccountType() +"\n"+
                "Your balance: "+ getBalance() + "\n"+
                "Your monthly fees: "+ monthlyFees + "\n"+
                "Your overdraft limit: "+ overDraftLimit + "\n"+
                "Your overdraft fees: "+ overDraftFees + "\n"+
                "Your overdraft interest: "+ overDraftInterest + "\n"+
                "Your overdraft active: "+ overDraftActive + "\n"
                );
    
   
    }
}
