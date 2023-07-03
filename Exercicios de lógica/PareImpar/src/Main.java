/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade
de números impares.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quatNumeros;
        int count = 0;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de números: ");
        quatNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;
            
            count = count+1;

        } while (count < quatNumeros);

        System.out.println("A quantidade de pares é: "+pares);
        System.out.println("A quantidade de impares é:" +impares);
    }
}