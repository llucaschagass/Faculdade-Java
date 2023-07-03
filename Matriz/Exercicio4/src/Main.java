import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha a matriz1:");
        preencherMatriz(matriz1, scanner);

        System.out.println("Preencha a matriz2:");
        preencherMatriz(matriz2, scanner);

        multiplicarMatrizes(matriz1, matriz2, resultado);

        System.out.println("A matriz resultado da multiplicação é:");
        exibirMatriz(resultado);
    }

    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void multiplicarMatrizes(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}