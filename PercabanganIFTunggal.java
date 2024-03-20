/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan.pkgif.tunggal;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class PercabanganIFTunggal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int uang; Scanner s = new Scanner(System.in);
        System.out.println("Bangun pagi");
        System.out.println("Olah jiwa raga");
        System.out.println("Mandi, bersih-bersih");
        System.out.print("Isi dompet = ");
        uang=s.nextInt();
        if(uang>=10000){
            System.out.println("Sarapan dulu");
        }
        System.out.println("Berangkat ke kampus ...");
    }
    
}
