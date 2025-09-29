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
}
