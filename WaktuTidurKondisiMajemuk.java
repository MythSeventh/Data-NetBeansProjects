/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waktu.tidur.kondisi.majemuk;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class WaktuTidurKondisiMajemuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jamTidur, jamBangun, lamaTidur;
        boolean terlambat;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jam Tidur = ");
        jamTidur = s.nextInt();
        System.out.println("Masukkan Jam Bangun = ");
        jamBangun = s.nextInt();
        System.out.println("Lama Tidur = "+(jamBangun-jamTidur));
        lamaTidur = s.nextInt();
        
    }
    
}
