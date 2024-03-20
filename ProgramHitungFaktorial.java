/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.hitung.faktorial;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ProgramHitungFaktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int faktorial=1;
        System.out.println("Hitung Faktorial");
        System.out.print("Masukkan Angka = ");
        int angka = s.nextInt();
        for (int i = angka; i >= 1; i--){
            faktorial = faktorial * i;
        }
        System.out.println("Hasilnya = "+faktorial);
    } 
}