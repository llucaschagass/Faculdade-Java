import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidadeAlunos = 10;
        double[] medias = new double[quantidadeAlunos];
        int contadorAlunosAprovados = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as quatro notas de cada aluno:");

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1));
            double somaNotas = 0;

            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 4;
            medias[i] = media;

            if (media >= 7.0) {
                contadorAlunosAprovados++;
            }
        }

        System.out.println("Médias dos alunos:");

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contadorAlunosAprovados);
    }
}
