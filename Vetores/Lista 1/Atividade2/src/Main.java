import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor [] = new int[10];
        int maior = 0, menor = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i<10;i++){
            vetor[i] = scan.nextInt();
        }

        for (int i = 1; i<10; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}