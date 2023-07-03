import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int quantidadeNotas = 4;
        double[] notas = new double[quantidadeNotas];
        double soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as " + quantidadeNotas + " notas:");

        for (int i = 0; i < quantidadeNotas; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        System.out.println("Notas digitadas:");

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println(notas[i]);
        }

        double media = soma / quantidadeNotas;
        System.out.println("Média: " + media);
    }
}