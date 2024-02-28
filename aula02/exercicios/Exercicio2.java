package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double salarioBruto, valorPrestacao;
        double prestacaoMaxima;
        String resposta;
        Scanner teclado = new Scanner(System.in);

        // entrada
        System.out.println("Informe o valor do salário bruto:");
        salarioBruto = teclado.nextDouble();
        System.out.println("Informe o valor da prestação:");
        valorPrestacao = teclado.nextDouble();

        // processamento 
        prestacaoMaxima = salarioBruto * 0.3;
        
        if(valorPrestacao <= prestacaoMaxima) {
             resposta = "Pode receber o empréstimo";
        } else {
            resposta = "O emprestimo não pode ser feito";
        }

        //saída
        System.out.println(resposta);

        teclado.close();
    }
}
