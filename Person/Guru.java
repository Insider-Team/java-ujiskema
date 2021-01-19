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
public class Guru extends Person{
	private int nip;
	private String kelas;
	private String namaMapel;

	public void setDataGuru(String nama, int nip, String kelas, String namaMapel){
	this.nama = nama;
	this.nip = nip;
	this.kelas = kelas;
	this. namaMapel = namaMapel;
	}

	public void infoPerson(){
	System.out.println("info person guru");
	System.out.println("nama guru : "+this.nama);
	System.out.println("nip guru : "+this.nip);
	System.out.println("kelas guru : "+this.kelas);
	System.out.println("mapel guru :"+this.namaMapel);
	}

	public String getNamaMapel(){
	return this.namaMapel;
	}

	public String getNamaKelas(){
	return this.kelas;
	}
}
