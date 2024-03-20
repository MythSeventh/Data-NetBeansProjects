/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemberian.bonus.karyawan;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class PemberianBonusKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int penjualan, omzet;
        System.out.print("Masukkan Penjualan ; ");
        penjualan = s.nextInt();
        System.out.print("Masukkan Omzet : ");
        omzet = s.nextInt();
        if(penjualan > 500 || omzet >= 1000000){
            System.out.println("Dapat Bonus");
        }else if(penjualan > 500 || omzet < 1000000){
            System.out.println("Dapat Bonus");
        } else if(penjualan < 500 || omzet >= 1000000){
            System.out.println("Dapat Bonus");
        } else System.out.println("Belum dapat Bonus");
    }
    
}
