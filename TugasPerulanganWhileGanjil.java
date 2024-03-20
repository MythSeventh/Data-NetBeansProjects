/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.perulangan.pkgwhile.ganjil;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TugasPerulanganWhileGanjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program Perulangan While Ganjil");
        System.out.print("Masukkan Angka = ");
        int angka = s.nextInt();
        int i = 0;
        while(i <= angka){
            if(i % 2 !=0){
                System.out.println(i+" ");
            }
            i++;
        }
    }
    
}
