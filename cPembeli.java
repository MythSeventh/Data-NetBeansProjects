/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumkm;

/**
 *
 * @author Mrsin
 */
public class cPembeli {
    //data
    private String nama;
    private String alamat;
    
    //method
    cPembeli(){
        System.out.println("Default constructor Pembeli...");
    }
    cPembeli(String n){
        nama = n;
        System.out.println(nama+" dibuat...");
    }
    cPembeli(String n, String a){
        nama = n;
        alamat = a;
        System.out.println(nama+" ["+alamat+"] dibuat...");
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
}
