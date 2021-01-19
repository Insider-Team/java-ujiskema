/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author JackNight
 */
public class Person{
	protected String nama;

	public Person(){
	System.out.println("class parrent PersonPerson");
	}

	public void infoPerson(){
	System.out.println("info person");
	System.out.println("nama : "+this.nama);
	}
}
