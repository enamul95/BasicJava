/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_interface;

/**
 *
 * @author A
 */
public class CallingInterface {
    
    public static void main(String[] args) {
        
        InterfaceImpl impl = new InterfaceImpl();
        String name = impl.name();
        System.out.println("name = " + name);
        
        String name1 = impl.name("ABC");
        System.out.println("name1 = " + name1);
    }
}
