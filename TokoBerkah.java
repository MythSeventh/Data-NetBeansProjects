/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoberkah;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TokoBerkah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Toko Berkah Sejahtera");
        System.out.println("1. Beras\n2. Telur");
        System.out.println("3. Gula\n4. Minyak");
        System.out.println("5. Tepung\n6. Garam");
        System.out.print("Pilihan = ");
        byte pilih = s.nextByte();
        switch(pilih){
            case 1: System.out.println("Diskon 15%");
                    break;
            case 2: 
            case 3: 
            case 4: System.out.println("Diskon 20%");
                    break;
            case 5: 
            case 6: System.out.println("No Diskon");
                    break;
            default: System.out.println("Ups...");
        }
    }
    
}
