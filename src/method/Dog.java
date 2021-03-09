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
public class Dog {

    public String color() {
        return "White";
    }

    public DogModel getDog() {
        DogModel model = new DogModel();
        model.setColor("Red");
        model.setGender("Femal");
        model.setAge(2);
        model.setHeight(3);
        return model;

    }

    //Parameter Pass
    public DogModel dogNumber(int i) {
        DogModel model = new DogModel();
        model.setAge(2);
        model.setHeight(3);
        model.setCount(i * 3);
        return model;

    }
    
    //Pass object
     public DogModel passObject(DogModel dm) {
        DogModel model = new DogModel();
        model.setAge(dm.getAge()*3);
        model.setHeight(3);
        model.setCount(dm.getCount()*3);
        return model;

    }

}
