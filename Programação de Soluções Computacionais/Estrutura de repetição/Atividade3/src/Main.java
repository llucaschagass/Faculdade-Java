import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, contador =0, dobro;
        Scanner scan = new Scanner(System.in);

        while (contador < 5){
            System.out.println("Digite um número e veja o dobro de seu valor: ");
            num1 = scan.nextInt();

            dobro = num1 * 2;

            System.out.println("O dobro do número digitado é: " + dobro);

            contador = contador+1;

        }

        System.out.println("Fim! Muito obrigado.");

    }
}