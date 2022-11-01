package Exercicios.Loops;

import java.util.Scanner;
/* 
  Programa que lê dois valores, o primeiro representa o nome do aluno,
  e o segundo a idade, pare usando o valor 0 no campo nome.
 */
public class NomeIdade {

        public static void main(String[] args) {
            
            try (Scanner scan = new Scanner(System.in)) {
                String nome;
                
                int idade;

                while(true){
                    System.out.println("Nome: ");
                nome = scan.next();

                if (nome.equals("0")) break;
                
                System.out.println("Idade: ");
                idade = scan.nextInt();

                }
            }    
        }
    }
