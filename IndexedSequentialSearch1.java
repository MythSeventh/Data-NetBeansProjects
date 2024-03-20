/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indexed.sequential.search.pkg1;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class IndexedSequentialSearch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int data [] = {13,16,17,19,20,22,27,28,31,33,36,38};
        int indeks [] = {3,6,9,12};     //array indeks partisi
        int elemen [] = {19,25,31,38}; //array data partisi
        System.out.println("Program Indexed Search");
        System.out.print("Isi Data : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        System.out.print("Data yang dicari = ");
        int cari = s.nextInt();
        //jika data di luar jangkauan array
        if(cari<data[0]||cari>data[data.length-1]){
            System.out.println("Data di luar jangkauan");
            System.exit(0);
        }else{
            //penentuan index awal-akhir partisi array
            int awal=0,akhir,idx=0;
            //cari dulu nilainya di array elemen
            for(int i=0; i<elemen.length; i++){
                if(cari<=elemen[i]){
                    idx = i;
                    break;
                }
            }
            //dapatkan indeks awal pencarian
            if(idx>=1){
                awal = indeks[idx-1]; //batas partisi sebelumnya
            }
            //dapatkan indeks akhir pencarian
            akhir = indeks[idx];      //batas partisi yang didapat
            System.out.println("Range indeks : "+awal+"-"+akhir);
            //pencarian berdasarkan partisi array (sawal s.d. akhir)
            for(int i=awal; i<=akhir; i++){
                if(cari==data[i]){
                    System.out.println("Data ditemukan");
                    System.exit(0);
                }
            }
            System.out.println("Data tidak ada");
        }//end else
    }//end main
    
}//end class
