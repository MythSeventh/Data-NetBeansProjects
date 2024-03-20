/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun.datar;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class BangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program Menghitung Luas");
        System.out.println("1. Persegi\n2. Segitiga");
        System.out.print("3. Lingkaran\nPilihan Anda = ");
        byte pilih = s.nextByte();
        switch(pilih){
            case 1: System.out.print("Masukkan Sisi = ");
                    int sisi = s.nextInt();
                    System.out.println("Luas = "+(sisi*sisi));
                    break;
            case 2: System.out.print("Masukkan Alas = ");
                    int alas = s.nextInt();
                    System.out.print("Masukkan Tinggi = ");
                    int tinggi = s.nextInt();
                    System.out.println("Luas = "+(0.5*alas*tinggi));
                    break;
            case 3: System.out.print("Masukkan Jari-jari = ");
                    int jari = s.nextInt();
                    System.out.println("Luas = "+(3.14*jari*jari));
                    break;
            default: System.out.println("Pilihan Tidak Ada");
        }
    }
    
}
