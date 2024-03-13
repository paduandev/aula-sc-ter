package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1; // 1. ponto de início

        while( cont <= 10 ) { // enquanto for verdadeiro, continuar = 2. ponto de parada
            System.out.println(cont);
            cont = cont + 1; // 3. passo (incrementar ou decrementar)
        }

        System.out.println("Fim");
    }
    
}