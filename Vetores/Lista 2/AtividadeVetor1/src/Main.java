
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int tamanhoVetor = 5;
        int[] vetor = new int[tamanhoVetor];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os " + tamanhoVetor + " números inteiros:");

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }
    }
}
