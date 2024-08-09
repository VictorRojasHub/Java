/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Victo
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nome;
       float valor;
       double desconto;
       Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        nome=input.next();
        System.out.println(nome);
        System.out.printf("Digite o valor de %s \n", nome);
        valor=input.nextInt();
        desconto = valor*0.9;
        System.out.printf("Valor final: %s \n", desconto);
    }
    
}
