/**
 * 3 3.1  Números Pares: Escreva um algoritmo que imprima 
 *        apenas os números pares de 2 a 20.
 * 
 */
package exercicios.grupo3_1;

public class Exercicio03 {
    
    public static void main(String[] args) 
    {
        for(int numero =2; numero <= 20; numero++)
        {
            if (numero % 2 == 0) 
            {
                System.out.print(numero + " ");
                
            }
        }
        
   
    }
} 