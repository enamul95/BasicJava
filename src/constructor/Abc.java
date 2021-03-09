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
public class Abc {

    private String name;

    public Abc() {
    }

    public Abc(String name) {
        this.name = name;
    }

    public Abc(String name, int i) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
