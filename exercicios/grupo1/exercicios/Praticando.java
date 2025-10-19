
/* 
EXERCICIO DE PRATICA
*/


import java.util.Scanner;

public class Praticando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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