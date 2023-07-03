import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        System.out.print("Os números ímpares de 1 até " + numero + " são: ");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}