/* 
 * 6.1 Algoritmo: - Calcule a área de um círculo com base no raio informado.
                    Como calcular: A = PI . R ao quadrado. 
                    Sem biblioteca Math. 
*/

package exercicios.grupo1;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Definindo PI
        double PI = 3.14159;

        // Processamento (sem Math.pow)
        double area = PI * raio * raio;

        // resultado
        System.out.println("A área do círculo é: " + area);
        scanner.close();
    }
}

