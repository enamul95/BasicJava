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
public class InterfaceImpl implements CrudInterface{

    @Override
    public void save() {
       
    }

    @Override
    public int delete(int id) {
        return 0;
        
    }

    @Override
    public String name() {
        return "Enamul";
    }

    @Override
    public String name(String str) {
       return "Saiful "+str;
    }

    @Override
    public void name(String str, int i) {
        
    }

}
