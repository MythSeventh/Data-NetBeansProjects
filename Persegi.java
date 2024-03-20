/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persegi;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class Persegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sisi, luas; Scanner s = new Scanner(System.in);
        System.out.println("Input Sisi = "); sisi = s.nextInt();
        if(sisi>0){
            luas = sisi*sisi;
            System.out.println("Luas Persegi : "+luas );
        }else{
            System.out.println("ERROR: Sisi Negatif");
        }
    }
    
}
