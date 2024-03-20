/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumkm;
import java.util.Scanner;
/**
 *
 * @author Mrsin
 */
public class appKasir {
    public static void main(String[] args){
        cProduk p = new cProduk();
        cProduk p2 = new cProduk("Sepatu",150000,10);
        cPembeli pb = new cPembeli("Budi","Surabaya");
        cTransaksi tr = new cTransaksi();
        Scanner s = new Scanner(System.in);
        int pilih=0;
        do{
            System.out.println("\nMENU APP");
            System.out.println("1.Produk");
            System.out.println("2.Pembeli");
            System.out.println("3.Transaksi");
            System.out.println("4.Exit");
            System.out.print("Pilih = ");
            pilih = s.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("<<PRODUK>>");
                    System.out.println("  1.Tambah");
                    System.out.println("  2.Ubah");
                    System.out.println("  3.Hapus");
                    System.out.println("  4.Detail");
                    System.out.print("  Pilih = ");
                    int pilih2 = s.nextInt();
                    switch(pilih2){
                        case 1:
                            s = new Scanner(System.in);
                            System.out.print("  Nama = ");
                            String nm = s.next();
                            System.out.print("  Harga = ");
                            int hg = s.nextInt();
                            System.out.print("  Stok = ");
                            int st = s.nextInt();
                            p2 = new cProduk(nm,hg,st);
                            break;
                        case 2:
                            System.out.print("  Stok Baru = ");
                            st = s.nextInt();
                            System.out.println("  Yakin Ubah?");
                            System.out.println("  1.Ya");
                            System.out.println("  2.Batal");
                            System.out.print("  Jawab = ");
                            int jwb = s.nextInt();
                            if(jwb==1){
                                p2.setStok(st);
                                System.out.println("  Ubah Stok Berhasil...");
                            }else{
                                System.out.println("  Ubah Stok Batal...");
                            }//end if(jwb==1) [case2]
                            break;
                        case 3:
                            s = new Scanner(System.in);
                            System.out.print("  Nama = ");
                            nm = s.next();
                            if(nm.equalsIgnoreCase(p2.getNama())){
                                System.out.println("  Yakin Hapus?");
                                System.out.println("  1.Ya");
                                System.out.println("  2.Batal");
                                System.out.print("  Jawab = ");
                                jwb = s.nextInt();
                                if(jwb==1){
                                p2 = null;
                                System.out.println("  Hapus Sukses...");   
                                }else{
                                    System.out.println("  Batal Hapus!");
                                }//end if(jwb==1) [case3]
                            }else{
                                System.out.println("  Produk tidak ada!");
                            }//end if(nm.equalsIgnoreCase(p2.getNama()))
                            break;
                        case 4:
                            if(p2!=null){
                                System.out.println(p2.ToString());
                            }else{
                                System.out.println("Object kosong!");
                            }//end if(p2!=null)
                    }//end switch(pilih2)
                    break;
                case 2:
                    System.out.println("<<PEMBELI>>");
                    break;
                case 3:
                    System.out.println("<<TRANSAKSI>>");
                    System.out.println("  1.Tambah");
                    System.out.println("  2.Ubah");
                    System.out.println("  3.Hapus");
                    System.out.println("  4.Cetak");
                    System.out.print("  Pilih = ");
                    pilih2 = s.nextInt();
                    switch(pilih2){
                        case 1:
                            System.out.print("Nama   = ");
                            String n = s.next();
                            System.out.print("Produk = ");
                            String pr = s.next();
                            System.out.print("Jumlah = ");
                            int j = s.nextInt();
                            if(pr.equalsIgnoreCase(p2.getNama())){
                                int t = j*p2.getHarga();
                                pb = new cPembeli(n);
                                tr.setPembeli(pb);
                                tr.setProduk(p2);
                                tr.setJumlah(j);
                                tr.setTotal(t);
                                System.out.println("Transaksi sukses...");
                            }else{
                                System.out.println("Produk tidak ada!");
                            }//end if(pr.equalsIgnoreCase(p2.getNama()))
                            break;
                        case 2:
                            System.out.print("Nama Produk = ");
                            pr = s.next();
                            if(pr.equalsIgnoreCase(tr.getProduk().getNama())){
                                 System.out.print("Jumlah Baru = ");
                                 j = s.nextInt();
                                 System.out.println("Yakin Ubah?");
                                 System.out.println("1.Ya\n2.Batal");
                                 System.out.print("Jawab = ");
                                 int jwb = s.nextInt();
                                 if(jwb==1){
                                     tr.setJumlah(j);
                                     tr.setTotal(j*tr.getProduk().getHarga());
                                     System.out.println("Ubah Sukses...");
                                 }else{
                                     System.out.println("Ubah batal!");
                                 }//end if(jwb==1)
                            }else{
                                System.out.println("Produk tidak ada!");
                            }//end if(pr.equalsIgnoreCase(tr.getProduk().getNama()))
                            break;
                        case 3:
                            break;
                        case 4:
                            if(tr!=null){
                                System.out.println("Pembeli = "+tr.getPembeli().getNama());
                                System.out.println("Produk  = "+tr.getProduk().getNama());
                                System.out.println("Jumlah  = "+tr.getJumlah());
                                System.out.println("Harga   = "+tr.getProduk().getHarga());
                                System.out.println("Total   = "+tr.getTotal());
                            }else{
                                System.out.println("Transaksi kosong!");
                            }//end if(tr!=null)
                    }//end switch(pilih2)
                    break;
                case 4:
                    System.out.println("Terima kasih...");
            }//end switch(pilih)
        }while(pilih!=4);
    }//end main
}//end class