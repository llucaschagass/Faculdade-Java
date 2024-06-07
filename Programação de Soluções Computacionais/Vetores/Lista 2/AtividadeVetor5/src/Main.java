import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        int[] vetor = new int[tamanhoVetor];
        int[] par = new int[tamanhoVetor];
        int[] impar = new int[tamanhoVetor];
        int contadorPar = 0;
        int contadorImpar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os " + tamanhoVetor + " números inteiros:");

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                par[contadorPar] = vetor[i];
                contadorPar++;
            } else {
                impar[contadorImpar] = vetor[i];
                contadorImpar++;
            }
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}
