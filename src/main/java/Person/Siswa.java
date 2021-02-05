package Person;

import Interface.Statistical;
import java.util.Scanner;
public class Siswa extends Person implements Statistical {
  private int NIS;
  private int nilUTS;
  private int nilUAS;
  private double nilAkhir;
  private String nilHuruf;
  private final double bbtUTS = 0.4;
  private final double bbtUAS = 0.6;
  int jmlData;
  Siswa[] data = new Siswa[2];

  public void inputDataNilaiSiswa(int NIS, String nama, int nilUTS, int nilUAS) {
    this.NIS = NIS;
    this.nama = nama;
    this.nilUTS = nilUTS;
    this.nilUAS = nilUAS;
  }

  public void inputDataNilaiSiswa() {
    System.out.print("Input data siswa :")
    Scanner ambilData = new Scanner(System.in);
    try {
      System.out.print("Masukan Jumlah Data Yang Ingin Anda Input : ");
      jmlData = ambilData.nextInt();
      data = new Siswa[jmlData];
      for (int i = 0; i < data.length; i++) {
        data[i] = new Siswa();

        System.out.println();
        System.out.println("!...::::::::::::::::::::::::::::::...!");
        System.out.println("Data Siswa Ke : " + (i + 1));

        //Menangani kesalahan dengan tetap memposisikan kursor
        //di tempat masukan
        boolean statusNIS = false;
        while (!statusNIS) {
          try {
            System.out.print("Masukkan NIS = ");
            data[i].NIS = ambilData.nextInt();
            statusNIS = true;
          } catch (Exception e) {
            System.out.println("NIS Wajib Berupa Huruf !");
            ambilData.next();
          }
        }

        System.out.print("Masukkan Nama = ");
        data[i].nama = ambilData.next();
        System.out.print("Masukkan Nilai UTS = ");
        data[i].nilUTS = ambilData.nextInt();
        System.out.print("Masukkan Nilai UAS = ");
        data[i].nilUAS = ambilData.nextInt();
      }
      hitungNilAkhir();
      hitungNilHuruf();

    } catch (Exception e) {
      System.out.println("Masukan Tidak Sesuai");
    }
  }

  public void hitungNilAkhir() {
    for (Siswa data1: data) {
      data1.nilAkhir = (data1.bbtUTS * data1.nilUTS) + (data1.bbtUAS * data1.nilUAS);
    }
  }

  public double getNilAkhir() {
    return nilAkhir;
  }

  //Mengoverride method infoPerson di class Siswa
  @Override
  public void infoPerson() {
    try {
      System.out.println();
      System.out.println("!...::::: DATA NILAI SISWA :::::...!");
      System.out.println("Nama Kelas\t : XII Rekayasa Perangkat Lunak");
      System.out.println("Nama Mapel\t : Bahasa Indonesia");
      System.out.println("Bobot Nil UTS\t : 0.4\t Bobot N UAS : 0.6");

      System.out.println();
      System.out.println("-------------------------------------------------------------------------------------------------");
      System.out.println("|\tNIS\t |" + "\tNAMA\t |" + "\tN.UTS\t |" + "\tN.UAS\t |" + "\tN.Akhir\t |" + "\tN.Huruf" + "\t    |");
      System.out.println("-------------------------------------------------------------------------------------------------");
      for (Siswa data1: data) {
        System.out.print("|\t" + data1.NIS + "\t\t" + data1.nama + "\t\t  " + data1.nilUTS + "\t\t  " + data1.nilUAS + "\t\t  " + data1.nilAkhir + "\t\t" + data1.nilHuruf + "\t    |");
        System.out.println("");
      }
      System.out.print("-------------------------------------------------------------------------------------------------");
      System.out.print("O> Rata - Rata \t: " + nilaiRataRata());
      System.out.println("");
    } catch (Exception e) {
      System.out.println("Maaf, data masih kosong!");

    }
  }

  /**
   * 
   * @param nilAkhir 
   */
  public void setNilAkhir(double nilAkhir) {
    this.nilAkhir = nilAkhir;
  }

  public String getNilHuruf() {
    return nilHuruf;

  }

  /**
   * 
   * @param nilHuruf 
   */
  public void setNilHuruf(String nilHuruf) {
    this.nilHuruf = nilHuruf;
  }

  /**
   * 
   * @param data
   * @return 
   */
  public double nilaiRataRata(Siswa data[]) {

    return 0;
  }

  @Override
  public double nilaiRataRata() {
    try {
      double rataRata = 0;
      for (Siswa data1: data) {
        rataRata = rataRata + data1.nilAkhir;
        System.out.println("");
      }
      rataRata = rataRata / data.length;
      return rataRata;
    } catch (Exception e) {
      System.out.println("Ada Kesalahan Penghitungan");
    }
    return 0;
  }

  public String hitungNilHuruf() {

    for (Siswa data1: data) {
      if (data1.nilAkhir > 90) {
        data1.nilHuruf = "A(SANGAT BAIK)";
      } else if (data1.nilAkhir > 80) {
        data1.nilHuruf = "B(BAIK)";
      } else if (data1.nilAkhir > 70) {
        data1.nilHuruf = "C(CUKUP)";
      } else {
        // (data[i].nilAkhir <70){
        data1.nilHuruf = "K(KURANG)";
      }
    }
    return nilHuruf;
  }

  public static void testing() {

  }

  //Mengoverride method sorting untuk pengurutan data nilai siswa
  @Override
  public void sortingDataNilaiSiswa() {
    //Menampilkan data nilai yang sudah diipunkan
    System.out.println("Nilai Sebelum diurutkan : ");
    for (Siswa data1: data) {
      System.out.println(data1.nilAkhir);
    }
    System.out.println("");

    System.out.println("Nilai Setelah diurutkan : ");
    for (int i = 0; i < data.length; i++) {
      for (int y = 0; y < data.length; y++) {
        if (i == y) {} else {
          if (data[i].nilAkhir > data[y].nilAkhir) {
            double temp = data[y].nilAkhir;
            data[y].nilAkhir = data[i].nilAkhir;
            data[i].nilAkhir = temp;
          }
        }
      }
    }
    for (Siswa data1: data) {
      System.out.println(data1.nilAkhir);
    }
    System.out.println("");
    System.out.println("");

  }

  @Override
  public void searching() {
    //Menampilkan data nilai yang sudah diipunkan
    Scanner ambilData = new Scanner(System.in);
    System.out.print("Masukkan nama pencarian : ");
    nama = ambilData.next();
    for (Siswa data1: data) {
      if (data1.nama == null ? nama == null : data1.nama.equals(nama)) {
        System.out.println("HASIL PENCARIAN : ");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|\tNIS\t |" + "\tNAMA\t |" + "\tN.UTS\t |" + "\tN.UAS\t |" + "\tN.Akhir\t |" + "\tN.Huruf" + "\t    |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.print("|\t" + data1.NIS + "\t\t" + data1.nama + "\t\t  " + data1.nilUTS + "\t\t  " + data1.nilUAS + "\t\t  " + data1.nilAkhir + "\t\t" + data1.nilHuruf + "\t    |");
        System.out.println("");
      } else {
        System.out.println("HASIL TIDAK ADA");
      }
    }
    System.out.println("");
  }
}