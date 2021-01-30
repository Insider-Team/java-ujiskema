package Person;

import java.io.IOException;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            String input;
            boolean isLanjut = true;
            while(isLanjut) {
                System.out.println("Program Aplikasi Data Nilai Siswa");
                System.out.println("1.\tMasukkan Data Guru");
                System.out.println("2.\tMasukkan Data Nilai Siswa");
                System.out.println("3.\tTampilkan Data Guru");
                System.out.println("4.\tTampilkan Data Nilai Siswa");
                System.out.println("5.\tKeluar Program");
                input = sc.next();
                switch (input) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    default:
                        System.out.println("fuck you");
                }

                System.out.print("\nUlang?(y/n) ");
                input = sc.next();

            }
    }
}
