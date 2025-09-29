<<<<<<< HEAD
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Exercicio5 {
   public Exercicio5() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Calcule a area de um quadrado. Digite o valor de um lado: ");
      double var2 = var1.nextDouble();
      double var4 = var2 * var2;
      System.out.printf("A area do quadrado é %.2f%n", var4);
      var1.close();
   }
=======
/*
 * Objetivo: Calcule a área de um quadrado. Como calcular: Area = lado \* lado
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de área de um quadrado.");
        System.out.print("Digite a medida do lado do quadrado: ");
        int lado = scanner.nextInt();

        double areaQuadrado = Math.pow(lado, 2);
        System.out.printf("A área do quadrado que tem a medida de seu lado = %d é: %.2f", lado, areaQuadrado);
        scanner.close();
    }
>>>>>>> 42c3f5a92abd718ccda1fffa40064e10c79d8ba9
}
