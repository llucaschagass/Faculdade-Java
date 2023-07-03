import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[6];
        int[] pares = new int[6];
        int[] impares = new int[6];
        int contadorPares = 0;
        int contadorImpares = 0;

        System.out.println("Digite 6 números:");

        for (int i = 0; i < 6; i++) {
            numeros[i] = scan.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        System.out.println("Números pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Números ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}
