/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.perulangan.segitiga.angka;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TugasPerulanganSegitigaAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program Segitiga Angka");
        System.out.print("Masukkan Angka = ");
        int angka = s.nextInt();
        for(int i = 1; i <= angka; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
