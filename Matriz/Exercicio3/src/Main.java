import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }

        System.out.println("A matriz completa é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}