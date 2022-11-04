package Exercicios.Arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 numeros inteiros aleatorios
 * (entre 0 e 100) armazene- os num vetor, e ao final mostre
 * os numeros e seus sucessores.
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        
        System.out.print("Sucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.print("Antecessor dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
