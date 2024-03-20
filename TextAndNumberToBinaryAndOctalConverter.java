/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.and.number.to.binary.and.octal.converter;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TextAndNumberToBinaryAndOctalConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan teks atau angka yang ingin diubah menjadi kode biner: ");
        String input = s.nextLine();

        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) {
            String binaryString = Integer.toBinaryString(c);
            binary.append(String.format("%8s", binaryString).replace(' ', '0'));
        }

        System.out.println("Kode biner: " + binary.toString());

        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 3) {
            String binaryChunk = binary.substring(i, Math.min(i + 3, binary.length()));
            int decimal = Integer.parseInt(binaryChunk, 2);
            octal.append(decimal);
        }

        System.out.println("Kode oktal: " + octal.toString());
    }
    
}
