/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature.converter;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Masukkan satuan suhu (C/F/K): ");
        String unit = scanner.nextLine().toUpperCase();

        double convertedTemperature = 0;
        String convertedUnit = "";

        switch (unit) {
            case "C":
                convertedTemperature = temperature * 9 / 5 + 32;
                convertedUnit = "F";
                break;
            case "F":
                convertedTemperature = (temperature - 32) * 5 / 9;
                convertedUnit = "C";
                break;
            case "K":
                convertedTemperature = temperature - 273.15;
                convertedUnit = "C";
                break;
            default:
                System.out.println("Satuan suhu tidak valid.");
                return;
        }

        System.out.printf("%.2f %s = %.2f %s", temperature, unit, convertedTemperature, convertedUnit);
    }
    
}
