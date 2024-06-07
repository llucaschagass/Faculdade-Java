/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
repetindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Digite a nota:");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente a nota:");
            nota = scan.nextInt();

        }
        
    }
}