/**
 * P1 3

 Calcule o fatorial de um número.
Pergunte o número, faça o loop e exiba o resultado no final. 

Exemplo: Fatorial de 5 => 5 * 4 * 3 * 2 * 1 = 120

*/
package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            int resultado = 1;

            // Calculando com for porque sei quantas vezes repetir
            for (int i =1; i <= numero; i++)
            {
                resultado *= i; // resultado = resultado * 1                
            }

            //Resultado
            System.out.print("O fatorial de " + numero + " é: " + resultado);

            scanner.close();
       
    }
}
