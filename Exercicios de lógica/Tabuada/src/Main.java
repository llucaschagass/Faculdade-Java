/*
Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número
inteiro entre 1 e 10. O usuário deve informar de qual número deseja ver a tabuada.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite de qual número você deseja a tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int count = 1; count <=10 ; count++){
            System.out.println(tabuada + "x" + count + "=" + (tabuada*count));

        }



    }
}