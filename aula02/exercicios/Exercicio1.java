package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = entrada.nextDouble();

        // processamento
        // media = (nota1 + nota2) / 2;
        // media = (nota1 * 40 + nota2 * 60) / 100;
        media = nota1 * 0.4 + nota2 * 0.6;

        // saída
        System.out.println("A média é " + media);
        if(media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
