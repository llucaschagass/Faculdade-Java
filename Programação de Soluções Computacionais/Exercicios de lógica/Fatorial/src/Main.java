/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário

EX: 5! = 120 (5x4x3x2x1 = 120)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        for(int count = fatorial; count >=1; count--){
            multiplicacao = multiplicacao * count;

        }

        System.out.println("O fatorial de " + fatorial + " é: " + multiplicacao);

    }
}