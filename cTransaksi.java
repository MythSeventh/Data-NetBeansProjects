/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumkm;

/**
 *
 * @author Mrsin
 */
public class cTransaksi {
    //data
    private String kode;
    private String tgl;
    private cPembeli pbl;
    private cProduk prd;
    private int jumlah;
    private int total;
    
    //method
    cTransaksi(){
        System.out.println("Default constructor Transaksi...");
    }
    public void setPembeli(String n, String a){
        pbl = new cPembeli(n,a);
    }
    public void setPembeli(cPembeli pb){
        pbl = new cPembeli();
        pbl = pb;
    }
    public void setProduk(cProduk p){
        prd = new cProduk();
        prd = p;
    }
    public void setJumlah(int j){
        jumlah = j;
    }
    public void setTotal(int t){
        total = t;
    }
    public cPembeli getPembeli(){
        return pbl;
    }
    public cProduk getProduk(){
        return prd;
    }
    public int getJumlah(){
        return jumlah;
    }
    public int getTotal(){
        return total;
    }
}