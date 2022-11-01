package Exercicios.Loops;

/* Calcule a quantidade de numeros pares e de numeros impares */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int numero;
            int quantNumeros;
            int quantPares=0, quantImpares=0;

            System.out.println("Quantidade de números que será contado: ");
            quantNumeros = scan.nextInt();

            int count = 0;

            do {

                System.out.println("Digite o número: ");
                numero = scan.nextInt();
            
                if(numero % 2 == 0) quantPares++;
                else quantImpares++;
            
                count++;

            } while(count < quantNumeros);


            System.out.println("A quantidade de Pares = " + quantPares);
            System.out.println("A quantidade de Impares = " + quantImpares);
        }        

    }
    
}
