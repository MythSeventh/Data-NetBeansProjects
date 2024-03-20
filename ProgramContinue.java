/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.pkgcontinue;

/**
 *
 * @author Mrsin
 */
import java.util.Scanner;
public class ProgramContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int i;
        for(i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    
}
