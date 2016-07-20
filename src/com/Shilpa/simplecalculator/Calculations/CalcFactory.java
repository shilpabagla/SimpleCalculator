/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.simplecalculator.Calculations;

/**
 *
 * @author Shilpa
 */
public class CalcFactory {
     public static Calculation get(String key){
    if(key.equalsIgnoreCase("ADD")){
    return new Add();
    }else if(key.equalsIgnoreCase("SUB")){
    return new Sub();
    }else if(key.equalsIgnoreCase("MUL")){
    return new Mul();
    }else if(key.equalsIgnoreCase("DIV")){
    return new Div();
    }else if(key.equalsIgnoreCase("MAX")){
    return new Max();
    }else if(key.equalsIgnoreCase("MIN")){
    return new Min();
    }else if(key.equalsIgnoreCase("POWER")){
    return new Power();
    }
    else
        return null;
        
    }
}
