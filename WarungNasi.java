/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warung.nasi;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class WarungNasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Menu Warung Nasi WAREG");
        System.out.println("1. Nasi Jotos\n2. Nasi Pecel");
        System.out.print("3. Nasi Sayur\nPilihan Anda = ");
        int pilih = s.nextInt();
        switch(pilih){
            case 1: System.out.println("Harga 3.000"); break;
            case 2: System.out.println("Harga 5.000"); break;
            case 3: System.out.println("Harga 7.000"); break;
            default: System.out.println("Pilihan Tidak Ada");
        }
    }
    
}
