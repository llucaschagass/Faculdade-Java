import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        char[] vetor = new char[tamanhoVetor];
        int contadorConsoantes = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os " + tamanhoVetor + " caracteres:");

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.next().charAt(0);
        }

        System.out.println("Consoantes digitadas:");

        for (int i = 0; i < tamanhoVetor; i++) {
            if (isConsoante(vetor[i])) {
                contadorConsoantes++;
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Total de consoantes: " + contadorConsoantes);
    }

    public static boolean isConsoante(char c) {
        c = Character.toLowerCase(c);
        return (c >= 'b' && c <= 'd') || (c >= 'f' && c <= 'h') ||
                (c >= 'j' && c <= 'n') || (c >= 'p' && c <= 't') ||
                (c >= 'v' && c <= 'z');
    }
}