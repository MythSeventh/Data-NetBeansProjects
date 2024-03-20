/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.pkg1;

/**
 *
 * @author Mrsin
 */
public class Bubble1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[]={12,59,26,15,53};
        System.out.println("Bubble Sort");
        //menampilkan array sebelum diurutkan
        System.out.print("Data Awal : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        //pengurutan array memakai bubble sort
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data.length-1; j++){
                if(data[j]>data[j+1]){
                    //tukar data
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }//end if
            }//end loop j
        }//end loop i
        //menampilkan array setelah diurutkan
        System.out.print("Data Akhir : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
    }
    
}
