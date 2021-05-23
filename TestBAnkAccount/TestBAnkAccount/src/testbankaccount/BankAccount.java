/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccount;

/**
 *
 * @author Sinomtha

 */

import java.security.SecureRandom;
import java.util.Scanner;
public class BankAccount {
    
     private String name;
  private double balance;
  protected int account_number;
  
  public BankAccount(String name, double balance,int account_number ){//constructor
     
      this.balance=balance;
      this.name=name;
      this.account_number=account_number;
         
  }
  public void SetName(String name){
     
  
      this.name=name;
      
  }
  public String GetName(){
  
      
      return name;
  }
  public double deductMonthlyFee(double monthlyfee){
  
     int k =1;
     do{balance-=4.0;
        
     k++;
        return balance;    
     }while(k<=12);
    
  
  }
  public void explainAccountPolicy(){
  
      System.out.println("Please note an amount of R4.00 will be deducted from your account monthly.");
  }
  public void Deposit( double amount){
      
      if(amount!=0){
      
      Scanner in= new Scanner(System.in);
      System.out.println("");
      amount= in.nextInt();
      
      
      balance+=amount;
      
      }
    
      
 
  }
  public double Withdraw(double balance,int amount){
  
      Scanner in=new Scanner(System.in);
      System.out.println("Amount You Wish To Withdraw:");
      amount=in.nextInt();
      
      if(balance>=amount){
      
          balance-=amount;
          System.out.println(amount+"Successfully Withdrawn,Balance is:"+balance);
      }
      
      else
          System.out.println("Invalid Funds try an amount less than:"+balance);
      
     
      return this.balance;
  }
  public void setAccount(){
  
      
      SecureRandom account= new SecureRandom();
       
          this.account_number= 1+account.nextInt(7); 
      
  }
  public int GetAccount(){
     
     
   return account_number;
      
  }
  public double GetBalance(){

 
      return balance;
  }
  public void ShowValues(){
  
      System.out.println("Name:"+" "+name);
      
      System.out.print("Account number:");
      
      for (int i=0;i<8;i++){
  
          System.out.print(account_number);
      
  }
      System.out.println(" ");
      
     System.out.println("Balance: "+balance);
  }
    
    
}
