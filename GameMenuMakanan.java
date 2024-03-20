/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamemenumakanan;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class GameMenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Daftar Menu Makanan :");
        System.out.println("1. Nasi Goreng\n2. Mie Goreng");
        System.out.println("3. Capcay Kuah\n4. Capcay Goreng");
        System.out.print("5. Kwetiau\nMasukkan Nomor Menu = ");
        int nomorMenu = s.nextInt();
        switch(nomorMenu){
            case 1: System.out.println("Anda telah memesan Nasi Goreng");
                    break;
            case 2: System.out.println("Anda telah memesan Mie Goreng");
                    break;
            case 3: System.out.println("Anda telah memesan Capcay Kuah");
                    break;
            case 4: System.out.println("Anda telah memesan Capcay Goreng");
                    break;
            case 5: System.out.println("Anda telah memesan Kwetiau");
                    break;
            default: System.out.println("Input Nomor Menu Tidal Valid");
        }
    }
}