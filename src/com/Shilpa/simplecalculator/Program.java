/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.simplecalculator;

import com.Shilpa.simplecalculator.Calculations.Calculation;
import com.Shilpa.simplecalculator.Calculations.CalcFactory;
import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         while(true)
       {
           
       System.out.println("Enter your choice[1-8]:");
       System.out.println("1.Add");
       System.out.println("2.Sub");
       System.out.println("3.Div");
       System.out.println("4.Mul");
       System.out.println("5.MAX");
       System.out.println("6.MIN");
       System.out.println("7.POWER");
       System.out.println("8.EXIT");
       int choice=input.nextInt();
       Calculation calc;
       
       switch(choice)
               {
               case 1:
                     calc= CalcFactory.get("Add");
                     calculation(calc);
               break;
               case 2:
                    calc= CalcFactory.get("Sub");
                     calculation(calc);
               break;
               case 3:
                    calc= CalcFactory.get("Mul");
                     calculation(calc);
               break;
               case 4:
                    calc= CalcFactory.get("Div");
                     calculation(calc);
                    break;
               case 5:
                    calc= CalcFactory.get("Max");
                     calculation(calc);
                    break;
               case 6:
                    calc= CalcFactory.get("Min");
                     calculation(calc);
                    break;
               case 7:
                    calc= CalcFactory.get("Power");
                     calculation(calc);
                    break;
              
               case 8:
                   System.exit(0);
               break;
               
               }
       System.out.print("Do you want to continue?(Y/N):");
                    String r=input.next();
                    if(r.equalsIgnoreCase("N")){
                    System.exit(0);
                    }
    }
    
}
    public static void calculation(Calculation calc){
        if(calc!=null){
            int a,b,c;
                     a= calc.inputx();
                     b= calc.inputy();
                     c = calc.operate(a, b);
                     calc.output(c);  }else
                     System.out.println("No Suitable operation");
        
    }
     
       
        
    }
