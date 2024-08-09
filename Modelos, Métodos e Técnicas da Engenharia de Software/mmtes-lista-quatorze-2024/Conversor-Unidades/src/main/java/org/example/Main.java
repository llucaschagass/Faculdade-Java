package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ConversorDeUnidades conversor = new ConversorDeUnidades();

        while (true) {
            System.out.println("Escolha uma opção de conversão:");
            System.out.println("1. Metros para Quilômetros");
            System.out.println("2. Quilômetros para Metros");
            System.out.println("3. Celsius para Fahrenheit");
            System.out.println("4. Fahrenheit para Celsius");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scan.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scan.nextDouble();
            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = conversor.metrosParaQuilometros(valor);
                    System.out.println(valor + " metros é igual a " + resultado + " quilômetros");
                    break;
                case 2:
                    resultado = conversor.quilometrosParaMetros(valor);
                    System.out.println(valor + " quilômetros é igual a " + resultado + " metros");
                    break;
                case 3:
                    resultado = conversor.celsiusParaFahrenheit(valor);
                    System.out.println(valor + " graus Celsius é igual a " + resultado + " graus Fahrenheit");
                    break;
                case 4:
                    resultado = conversor.fahrenheitParaCelsius(valor);
                    System.out.println(valor + " graus Fahrenheit é igual a " + resultado + " graus Celsius");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }
        scan.close();
    }
}