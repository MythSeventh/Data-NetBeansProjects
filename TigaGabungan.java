/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiga.gabungan;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TigaGabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int[] angka = new int[5];
        System.out.println("Masukkan 5 Angka = ");
        for(int i = 0; i < angka.length; i++){
            angka[i] = s.nextInt();
        }
        System.out.println("Anda telah memasukkan angka-angka berikut = ");
        for(int i = 0; i < angka.length; i++){
            System.out.println("Elemen ke "+(i+1)+" : "+angka[i]);
        }
    }  
}
