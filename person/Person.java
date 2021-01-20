/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author HP
 */
public class Person {

    protected String nama;

    public void Person() {
        System.out.println("ini adalah method utama");
    }

    public void infoPerson() {
        System.out.println("Info Personal");
        System.out.println("nama" + this.nama);
    }
}
