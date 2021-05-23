/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiling;

import java.util.Scanner;

/**
 *
 * @author royla
 */
public class Boiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("give in temperature:");
      Scanner sc= new Scanner(System.in);
      int temp= sc.nextInt();
      if (temp>=100){
          System.out.println("the temperature is boiling hot");
      }
      else if(temp<=0){
          System.out.println("the temperature freezing");
      }else {
          System.out.println("the temperature is norrmal");
      }
    }
}
    
