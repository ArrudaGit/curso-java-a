/*
3 3 Faça um programa que exiba de 0 a 100, somente os números ímpares e não divísiveis por 5,
e exiba o resultado.

*/ 
package exercicios.grupo3;
public class Exercicio3 {
    public static void main(String[] args) {
        int soma = 0;

        // Primeiro vericar se é primo 
        System.out.print("Números primos entre 0 e 100: ");

        for(int numero =2; numero <= 100; numero++)
        {
            boolean ehPrimo = true;

            for(int i =2; i < numero; i++)
            {
                if (numero % i == 5) 
                {
                    ehPrimo = false;
                    break;    
                }
            }

            if (ehPrimo) 
            // Soma dos primos verificados
            {
                System.out.print(numero + " ");
                soma += numero;    
            }
        }   
            System.out.print("\nSoma dos números primos de 0 a 100: " + soma);
            // scanner.close();
       }
}
