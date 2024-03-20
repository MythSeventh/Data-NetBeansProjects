/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.menu.bersarang;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ProgramMenuBersarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("MENU");
            System.out.println("1. Sate");
            System.out.println("2. Rujak");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih = s.nextInt();
            switch(pilih){
                case 1:
                    int daging;
                    do{
                        System.out.println("1. Ayam");
                        System.out.println("2. Kelinci");
                        System.out.println("3. Kambing");
                        System.out.println("4. Selesai");
                        System.out.print("Pilih = ");
                        daging = s.nextInt();
                        if(daging==1){
                            System.out.println("Harga : 15.000");
                        }else if(daging==2){
                            System.out.println("Harga : 20.000");
                        }else if(daging==3){
                            System.out.println("Harga : 25.000");
                        }
                    }while(daging!=4);
                    break;
                case 2:
                    int lombok;
                    do{
                        System.out.println("1. Biasa");
                        System.out.println("2. Pedas");
                        System.out.println("3. X-Pedas");
                        System.out.println("4. Selesai");
                        System.out.print("Pilih = ");
                        lombok = s.nextInt();
                    }while(lombok!=4);
                    break;
                case 3:
                 System.out.println("Terima kasih");
                 break;
                default: System.out.println("Ups...");
            }
        }while(pilih!=3);
    }
    
}
