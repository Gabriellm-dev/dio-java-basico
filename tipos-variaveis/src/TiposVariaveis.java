public class TiposVariaveis {
    public static void main(String [] args) throws Exception {
     
        //tipos primitivos
        //Classe string que representa texto na aplicação

     String meuNome = "Gabriel";
     String nomeDois = "Lima";

     String nomeCompleto = (meuNome + nomeDois);

     System.out.println(nomeCompleto);

        
     double salarioMinimo = 2500.33d;  
     
     int numero = 5;
     numero = 10;

     int soma1 = 100+50;
     int soma2 = soma1 + 250;
     int soma3 = soma2 + soma2;

     System.out.println("O resultado da soma é = " + soma3);

     System.out.println(meuNome);
     System.out.println(salarioMinimo);
     System.out.println("O resultado é "+ numero);

     
     final double VALOR_DE_PI = 3.14d;
     
        System.out.println("Valor de PI = " + VALOR_DE_PI);

     int numero1 = 1;
     int numero2 = 2;
     
     boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

     System.out.println("Número 1 é igual ao Número 2 ?" + simNao);

     simNao = numero1 != numero2;

     System.out.println("Número 1 é diferente do Número 2 ?" + simNao);
    
     simNao = numero1 > numero2;

     System.out.println("Número 1 é maior que o Número 2 ?" + simNao);

    }
}
