/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
public class SwitchChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Menu Warung Nasi WAREG");
        System.out.println("A. Nasi Jotos\nB. Nasi Pecel");
        System.out.print("C. Nasi Sayur\nPilihan Anda = ");
        char pilih = s.next().charAt(0);
        switch(pilih){
            case 'A': System.out.println("Harga 3.000"); break;
            case 'B': System.out.println("Harga 5.000"); break;
            case 'C': System.out.println("Harga 7.000"); break;
            default: System.out.println("Pilihan Tidak Ada");
        }
    }
    
}
