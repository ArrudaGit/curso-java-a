/**
 4 3.1 Números Ímpares: Elabore um programa que mostre 
    apenas os números ímpares de 1 a 19.
 * 
 */
package exercicios.grupo3_1;

public class Exercicio04 {
    
    public static void main(String[] args) 
    {
        for(int numero = 1; numero <= 19; numero++)
        {
            if (numero % 2 == 1) 
            {
                System.out.print(numero + " ");
                
            }
        }
        
   
    }
} 