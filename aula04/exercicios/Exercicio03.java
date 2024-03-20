package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int NUMERO_ELEITORES = 50; // valor constante
        int voto;
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0,
                votosCandidato4 = 0, votosBrancos = 0, votosNulos = 0;
        int votosValidos;

        for (int cont = 1; cont <= NUMERO_ELEITORES; cont++) {
            System.out.println("Informe o seu voto: ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;

                default:
                    System.out.println("Número incorreto.");
                    cont--;
                    break;
            }
        }

        teclado.close();

        // Processamento

        votosValidos = NUMERO_ELEITORES - votosBrancos - votosNulos;

        System.out.println("Votos do candidato 1: " + votosCandidato1);
        System.out.println("Total válido do candidato 1: " + ((double) votosCandidato1 / votosValidos * 100) + " %");
        System.out.println("Votos do candidato 2: " + votosCandidato2);
        System.out.println("Total válido do candidato 2: " + ((double) votosCandidato2 / votosValidos * 100) + " %");
        System.out.println("Votos do candidato 3: " + votosCandidato3);
        System.out.println("Total válido do candidato 3: " + ((double) votosCandidato3 / votosValidos * 100) + " %");
        System.out.println("Votos do candidato 4: " + votosCandidato4);
        System.out.println("Total válido do candidato 4: " + ((double) votosCandidato4 / votosValidos * 100) + " %");
        System.out.println("Total de votos Nulos: " + votosNulos);
        System.out.println("Total de votos Brancos: " + votosBrancos);
        System.out.println("Brancos e Nulos = " + ((double)votosBrancos + votosNulos) / NUMERO_ELEITORES * 100 + " %");
        
    }
}
