/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lapar.makan.kondisi.majemuk;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class LaparMakanKondisiMajemuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean lapar, uangcukup;
        Scanner s = new Scanner(System.in);
        System.out.print("Anda Lapar?");
        lapar = s.nextBoolean();
        System.out.print("Anda Cukup Uang?");
        uangcukup = s.nextBoolean();
        if(lapar == true && uangcukup == true){
            System.out.println("Beli ke warung");
        }else if(lapar == true && uangcukup == false){
            System.out.println("Banyak minum");
        }else if(lapar == false && uangcukup == true){
            System.out.println("Ditabung dulu");
        }else if(lapar == false && uangcukup == false){
            System.out.println("Belajar saja");}
    }
}
