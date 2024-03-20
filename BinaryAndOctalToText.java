/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.and.octal.to.text;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class BinaryAndOctalToText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kode biner:");
        String binary = scanner.nextLine();
        String originalFromBinary = toOriginalFromBinary(binary);
        System.out.println("Teks asli dari kode biner: " + originalFromBinary);
        System.out.println("Masukkan kode oktan:");
        String octal = scanner.nextLine();
        String originalFromOctal = toOriginalFromOctal(octal);
        System.out.println("Teks asli dari kode oktan: " + originalFromOctal);
    }
    private static String toOriginalFromBinary(String binary) {
        StringBuilder original = new StringBuilder();
        String[] binaries = binary.split(" ");
        for (String bin : binaries) {
            int decimal = Integer.parseInt(bin, 2);
            original.append((char) decimal);
        }
        return original.toString();
    }
    private static String toOriginalFromOctal(String octal) {
        StringBuilder original = new StringBuilder();
        String[] octals = octal.split(" ");
        for (String oct : octals) {
            int decimal = Integer.parseInt(oct, 8);
            original.append((char) decimal);
        }
        return original.toString();
    }
}
