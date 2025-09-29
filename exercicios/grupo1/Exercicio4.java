// package exercicios.grupo1;

/*
 * 4.1 Algoritmo: Calcule o quadrado de um número. Pergunte o número, calcule e exiba no final o resultado.
 *  
 */
/*
 * Objetivo: Calcule o quadrado de um número. Pergunte o número, calcule e exiba no final o resultado.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Calcular o quadrado de um número. Digite um número: ");
        double numero = scanner.nextDouble();

        // Calculo do quadrado de um numero
        double quadrado = numero * numero;
        
        System.out.printf("O quadrado de %.2f é %.2f%n", numero, quadrado);
        scanner.close(); 
    }
}
