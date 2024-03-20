/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaankampus;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class PerpustakaanKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Perpustakaan Kampus");
        System.out.println("1. Peminjaman Buku");
        System.out.println("2. Pengembalian Buku");
        System.out.println("3. Pencarian Buku");
        System.out.println("4. Daftar Anggota");
        System.out.print("Pilihan = ");
        byte pilih = s.nextByte();
        switch(pilih){
            case 1: System.out.println("Anggota?");
                    System.out.println("1 = Ya");
                    System.out.println("2 = Tidak");
                    System.out.print("Jawab = ");
                    int anggota = s.nextByte();
                    System.out.print("Biayanya ");
                    if(anggota==1){
                        System.out.println("Gratis");
                    }else if(anggota==2){
                        System.out.println("10.000");
                    }else
                        System.out.println("Ups...");
                    break;
            case 2: System.out.println("Terlambat?");
                    System.out.println("1 = Ya");
                    System.out.println("2 = Tidak");
                    System.out.print("Jawab = ");
                    int terlambat = s.nextByte();
                    if(terlambat==1){
                        System.out.println("Anggota?");
                        System.out.println("1 = Ya");
                        System.out.println("2 = Tidak");
                        System.out.print("Jawab = ");
                        int anggota2 = s.nextByte();
                        System.out.print("Kena denda  ");
                        if(anggota2==1){
                            System.out.println("1.000/hari");
                        }else if(anggota2==2){
                            System.out.println("2.000/hari");
                        }
                    }else if(terlambat==2){
                        System.out.println("Thank you");
                    }
                    break;
            case 3: System.out.println("Kelompok Buku");
                    System.out.println("1. Sosial");
                    System.out.println("2. Sains");
                    System.out.println("3. Keagamaan");
                    System.out.print("Pilihan = ");
                    int pilih2 = s.nextInt();
                    System.out.print("Anda di Lantai ");
                    switch(pilih2){
                        case 1: System.out.println("I");
                                break;
                        case 2: System.out.println("II");
                                break;
                        case 3: System.out.println("III");
                                break;
                        default: System.out.println("Ups...");
                    }
                    break;
            case 4: System.out.println("Civitas Kampus?");
                    System.out.println("1 = Ya");
                    System.out.println("2 = Tidak");
                    System.out.print("Jawab = ");
                    int civitas = s.nextByte();
                    System.out.print("Biaya Daftarnya ");
                    if(civitas==1){
                        System.out.println("Gratis");
                    }else if(civitas==2){
                        System.out.println("100.000");
                    }else
                        System.out.println("Ups...");
                    break;
            default: System.out.println("Ups...");
        }
        
    }
    
}
