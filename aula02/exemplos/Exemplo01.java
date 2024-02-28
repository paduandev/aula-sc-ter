package exemplos;

import java.util.Scanner;

/**
 * Primeiro exemplo de código Java
 * data: 27/02/2024
 */

public class Exemplo01 {

    public static void main(String[] args) {
        int numero1, numero2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        numero1 = teclado.nextInt();
        System.out.println("Digite outro valor inteiro:");
        numero2 = teclado.nextInt();

        soma = numero1 + numero2;
        
        System.out.println("soma = " + soma);
        
        teclado.close();
    }
    
}