package exercicios;

/* 
 * Escreva um programa em Java para fazer a contagem regressava de 10 até 1
 * e ao final imprimir a palavra FOGO!
 * 
*/

public class Exercicio01 {
    public static void main(String[] args) {
        int cont;

        cont = 10; 

        while( cont > 0 ) { 
            System.out.println(cont);
            cont = cont - 1; 
        }

        System.out.println("FOGO!!!");
    }
}
