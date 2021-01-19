/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import interface1.statistical;
/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Siswa extends Person implements statistical {

    Scanner sc = new Scanner(System.in);
    private int NIS;
    private int nilUTS;
    private int nilUAS;
    private double nilAkhir;
    private String nilHuruf;
    private double bbtUTS;
    private double bbtUAS;

    public void setDataSiswa(int nis, String nama, int nilUTS, int nilUAS) {
        this.NIS = nis;
        this.nama = nama;
        this.nilUTS = nilUTS;
        this.nilUAS = nilUAS;
    }

    public void setDataSiswa() {
        System.out.println("Masukkan NIS = ");
        this.NIS = sc.nextInt();
        System.out.println("Masukkan Nama = ");
        this.nama = sc.next();
        System.out.println("Masukkan Nilai UTS = ");
        this.nilUTS = sc.nextInt();
        System.out.println("Masukkan Nilai UAS = ");
        this.nilUAS = sc.nextInt();
    }

    public void hitungnilAkhir() {
        this.nilAkhir = (this.nilUTS + this.nilUAS) / 2;
    }

    public double getnilAkhir() {
        return this.nilAkhir;
    }

    public void HitungNilHuruf() {
        if (nilAkhir >= 90) {
            nilHuruf = "predikat A";
        } else if (nilAkhir >= 80) {
            nilHuruf = "predikat B";
        } else if (nilAkhir >= 70) {
            nilHuruf = "predikat C";
        } else if (nilAkhir >= 60) {
            nilHuruf = "predikat D";
        } else {
            nilHuruf = "prekdikat E";
        }
    }

    @Override
    public void infoPerson() {
        System.out.println("Nisn = " + this.NIS);
        System.out.println("Nilai UTS = " + this.nilUTS);
        System.out.println("Nilai UAS = " + this.nilUAS);
        System.out.println("Nilai Akhir = " + this.nilAkhir);
        System.out.println("Nilai Huruf = " + this.nilHuruf);
        System.out.println("bbtUTS " + this.bbtUTS);
        System.out.println("bbtUAS " + this.bbtUAS);
    }

    @Override
    public double HitungRatarata(Siswa[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sorting(Siswa[] data1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Searching(Siswa[] data2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
