package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, cont;

        System.out.println("Digite o número limite:");
        limite = teclado.nextInt();

        teclado.close();

        cont = 1;
        while (cont <= limite) {
            System.out.print(cont + " ");
            cont++;
        }
    }
}
