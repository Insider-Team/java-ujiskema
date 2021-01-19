/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;
import Interface.Statistical;
/**
 *
 * @author JackNight
 */

import java.util.Scanner;
public class Siswa extends Person implements Statistical{
	Scanner s = new Scanner(System.in);	

	private int nis;
	private int nilUTS;
	private int nilUAS;
	private double nilAkhir;
	private String nilHuruf;
	private double bbtUTS;
	private double bbtUAS;

	public void setDataSiswa(int nis, String nama, int nilUTS, int nilUAS){
	this.nis = nis;
	this.nama = nama;
	this.nilUTS = nilUTS;
	this.nilUAS = nilUAS;
	}

	public void setDataSiswa(){
	this.nis = s.nextInt();
	this.nama = s.next();
	this.nilUTS = s.nextInt();
	this.nilUAS = s.nextInt();
	}
        
        public void hitungNilAkhir(){
        this.nilAkhir = (this.nilUAS+this.nilUTS)/2;
        }
        
        public double getNilAkhir(){
        return this.nilAkhir;
        }
        
        public void infoPerson(){
        System.out.println("info person siswa");
	System.out.println("nama siswa : "+this.nama);
	System.out.println("nis siswa : "+this.nis);
	System.out.println("nilai UTS siswa : "+this.nilUTS);
	System.out.println("nilai UAS siswa : "+this.nilUAS);
        System.out.println("nilai Akhir siswa : "+this.nilAkhir);
        System.out.println("bbtUTS siswa : "+this.bbtUTS);
        System.out.println("bbtUAS siswa : "+this.bbtUAS);
        }
        
        @Override
        public double hitungRerata(Siswa data[]){
            return 0;
        
        }
        
        public String hitungNilHurud(){
            return null;
        }
        
        @Override
        public void sorting(Siswa data1[]){
            
        }
        
        @Override
        public void searching(Siswa data2[]){
        
        }
}
