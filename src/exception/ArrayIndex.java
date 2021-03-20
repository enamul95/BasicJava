/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author A
 */
public class ArrayIndex {

    public static void main(String[] args) {
        /*try{
            // write logic here
        }catch( Exception e){
        }
        */
        
        try {
            
            int remainder = 3 / 0;
            System.out.println("remainder = " + remainder);
            
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
