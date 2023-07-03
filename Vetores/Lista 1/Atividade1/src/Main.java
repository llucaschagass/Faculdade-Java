import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor [] = new int[5],soma = 0, media, i;

        for (i = 0; i<=4; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            vetor[i] = scan.nextInt();
            soma = soma + vetor[i];

        }
        System.out.println("A soma é: " + soma);
        media = soma/ vetor.length;
        System.out.println("A média é: " + media);
    }
}