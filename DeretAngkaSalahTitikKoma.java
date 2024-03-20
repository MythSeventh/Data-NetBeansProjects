/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deret.angka.salah.titik.koma;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class DeretAngkaSalahTitikKoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int bilangan, counter;
        System.out.println("Program Deret Angka");
        System.out.print("Masukkan Angka = ");
        bilangan = s.nextInt();
        System.out.println("Deret Angkanya = ");
        counter = 1;
        while(counter <= bilangan);
        {
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println("");
    }   
}