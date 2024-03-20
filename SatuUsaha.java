/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package satu.usaha;

/**
 *
 * @author Mrsin
 */
public class SatuUsaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        String[] buah = new String[4];
        buah[0] = "Jambu";
        buah[1] = "Apel";
        buah[2] = "Pisang";
        buah[3] = "Anggur";
        for(int i = 0; i < 4; i++){
            System.out.println("value buah ke "+(i+1)+" "+buah[i]);
        }
        int[] npm = {101,102,103,104};
        for(int i = 0; i < 4; i++){
            System.out.println("NPM : "+npm[i]);
        }
    }
    
}
