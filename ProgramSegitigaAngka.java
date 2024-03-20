/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.segitiga.angka;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ProgramSegitigaAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Persegi Angka");
        System.out.print("Masukkan Sisi = ");
        int sisi = s.nextInt();
        for(int i = 1; i <= sisi; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    
}