/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection.sort;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int data[] = new int[5];
        System.out.println("Selection Sort");
        System.out.println("Masukkan Data Awal");
        for(int i=0; i<5; i++){
            System.out.print("Data"+(i+1)+" = ");
            data[i] = s.nextInt();
        }
        System.out.print("Data Awal : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println(" ");
        for(int i=0; i<data.length-1; i++){
            for(int j=i+1; j<data.length; j++){
                if(data[i]>data[j]){
                    //tukar data
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }//end if
            }//end loop j
        }//end loop i
        System.out.print("Data Akhir : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println(" ");
    }
    
}
