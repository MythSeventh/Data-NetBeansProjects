/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitung.deret.angka;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class MenghitungDeretAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int bilangan, counter, jumlah, kali;
        System.out.println("Program Deret Angka");
        System.out.print("Masukkan Angka = ");
        bilangan = s.nextInt();
        System.out.println("Deret Angkanya = ");
        counter = 1; jumlah = 0; kali = 1;
        while(counter <= bilangan){
            System.out.println(counter+" ");
            jumlah = jumlah + counter;
            kali = kali * counter;
            counter++;
        }
        System.out.println("Hasil jumlah deretnya = "+jumlah);
        System.out.println("Hasil kali deretnya = "+kali);
    } 
}