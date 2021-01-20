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

public class Guru extends Person implements statistical {

    Scanner sc = new Scanner(System.in);
    private int nip;
    private String kelas;
    private String namaMapel;

    public void setDataGuru(String nama, int NIP, String mapel, String kelas) {
        this.nip = sc.nextInt();
        this.kelas = sc.next();
        this.namaMapel = sc.next();
    }

    public void infoPerson() {
        System.out.println("nip = " + this.nip);
        System.out.println("kelas = " + this.kelas);
        System.out.println("nama Mapel" + this.namaMapel);
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
