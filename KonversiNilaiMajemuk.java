/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi.nilai.majemuk;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class KonversiNilaiMajemuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int nilaiAngka;
        System.out.println("Program Konversi Nilai");
        System.out.print("Masukkan Nilai Angka : ");
        nilaiAngka = s.nextInt();
        if(nilaiAngka >= 80 && nilaiAngka <= 100){
            System.out.println("A");
        }else if(nilaiAngka >= 70 && nilaiAngka < 80){
            System.out.println("B");
        }else if(nilaiAngka >= 60 && nilaiAngka < 70){
            System.out.println("C");
        }else if(nilaiAngka >= 50 && nilaiAngka < 60){
            System.out.println("D");
        }else System.out.println("E");
    }
    
}
