/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequential.search.pkg4.jumlah.pencariannya;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class SequentialSearch4JumlahPencariannya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int data [] = {18,23,36,48,55,61,73,87,92,99};
        boolean ketemu;
        int i, pilih;
        do{
            int count=0;
            System.out.println("\nSequential Search Loop");
            System.out.print("Data : ");
            for(i=0; i<data.length; i++){
                System.out.print(data[i]+" ");
            }
            ketemu = false;
            System.out.println("");
            System.out.print("Cari Angka = ");
            int cari = s.nextInt();
            for(i=0; i<data.length; i++){
                count++;
                if(data[i]==cari){
                    ketemu = true;
                    break;
                }
            }
            if(ketemu==true){
                System.out.print("Ditemukan setelah ");
                System.out.println(count+" kali pencarian");
            }else{
                System.out.println("Tidak ditemukan");
                System.out.print("Meski sudah "+count);
                System.out.println(" kali pencarian...");
            }
            System.out.println("Cari lagi?");
            System.out.println("[1.Ya][2.Tidak]");
            System.out.println("Jawab = ");
            pilih = s.nextInt();
        }while(pilih==1);
        System.out.println("Terima kasih...");
    }
    
}
