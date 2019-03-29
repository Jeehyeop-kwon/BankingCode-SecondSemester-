/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import Banking.Account.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jeehyeopkwon
 */
public class Account_Customer_test {
    public static void main(String[] args) {
        
        Customer customer1 = new Customer("Yuki", "Miwa..", "1990-02-01");
        customer1.Address("345", "brigton", "Ontario", "S4F M5F", "700345333");
        customer1.employementInformation("Yes");
        System.out.println(customer1.toString());
        
       /* Account account1 = new Account(customer1, "checking account", 1000.00);
        System.out.println(account1.toString());
        System.out.print(account1.getCustomer().toString()); */
        
        CheckingAccount test = new CheckingAccount(customer1, "checking account", 1000.00);
        System.out.println();
       
        try{
            System.out.println(test.getCustomer().toString() + "\n" + test.toString());
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Please input your overdaft active status(true or false): ");
            test.setOverDraftActive(input.nextBoolean());
            input.nextLine();
            
            System.out.print("Please input your monthly fee( 0< monthlyFees <100) : ");
            test.setMonthlyFees(input.nextDouble());
            input.nextLine();
            
            System.out.print("Please input your OverDraftLimit fee(-2000< overDraftLimit <0) : ");
            test.setOverDraftLimit(input.nextDouble());
            input.nextLine();
            
            System.out.print("Please input your OverDraftLimit fee(0< overDraftFees <100) : ");
            test.setOverDraftFees(input.nextDouble());
            
            System.out.println("Please input your OverDraftInterest fee(0% <= overDraftInterest < 10%) : ");
            test.setOverDraftInterest(input.nextDouble());
            
            System.out.println(test.getCustomer().toString() + "\n" + test.toString());
            
            
        } catch(IllegalArgumentException e){
            
            System.out.println(e.getMessage());

        } catch(InputMismatchException e){
            
            System.out.println("Please input valid characters!!");
        
        } catch(Exception e){
            
            System.out.println("Please input valid characters!!");
        
        } 
        
        
        
        
    }
}
