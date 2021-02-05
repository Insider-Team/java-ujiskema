package Person;

import java.util.Scanner;
public class Utama {

    private static String nama;

    public static void main(String[] args) {
        
        /*..::: HEADER :::..*/
        System.out.println("!...:::::::::::::::::::::::::::::::::::::::::::::::::...!");
        System.out.println("==================| SMKN 1 BONDOWOSO |===================");
        System.out.println("===================| UJISKEMA PBO 2021 |====================");
        System.out.println("!...::::::::::::::::::::::::::::::::::::::::::::::::::...!");
        
        /*..::: MENAMPILKAN ERROR OPSI MENU :::..*/
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
        //System.out.println("");
        
        /*..::: TAMPILAN OPSI MENU :::..*/
        System.out.println("..:::||| PROGRAM UTAMA UJISKEMA2020 |||:::...");
        System.out.println("1. Masukkan Data Guru");
        System.out.println("2. Masukkan Data Nilai Siswa");
        System.out.println("3. Tampilkan Data Guru");
        System.out.println("4. Tampilkan Data Nilai");
        System.out.println("5. Pengurutan Data Siswa");
        System.out.println("6. Pencarian Data Siswa");
        System.out.println("7. Keluar Program");
        System.out.println(".........:::::::::::::::::::::::::::::::.........");
        System.out.println();
            
            Scanner pilihKodeMenu = new Scanner(System.in);
            System.out.print("Masukan Kode Opsi Menu : ");
            int opsiMenu = pilihKodeMenu.nextInt();

            /*..::: PROSES MENAMPILKAN INPUTAN DARI OPSI MENU :::..*/
            switch(opsiMenu){
                case 1 :
                    //Set data guru
                    objGuru0.setDataGuru("John Roger",20185277,"Bahasa Jepang","\tXII");
                    objGuru1.setDataGuru("Rempal Smith",20182003,"Olahraga","\tXII");
                    objGuru2.setDataGuru("Reza Ranco",20181999,"Perbankan","\tXII");

                    System.out.println("Data berhasil dimasukkan dengan cara set!");
                    break;
                case 2:
                    /*..::: INPUT DATA NILAI SISWA :::..*/       
                    objSiswa.inputDataNilaiSiswa();
                    System.out.println("DATA BERHASIL DIMASUKKAN"); 
                    break;
                case 3 :
                    System.out.println("NAMA\t\tNIP\t\tMAPEL\t\t\tKELAS");
                    /*..::: VIEW DATA GURU :::..*/
                    objGuru0.infoPerson();
                    objGuru1.infoPerson();
                    objGuru2.infoPerson();
                    System.out.println("");
                    break;
                case 4:
                    /*..::: VIEW DATA NILAI SISWA :::..*/
                    System.out.println("");
                    objSiswa.infoPerson();
                    System.out.println("");
                    break;
                case 5:
                    /*..::: SORTING DATA NILAI :::..*/
                    objSiswa.sortingDataNilaiSiswa();
                    break;
                case 6:
                    /*..::: SEARCHING DATA NILAI BERDASAR NAMA :::..*/
                    objSiswa.searching();
                    break;
                case 7:
                    /*..::: EXIT :::..*/
                    System.exit(0);
                    break;
            }
        }while(true);
    }
    
}
