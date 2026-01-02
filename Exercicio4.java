/*+
    Faça um programa que some de 200 a 500, somente os números pares, e exiba o resultado.
 */
// package exercicios.grupo4;

// import java.util.Scanner;

// public class Exercicio4 {
//     public static void main(String[] args) {
//         int soma = 0;

//         for (int i = 200; i <= 500; i++)
//         {
//             if (i % 2 == 0) 
//             {
//             soma += i;    
//             }
//         }
//         System.out.println("soma de 200 a 500: ", soma);
//     }
// }


public class Exercicio4 {
    public static void main(String[] args) {
        int soma = 0; // Guardar a soma dos números pares

        // Percorrer todos os números de 200 a 500
        for (int i = 200; i <= 500; i++) {
            if (i % 2 == 0) { // Verifica se o número é par
                soma += i; // Adiciona à soma
            }
        }

        // Mostrar o resultado
        System.out.println("A soma dos números pares de 200 a 500 é: " + soma);
    }
}

        
        
    


