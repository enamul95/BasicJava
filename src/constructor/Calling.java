/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author A
 */
public class Calling {
    
    public static void main(String[] args) {
        Abc c1 = new Abc();
        
        Abc c2 = new Abc("Enamul");
        System.out.println("c2 = " + c2.getName());
        
        Abc c3 = new Abc("Enamul",10);
        
        
    }
}
