/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.pkgbreak;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ProgramBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int tebakan, salah=0;
        do{
            System.out.print("Masukkan Angka 0-9 = ");
            tebakan = s.nextInt();
            if(tebakan==8){
                System.out.println("ANDA BENAR!!!");
                break;
            }
            salah++;
            System.out.println(salah+"X Salah :(");
        }while(tebakan!=8);
    }
    
}
