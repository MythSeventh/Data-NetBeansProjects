/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timbangan.amal;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TimbanganAmal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int amalbaik, amalburuk;
        Scanner s = new Scanner(System.in);
        System.out.println("Timbangan Amal");
        System.out.print("Berat Amal Baik = ");
        amalbaik = s.nextInt();
        System.out.print("Berat Amal Buruk = ");
        amalburuk = s.nextInt();
        if(amalbaik >= amalburuk){
            System.out.print("Masuk Surga");
        }else{
            System.out.print("Masuk Neraka");
        }
    }
    
}
