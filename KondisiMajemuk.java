/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kondisimajemuk;

/**
 *
 * @author Mrsin
 */
public class KondisiMajemuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sks; double ipk; boolean E;
        sks = 144; ipk = 3.8; E = false;
        if(sks >= 144 && ipk >= 2 && E == false){
            System.out.println("Sudah bisa LULUS");
        }else{
            System.out.println("Belum bisa LULUS");
        }
        boolean sakit, acaraKeluarga, motormogok;
        sakit = false; acaraKeluarga = false; motormogok = true;
        if(sakit || acaraKeluarga || motormogok){
            System.out.println("Tidak masuk kuliah");
        }else{
            System.out.println("Harus masuk kuliah");
        }
    }
    
}
