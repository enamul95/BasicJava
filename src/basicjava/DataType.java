/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author A
 */
public class DataType {
    //byte, short, int, long, float, double, boolean
    
    public static void main(String[] args) {
        int i = 0;
        System.out.println("i = " + i);
        
        String str= "";
        System.out.println("str = " + str);
        
        boolean b = false;
        System.out.println("b = " + b);
        
        int ii = 10;
        long l = i;
        System.out.println("l = " + l);
        
        String amout = "200";        
     
        int amountint = Integer.parseInt(amout);
        
        System.out.println("amountint = " + amountint);
        
        double amountDouble = Double.parseDouble(amout);
        
        System.out.println("amountDouble = " + (amountDouble+10));
        
        
        
    }
}
