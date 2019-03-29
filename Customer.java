/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;
import java.util.Scanner;

/**
 *
 * @author jeehyeopkwon
 */
public class Customer {
    
    private String clientFirstName;
    private String clientLastName;
    private String dateOfBirth;
    
    public Customer(String clientFirstName, String clientLastName, String dateOfBirth){
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getClientFirstName(){
        return clientFirstName;
    }
    
    public String getClientLastName(){
        return clientLastName;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public void setClientFirstName(String clientFirstName){
        if(!clientFirstName.matches("[a-zA-z]+")){
            throw new IllegalArgumentException("Please enter alphabets only for first name");
        } else {
            this.clientFirstName = clientFirstName;
        }
    }
    
    public void setClientLastName(String clientLastName){
        if(!clientLastName.matches("[a-zA-z]+")){
            throw new IllegalArgumentException("Please enter alphabets only for first name");
        } else {
            this.clientLastName = clientLastName;
        }
        
    }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    private String streetNo;
    private String streetName;
    private String province;
    private String postal;
    private String phNumber;
    
    public void Address(String streetNo, String streetName, String province, String postal, String phNumber){
       this.streetNo = streetNo;
       this.streetName = streetName;
       this.province = province;
       this.postal = postal;
       this.phNumber = phNumber;
       
    }
    
    public void setStreetNo (String streetNo){
        
        if(!streetNo.matches("[0-9]+")){
            System.out.println("Please, Use Number for street number");
        } else {
            this.streetNo = streetNo;
        }
        
    }
    
    public void setStreetName (String streetName){
        if(!streetName.matches("[a-zA-z]+")){
            System.out.println("Please, Use letters for street name");
        } else {
            this.streetName = streetName;
        }
        
    }
    
    public void setProvince (String province){
         if(!province.matches("[a-zA-z]+")){
            System.out.println("Please, Use letters for province");
        } else {
            this.province = province;
        }
    }
    
    public void setPostal (String postal){
        if(!postal.matches("[a-zA-z[0-9]]+")){
            System.out.println("Please, Use letters and numbers for postal");
        } else {
            this.postal = postal;
        }
        
    }
    
    public void setPhoneNumber (String phNumber){
        if(!phNumber.matches("[0-9]+")){
            System.out.println("Please, Use Number for phone number");
        } else {
            this.phNumber = phNumber;
        }
        
    }
    
    private String employed;
    private String employerName;
    
    public void employementInformation (String employeeStatue){
        
        if(employeeStatue.equals("Yes")){
            
            Scanner input = new Scanner(System.in);
            System.out.print("Please input your employer : ");
            String employer = input.nextLine();
            employerName = employer;
        } else {
            employed = "No";
        }
        
    }
    
     public String getEmployed(){
        return employed;
    }
     
     public String getEmployerName(){
        return employerName;
    }
     
    public void setEmployed (String employed){
        if(!employed.matches("[a-zA-z]+")){
            System.out.println("Please, only use letters");
        } else {
            this.employed = employed;
        }
        
    }
    
    public void setEmployerName (String employerName){
        if(!employerName.matches("[a-zA-z]+")){
            throw new IllegalArgumentException("Please enter alphabets only for employer name");
        } else {
            this.employerName = employerName;
        }
        
    }
    
    @Override
    public String toString(){
        return ("First name : "+ clientFirstName + "\n"+
                "Last name : "+ clientLastName + "\n"+
                "dateOfBirth : "+ dateOfBirth + "\n"+
                "Street numner : "+ streetNo + "\n"+
                "Street name : " + streetName + "\n"+
                "Province : " + province + "\n"+
                "Phone number : "+phNumber + "\n"+
                "Employement statue : "+ employed + "\n"+
                "Employer name : "+ employerName + "\n");
    
    }
    
}
