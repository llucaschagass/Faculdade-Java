/*
Faça um programa que leia 5 números e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;
        int soma = 0;
        float media;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;
            cont = cont +1;

        }while(cont < 5);
        media = soma/5;
        System.out.println("Maior:" + maior);
        System.out.println("Média: " + media);
        

    }
}