/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023bp2.e;

/**
 *
 * @author Mrsin
 */
class persegi{
    //data
    int panjang, lebar;
    //method
    public void hitungLuas(){
        int luas = panjang*lebar;
        System.out.println("Luas Persegi = "+luas);
    }
    public int hitungKeliling(){
        int keliling = 2*(panjang+lebar);
        return keliling; //2*(panjang+lebar);
    }
}
public class E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Belajar OOP");
        int x;
        persegi p = new persegi();
        p.panjang = 10;
        p.lebar = 5;
        p.hitungLuas();
        int k = p.hitungKeliling();
        System.out.println("Keliling = "+k);
        System.out.println("Keliling = "+p.hitungKeliling());
    }
    
}
