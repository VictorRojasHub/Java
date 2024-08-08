/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Victo
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1,v2,soma;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor I: ");
        v1=input.nextInt();
        System.out.println("Digite o valor II: ");
        v2=input.nextInt();
        soma=v1+v2;
        System.out.printf("\nSoma = %d", soma);
    }
}
