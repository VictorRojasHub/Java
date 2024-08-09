/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Victo
 */
import java.util.Scanner;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float salariomin, salario;
       float result;
       Scanner input = new Scanner(System.in);
       System.out.printf("Digite o valor do salario minimo\n");
        salariomin=input.nextInt();
       System.out.printf("Digite seu salario atual\n");
        salario=input.nextInt();
        result = (salario/salariomin);
        System.out.printf("Voce recebe %s selario minimos\n", result);
    }
    
}
