/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.deret.fibonanci;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ProgramDeretFibonanci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int fibo, fibo1, fibo2, suku;
        fibo1=0; fibo2=1;
        System.out.println("Deret Fibonanci");
        System.out.println("Input Suku ke = ");
        suku = s.nextInt();
        System.out.println("Deretnya = ");
        System.out.print(fibo1+" "+fibo2+" ");
        for(int i=2; i<=suku; i++){
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
            System.out.print(fibo+" ");
        }
        System.out.println("");
    }   
}