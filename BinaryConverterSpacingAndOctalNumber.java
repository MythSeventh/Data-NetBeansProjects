/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.converter.spacing.and.octal.number;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class BinaryConverterSpacingAndOctalNumber {

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
}
