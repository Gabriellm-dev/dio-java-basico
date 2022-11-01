package Exercicios.Loops;

/*
 * Faça um programa que leia 5 numeros e informe o valor valor e a media desses
 * numeros.
 */

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int count = 0;
            int maior = 0;
            double soma = 0;
            do {

                System.out.println("Numero: ");
                numero = scan.nextInt();

                soma = soma + numero;
  
                if(numero>maior) maior = numero;

                count = count + 1;

            } while(count < 5);
            
            System.out.println("Maior = "  + maior);
            System.out.println("Média = " + soma/5);
        }
    } 
}
