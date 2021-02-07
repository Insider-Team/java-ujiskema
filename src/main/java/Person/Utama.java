package Person;

import java.util.Scanner;
public class Utama {

    private static String nama;

    public static void main(String[] args) {

        try{
            pilihanMenu();
       }catch (Exception e){
            System.out.println("Harap Masukan Pilihan Berupa Angka Sesuai Dengan Opsi Menu !");
            pilihanMenu();
       }
    }
    
    public static void pilihanMenu(){
        Guru objGuru0 = new Guru();
        Guru objGuru1 = new Guru();
        Guru objGuru2 = new Guru();
        Siswa objSiswa = new Siswa();  
        System.out.println("");
        
        do{
        System.out.println("===== PROGRAM UTAMA =====");
        System.out.println("1. Masukkan Data Guru");
        System.out.println("2. Masukkan Data Nilai Siswa");
        System.out.println("3. Tampilkan Data Guru");
        System.out.println("4. Tampilkan Data Nilai");
        System.out.println("5. Keluar Program");
        System.out.println("=========================");
        System.out.println();
            
            Scanner pilihKodeMenu = new Scanner(System.in);
            System.out.print("Masukan Kode Opsi Menu : ");
            int opsiMenu = pilihKodeMenu.nextInt();

            switch(opsiMenu){
                case 1 :
                    //Set data guru
                    objGuru0.setDataGuru("Gayudh",20185269,"Bahasa Jepang","\tXII");
                    objGuru1.setDataGuru("Albert Smith",20182420,"Olahraga","\tXII");
                    objGuru2.setDataGuru("Asyuw Ranco",20181999,"Perbankan","\tXII");

                    System.out.println("Data berhasil dimasukkan dengan cara set!");
                    break;
                case 2:
                    objSiswa.inputDataNilaiSiswa();
                    System.out.println("DATA BERHASIL DIMASUKKAN"); 
                    break;
                case 3 :
                    System.out.println("NAMA\t\tNIP\t\tMAPEL\t\t\tKELAS");
                    objGuru0.infoPerson();
                    objGuru1.infoPerson();
                    objGuru2.infoPerson();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    objSiswa.infoPerson();
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
    
}
