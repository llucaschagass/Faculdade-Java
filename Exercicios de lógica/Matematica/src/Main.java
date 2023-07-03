import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n1,n2, soma, sub,mult;

        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        n2 = scan.nextInt();


        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;

        System.out.println("A soma foi de: " +soma);
        System.out.println("A subtração foi de: " +sub);
        System.out.println("A multiplicação foi de: " +mult);

    }
}