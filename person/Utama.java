/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Utama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Siswa s = new Siswa();
        s.setDataSiswa();
        s.hitungnilAkhir();
        s.HitungNilHuruf();
        s.infoPerson();
    }
}
