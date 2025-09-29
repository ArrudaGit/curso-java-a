<<<<<<< HEAD
// package exercicios.grupo1;
/*
 * 3.1 Algoritmo: Perguntar o nome de um aluno, pergunte as 4 notas e 
 *      calcule a média aritmética(média simples), exibindo no final.
 *      // CALCULAR MEDIA DAS 4 NOTAS DO ALUNO
 * 
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // declaração das variáveis
        double nota1, nota2, nota3, nota4, mediaNota;

        System.out.print("Digite a primeria nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        // Calculo da Média
        mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Seu nome é %s tem média: %.2f%n", nome, mediaNota);
=======
/*
 * Objetivo: Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética(média simples), exibindo no final.
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A media do Aluno: %s, que tem as notas %.2f, %.2f, %.2f e %.2f é: %.2f", nome, nota1, nota2, nota3, nota4, media);

>>>>>>> 42c3f5a92abd718ccda1fffa40064e10c79d8ba9
        scanner.close();
    }
}
