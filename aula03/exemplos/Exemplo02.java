package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, soma;
        int cont, qtdeNumeros;

        cont = 1;
        soma = 0;

        System.out.println("Quantos números você quer digitar?");
        qtdeNumeros = entrada.nextInt();

        while( cont <= qtdeNumeros ) { 
            System.out.println("Digite o " + cont + "º valor de " + qtdeNumeros);
            numero = entrada.nextDouble();

            soma = soma + numero;

            cont++; // cont = cont + 1; 
        }

        System.out.println("Soma = " + soma);
        entrada.close();
    }
}
