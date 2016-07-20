/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.simplecalculator.Calculations;
import java.util.Scanner;
/**
 *
 * @author Shilpa
 */
public abstract class Calculation {
    Scanner input= new Scanner(System.in);
     public int inputx()
     {  
         
         System.out.print("Enter x:");
         int x= input.nextInt();
         return x;
                
     }
      public int inputy()
     {  
         
        System.out.print("Enter y:");
         int y= input.nextInt();
         return y;
                
     }
      
     public abstract int operate(int x, int y);
     
     public void output(int o)
     {
         System.out.println("Result:" + o);
     }
}
