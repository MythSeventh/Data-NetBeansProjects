/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi.nilai.salah;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class KonversiNilaiSalah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int nilaiAngka; //char nilaiHuruf;
        System.out.println("Program Konversi Nilai");
        System.out.println("Masukkan Nilai Angka : ");
        nilaiAngka = s.nextInt();
        if(nilaiAngka >= 80) System.out.println('A');
        if(nilaiAngka >= 70) System.out.println('B');
        if(nilaiAngka >= 60) System.out.println('C');
        if(nilaiAngka >= 50) System.out.println('D');
        else System.out.println('E');
        //System.out.println("Nilai Hurufnya : "+nilaiHuruf);
    }
    
}
