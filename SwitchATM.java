/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchatm;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class SwitchATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("ATM 2020");
        System.out.println("1. Penarikan\n2. Transfer");
        System.out.print("3. Pembayaran\nPilihan Anda = ");
        byte pilih = s.nextByte();
        switch(pilih){
            case 1: System.out.print("Masukkan Nominal = ");
                    break;
            case 2: System.out.println("1. Ke Bank Sama");
                    System.out.println("2. Ke Bank Lain");
                    System.out.print("Pilihan Anda = ");
                    int pilih2 = s.nextInt();
                    switch(pilih2){
                        case 1: System.out.println("Gratis Biaya");
                                break;
                        case 2: System.out.println("Biaya 5.000");
                                break;
                    }
                    break;
            case 3: System.out.println("1. Tagihan Listrik");
                    System.out.println("2. Tiket Online");
                    System.out.println("3. Biaya Kuliah");
                    System.out.print("Pilihan Anda = ");
                    int pilih3 = s.nextInt();
                    switch(pilih3){
                        case 1: System.out.println("ID Pel : ");
                                break;
                        case 2: System.out.println("Kode Trx : ");
                                break;
                        case 3: System.out.println("NPM :");
                                break;
                    }
                    break;
            default: System.out.println("Pilihan Tidak Ada");
        }
    }
    
}
