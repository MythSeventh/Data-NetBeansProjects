/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waktu.tidur;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class WaktuTidur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Jam Tidur = ");
        int jamTidur = s.nextInt();
        System.out.print("Masukkan Jam Bangun = ");
        int jamBangun = s.nextInt();
        int lamaTidur = (jamBangun-jamTidur+24)%24;
        boolean terlambat = lamaTidur > 13, cukupTidur = lamaTidur >= 7;
        if(cukupTidur && !terlambat){
            System.out.println("Kamu memiliki waktu tidur yang cukup dan kamu tidak terlambat");
        }else if(!cukupTidur && !terlambat){
            System.out.println("Kamu tidak memiliki waktu tidur yang cukup, tetapi kamu tidak terlambat");
        }else if(cukupTidur && terlambat){
            System.out.println("Kamu meiliki waktu tidur yang cukup, tetapi kamu terlambat");
        }else{
            System.out.println("Kamu perlu tidur lebih lama dan kamu terlambat");
        }
    }
    
}