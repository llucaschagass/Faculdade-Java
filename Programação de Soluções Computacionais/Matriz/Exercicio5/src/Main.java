import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        int maiorValor = matriz[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("A matriz completa é:");
        exibirMatriz(matriz);

        System.out.println("O maior valor na matriz é: " + maiorValor);
    }
    
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}