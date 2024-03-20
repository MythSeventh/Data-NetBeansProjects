/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi.nilai;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class KonversiNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int nilaiAngka; char nilaiHuruf;
        System.out.println("Program Konversi Nilai");
        System.out.println("Masukkan Nilai Angka : ");
        nilaiAngka = s.nextInt();
        if(nilaiAngka >= 80) nilaiHuruf = 'A';
        else if(nilaiAngka >= 70) nilaiHuruf = 'B';
        else if(nilaiAngka >= 60) nilaiHuruf = 'C';
        else if(nilaiAngka >= 50) nilaiHuruf = 'D';
        else nilaiHuruf = 'E';
        System.out.println("Nilai Hurufnya : "+nilaiHuruf);
    }
    
}
