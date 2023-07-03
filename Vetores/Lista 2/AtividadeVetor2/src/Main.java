import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        double[] vetor = new double[tamanhoVetor];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os " + tamanhoVetor + " números:");

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Números digitados em ordem inversa:");

        for (int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}