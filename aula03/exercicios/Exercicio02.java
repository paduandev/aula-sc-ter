package exercicios;

import java.util.Scanner;

/* 
 * Escreva um progrma em Java para ler um conjunto de valores digitados pelo usuário
 * e exibir a soma dos valores positivos digitados.
 * O conjunto de números será inteiro, e a entrada termina quando o usuário digitar zero.
 * 
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while (numero != 0) {
            System.out.println("Digite um número inteiro (zero termina): ");
            numero = teclado.nextInt();
            if(numero > 0) {
                soma = soma + numero;
            }
        }

        System.out.println("Soma = " + soma) ;

        teclado.close();
    }
}
