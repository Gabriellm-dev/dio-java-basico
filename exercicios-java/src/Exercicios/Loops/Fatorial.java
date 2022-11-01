package Exercicios.Loops;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 * ex: 5!=120 (5x4x3x2x1)
 */

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Fatorial de: ");
            
            int fatorial = scan.nextInt();
            
            int multiplicador = 1;
            
            System.out.print(fatorial + "! = ");
            
            for(int i = fatorial; i >=1 ; i-- ){
                multiplicador = multiplicador * i;
            }

                System.out.print(multiplicador);
        }
    }
    
}
