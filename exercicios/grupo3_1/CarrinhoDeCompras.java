package exercicios.grupo3_1;
// loop - idade / grupo de idade

import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 12) 
        {
            System.out.println("Você é uma criança.");    
        }
        else if (idade <= 17)
        {
            System.out.print("Você é um adolecente");
        }
        else if (idade <= 59) 
        {
            System.out.println("Você é um adulto.");
        }
        else
        {
            System.out.println("Você é uma pessoa idosa.");
        }

        sc.close();
    }}