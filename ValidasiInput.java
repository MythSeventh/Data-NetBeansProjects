/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validasi.input;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ValidasiInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int sisi, luas;
        System.out.println("Hitung Luas Persegi");
        do{
            System.out.print("Masukkan Sisi = ");
            sisi = s.nextInt();
        }while(sisi<=0);
        luas = sisi * sisi;
        System.out.println("Luasnya = "+luas);
    } 
}