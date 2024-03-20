/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.binary.and.octal.each.converter;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TextBinaryAndOctalEachConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan teks biasa:");
        String text = scanner.nextLine();
        String binaryFromText = toBinary(text);
        System.out.println("Kode biner dari teks: " + binaryFromText);
        String octalFromText = toOctal(binaryFromText);
        System.out.println("Kode oktal dari teks: " + octalFromText);
        System.out.println("Masukkan kode biner:");
        String binary = scanner.nextLine();
        String textFromBinary = toTextFromBinary(binary);
        System.out.println("Teks dari kode biner: " + textFromBinary);
        String octalFromBinary = toOctal(binary);
        System.out.println("Kode oktal dari kode biner: " + octalFromBinary);
        System.out.println("Masukkan kode oktal:");
        String octal = scanner.nextLine();
        String textFromOctal = toTextFromOctal(octal);
        System.out.println("Teks dari kode oktal: " + textFromOctal);
        String binaryFromOctal = toBinaryFromOctal(octal);
        System.out.println("Kode biner dari kode oktal: " + binaryFromOctal);
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
    private static String toTextFromBinary(String binary) {
        StringBuilder text = new StringBuilder();
        String[] binaries = binary.split(" ");
        for (String bin : binaries) {
            int decimal = Integer.parseInt(bin, 2);
            text.append((char) decimal);
        }
        return text.toString();
    }
    private static String toTextFromOctal(String octal) {
        StringBuilder text = new StringBuilder();
        String[] octals = octal.split(" ");
        for (String oct : octals) {
            int decimal = Integer.parseInt(oct, 8);
            text.append((char) decimal);
        }
        return text.toString();
    }
    private static String toBinaryFromOctal(String octal) {
        StringBuilder binary = new StringBuilder();
        String[] octals = octal.split(" ");
        for (String oct : octals) {
            int decimal = Integer.parseInt(oct, 8);
            binary.append(Integer.toBinaryString(decimal)).append(" ");
        }
        return binary.toString().trim();
    }
}
