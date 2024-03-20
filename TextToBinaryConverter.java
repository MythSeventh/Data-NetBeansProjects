/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.to.binary.converter;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TextToBinaryConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan teks atau angka yang ingin diubah menjadi kode biner : ");
        String text = s.nextLine();
        
        StringBuilder binary = new StringBuilder();
        for(char c : text.toCharArray()){
            String binaryString = Integer.toBinaryString(c);
            binary.append(String.format("%8s", binaryString).replace(' ', '0'));
        }
        
        System.out.println("Kode biner : "+binary.toString());
    }
    
}
