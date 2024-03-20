/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.converter.spacing.and.octal.number.and.mirroring;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class BinaryConverterSpacingAndOctalNumberAndMirroring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan teks atau angka:");
        String input = scanner.nextLine();
        String binary = toBinary(input);
        System.out.println("Kode biner: " + binary);
        String octal = toOctal(binary);
        System.out.println("Kode oktan: " + octal);
        String original = toOriginal(octal);
        System.out.println("Teks asli: " + original);
    }
    private static String toBinary(String input) {
        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) {
            binary.append(Integer.toBinaryString(c)).append(" ");
        }
        return binary.toString().trim();
    }
    private static String toOctal(String binary) {
        StringBuilder octal = new StringBuilder();
        String[] binaries = binary.split(" ");
        for (String bin : binaries) {
            int decimal = Integer.parseInt(bin, 2);
            octal.append(Integer.toOctalString(decimal)).append(" ");
        }
        return octal.toString().trim();
    }
    private static String toOriginal(String octal) {
        StringBuilder original = new StringBuilder();
        String[] octals = octal.split(" ");
        for (String oct : octals) {
            int decimal = Integer.parseInt(oct, 8);
            original.append((char) decimal);
        }
        return original.toString();
    }
}