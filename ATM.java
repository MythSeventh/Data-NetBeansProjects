/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in); int pilih;
        System.out.println("Selamat Datang di ATM");
        System.out.println("1. Tarik Tunai");
        System.out.println("2. Cek Saldo");
        System.out.println("3. Transfer");
        System.out.println(" Silakan Pilih = ");
        pilih = s.nextInt();
        if(pilih==1){
            System.out.println("Masukkan Nominal : ");
        }else if(pilih==2){
            System.out.println("Masukkan Nomor Rek : ");
        }else if(pilih==3){
            System.out.println("Saldo Anda : ");
        }else{
            System.out.println("Maaf, pilihan Tidak Ada");
        }
    }
    
}
