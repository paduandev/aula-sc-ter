package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite o númeo da tabuada:");
        numero = teclado.nextInt();

        for(int cont = 0; cont < 11 ; cont++) {
            System.out.println(numero + " X " + cont + " = " + (numero * cont));
        }

        // int cont = 0;
        // while (cont < 10) {
        //     System.out.println(numero + " X " + cont + " = " + (numero * cont));
        //     cont++;
        // }

        teclado.close();
    }
}
