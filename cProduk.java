/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumkm;

/**
 *
 * @author Mrsin
 */
public class cProduk {
    //data
    private String nama, kode;
    private int harga, stok;
    
    //method
    cProduk(){
        System.out.println("Constructor default Produk...");
    }
    cProduk(String n, int h, int s){
        nama = n;
        harga = h;
        stok = s;
        System.out.println("Object "+nama+" dibuat...");
    }
    public void setHarga(int h){
        harga = h;
    }
    public void setStok(int s){
        stok = s;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public String ToString(){
        return nama+" harga: "+harga+" stok: "+stok;
    }
}
