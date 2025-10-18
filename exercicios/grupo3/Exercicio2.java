/**
 * P2 3 

 *  Faça um programa que some de 0 a 100 somente os números primos, e exiba o resultado.
    Número primo é aquele que é divisível somente por ele mesmo e pelo número 1.
    
    ## 1 começar em 0, 2 testar 0 a 100 para checar os primos 3 depois de checar se é primo, 
        somar os primos e guardar o resultado na variavel soma;
*/
package exercicios.grupo3;


public class Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;

        // Primeiro vericar se é primo 
        System.out.print("Números primos entre 0 e 100: ");

        for(int numero =2; numero <= 100; numero++)
        {
            boolean ehPrimo = true;

            for(int i =2; i < numero; i++)
            {
                if (numero % i == 0) 
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
