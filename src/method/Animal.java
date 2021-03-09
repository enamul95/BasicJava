/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author A
 */
public class Animal {

    public static void main(String[] args) {

        //object of Dog class
        Dog d = new Dog();

        // String dd = d.color();
        // System.out.println("color = " + dd);
        DogModel dm = d.getDog();
        String color = dm.getColor();
        int age = dm.getAge();

        //System.out.println("dog color = " + color);
        // System.out.println("age = " + age);
        DogModel dc = d.dogNumber(3);
        System.out.println("age = " + dc.getCount());

        
        DogModel dmObj = new DogModel();
        dmObj.setCount(4);
        dmObj.setAge(7);
        DogModel passObject = d.passObject(dmObj);
        System.out.println("passObject = " + passObject.getAge());
        System.out.println("passObject = " + passObject.getCount());
        /*
        DogModel dogModel = dog.getDog();
        String color=   dogModel.getColor();
        System.out.println("color = " + color);
        String gender = dogModel.getGender();
        System.out.println("gender = " + gender);
         */
    }
}
