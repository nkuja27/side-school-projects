/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccount;

import java.util.Scanner;

/**
 *
 * @author Sinomtha
 */
public class TestBAnkAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String name1,name2,name3; 
        Scanner obj=new Scanner(System.in);
   
        BankAccount client1=new BankAccount("oz",0.00,7885547);
          //System.out.println("default values are:\n"+"Name: "+client1.GetName()+"\n"+"Account Number :"+client1.GetAccount()+"\n"+"Balance :"+client1.GetBalance());
          System.out.println("Please enter your name:");
          name1=obj.next();
          client1.SetName(name1);
          System.out.println("Enter the amount to deposit for:"+name1);
          client1.Deposit(500);
           client1.setAccount();
          client1.GetBalance();
         client1.ShowValues();
           System.out.println("Balance after deductions: "+client1.deductMonthlyFee(4.00));
           client1.explainAccountPolicy();
        
        
        BankAccount client2=new BankAccount("nkuja",0.00,855695);
         // System.out.println("default values are:\n"+"Name: "+client2.GetName()+"\n"+"Account Number :"+client2.GetAccount()+"\n"+"Balance :"+client2.GetBalance());
          System.out.println("Please enter your name:");
          name2=obj.next();
          client2.SetName(name1);
          client2.GetName();
          System.out.println("Enter the amount to deposit for:"+name2);
          client2.Deposit(560);
          client2.setAccount();
          client2.GetBalance();
         client2.ShowValues();
         System.out.println("Balance after deductions: "+client2.deductMonthlyFee(4.0));
         client1.explainAccountPolicy();
         
        BankAccount client3=new BankAccount("Sino",0.00,576812);
         //System.out.println("default values are:\n"+"Name: "+client3.GetName()+"\n"+"Account Number :"+client3.GetAccount()+"\n"+"Balance :"+client3.GetBalance());
         System.out.println("Please enter your name:");
         name3=obj.next();
         client3.SetName(name1);
         client3.GetName();
         System.out.println("Enter the amount to deposit for:"+name3);
         client3.Deposit(680);
         client3.setAccount();
         client3.GetBalance();
         client3.ShowValues();
           System.out.println("Balance after deductions: "+client3.deductMonthlyFee(4.0));
          client1.explainAccountPolicy();
          
        BankAccount client4=new BankAccount("tboz",0.00,78975);
         client4.GetName();
         client4.GetBalance();
        client4.ShowValues();
          System.out.println("Balance after deductions: "+client4.deductMonthlyFee(4.0));
          client1.explainAccountPolicy();
    }
    
}
