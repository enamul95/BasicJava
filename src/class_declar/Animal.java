/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_declar;

/**
 *
 * @author A
 */
public class Animal {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogPlays();
        dog.dogEats();
        
       int countValue =  dog.countNumber();
       
        System.out.println((countValue+10));
        
      String str =  dog.getStr();
        System.out.println("str = " + str);
        
      boolean b =  dog.getBol();
        System.out.println("b = " + b);
        
    }
}
