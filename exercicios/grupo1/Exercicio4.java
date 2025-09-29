<<<<<<< HEAD
// package exercicios.grupo1;
/*
 * 4.1 Algoritmo: Calcule o quadrado de um número. Pergunte o número, calcule e exiba no final o resultado.
 *  
 */
=======
/*
 * Objetivo: Calcule o quadrado de um número. Pergunte o número, calcule e exiba no final o resultado.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;
>>>>>>> 42c3f5a92abd718ccda1fffa40064e10c79d8ba9

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        
        System.out.print("Calcular o quadrado de um número. Digite um número: ");
        double numero = scanner.nextDouble();

        // Calculo do quadrado de um numero
        double quadrado = numero * numero;
        
        System.out.printf("O quadrado de %.2f é %.2f%n", numero, quadrado);
        scanner.close(); 
    }
}
=======

        System.out.print("Digite um numero para calcular o quadrado deste: ");
        int numero = scanner.nextInt();

        double quadrado = Math.pow(numero, 2);
        System.out.printf("O quadrado do número %d é: %.2f", numero, quadrado);
        scanner.close();
    }
}
>>>>>>> 42c3f5a92abd718ccda1fffa40064e10c79d8ba9
