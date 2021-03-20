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
public class Dog {

    protected void dogPlays() {
        System.out.println("Dogs plays");
        //dogEats();
    }

    public void dogEats() {
        System.out.println("Dogs Eats");
    }

    public int countNumber() {
        
        int a = 10;
        int b = 20;
        
        return a + b;
    }
    
    public String getStr(){    
        return "Enamul";
    }
    
    public boolean getBol(){    
        return true;
    } 

}
