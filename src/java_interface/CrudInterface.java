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
public interface CrudInterface {

    public void save();

    int delete(int id);

    String name();

    String name(String str);

    void name(String str, int i);

}
