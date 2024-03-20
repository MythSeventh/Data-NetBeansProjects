/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi.kasir;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class AplikasiKasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pesanan, jumlah;
        double suhu, totalakhir, total=0;
        String sehat, jawaban;
        System.out.println("\tSelamat Datang di Rumah Makan Amanah!"
                +"\n======================================================="
                +"\n     MENYEDIAKAN BERBAGAI MENU PRAKTIS DAN SEHAT"
                +"\n=======================================================");
        System.out.println("Sebelum masuk ke Rumah Makan, mohon jawab beberapa pertanyaan berikut :");
        System.out.println("Apakah Anda merasa sehat? \"sehat\" \"kurang sehat");
        sehat = input.nextLine();
        System.out.println("Berapa suhu tubuh Anda?");
        suhu = input.nextDouble();
        if(sehat.equalsIgnoreCase("sehat")&&suhu<=37){
            System.out.println("\t\tSELAMAT DATANG!\n"
                    +"-------------------------------------------------------------------------"
                    +"\nSilahkan pilih Paket Menu Sehat yang ada di bawah ini :"
                    +"\n1. Menu Sehat 1 : Nasi+AyamKampung+SayurBayam\t\t\tRp. 20.000"
                    +"\n2. Menu Sehat 2 : Nasi+AyamKampung+SayurLodeh\t\t\tRp. 18.000"
                    +"\n3. Menu Sehat 3 : Nasi+AyamKampung+TehHangat\t\t\tRp. 15.000"
                    +"\n4. Menu Sehat 4 : Nasi+AyamKampung+SayurBayam/Lodeh+TehHangat\tRp. 25.000"
                    +"\n-------------------------------------------------------------------------");
            do{
                totalakhir = total;
                System.out.println("\nMasukkan nomer dari Paket Menu Sehat :");
                pesanan = input.nextInt();
                    while(pesanan>4||pesanan<1){
                        System.out.println("Mohon masukkan angka sesuai Menu Paket Sehat yang tersedia");
                        System.out.println("\nMasukkan nomor dari Paket Menu Sehat :");
                        pesanan = input.nextInt();
                    }
                System.out.println("Berapa jumlah menu yang ingin dipesan?");
                jumlah = input.nextInt();
                String[] nama = {"Menu Sehat 1 : Nasi+AyamKampung+SayurBayam","Sehat 2 : Nasi+AyamKampung+SayurLodeh","Menu Sehat 3 : Nasi+AyamKampung+TehHangat","Menu Sehat 4 : Nasi+AyamKampung+SayurBayam/Lodeh+TehHangat"};
                int[] harga = {20000,18000,15000,25000};
                switch(pesanan){
                    case 1:
                        System.out.println("Anda memesan "+nama[0]+" sebanyak "+jumlah+" porsi");
                        System.out.println("Harga per porsi = Rp. "+harga[0]+",-");
                        total = totalakhir+(harga[0]*jumlah);
                        System.out.println("Total = Rp. "+(int)total+",-");
                        break;
                    case 2:
                        System.out.println("Anda memesan "+nama[1]+" sebanyak "+jumlah+" porsi");
                        System.out.println("Harga per porsi = Rp. "+harga[1]+",-");
                        total = totalakhir+(harga[1]*jumlah);
                        System.out.println("Total = Rp. "+(int)total+",-");
                        break;
                    case 3:
                        System.out.println("Anda memesan "+nama[2]+" sebanyak "+jumlah+" porsi");
                        System.out.println("Harga per porsi = Rp. "+harga[2]+",-");
                        total = totalakhir+(harga[2]*jumlah);
                        System.out.println("Total = Rp. "+(int)total+",-");
                        break;
                    case 4:
                        System.out.println("Anda memesan "+nama[3]+" sebanyak "+jumlah+" porsi");
                        System.out.println("Harga per porsi = Rp. "+harga[3]+",-");
                        total = totalakhir+(harga[3]*jumlah);
                        System.out.println("Total = Rp. "+(int)total+",-");
                        break;
                }
                System.out.println("\nApakah Anda ingin memesan lagi? \"Y\" atau \"N\"");
                jawaban = input.next();
            }while(jawaban.equalsIgnoreCase("Y"));
            if(jawaban.equalsIgnoreCase("N")){
                System.out.println("\n==============================================");
                System.out.println("\nTotal Pembayaran Anda = Rp. "+(int)total+",-");
                System.out.println("==============================================");
            }
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Terima kasih Telah Memesan, Silahkan Menunggu, Pesanan Anda Akan Segera Diantarkan");
            System.out.println("----------------------------------------------------------------------------------");
        }else{
            System.out.println("Mohon maaf, Anda tidak dapat masuk ke Rumah Makan!");
            System.out.println("TERIMAKASIH");
        }
    }
    
}
