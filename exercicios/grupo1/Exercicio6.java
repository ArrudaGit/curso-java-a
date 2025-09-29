<<<<<<< HEAD
// package exercicios.grupo1;
/* 
 * 6.1 Algoritmo: - Calcule a área de um círculo com base no raio informado.
                    Como calcular: A = PI . R ao quadrado. 
                    Sem biblioteca Math.
*/
=======
/*
 * Objetivo: 
 * Calcule a área de um círculo com base no raio informado. Como calcular: A = PI \* R ao quadrado
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;
>>>>>>> 42c3f5a92abd718ccda1fffa40064e10c79d8ba9

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        
        System.out.print("Digite o raio o raio do círculo:  ");
        double raio = scanner.nextDouble(); 

        // PI aproximado 
        double PI = 3.14159;       

        // Calculo da area de um quadrado - processamento
        double area =  PI * raio * raio;
        
        // Saida
        System.out.printf("A area do círculo é:  %.2f%n", area);
        scanner.close(); 
    }
}
=======

        System.out.println("Calculo de área de um circulo");
        System.out.print("Digite a medida do raio do círculo: ");
        int raio = scanner.nextInt();

        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo que tem a medida de seu raio = %d é: %.2f", raio, areaCirculo);
        scanner.close();
    }
}
>>>>>>> 42c3f5a92abd718ccda1fffa40064e10c79d8ba9
