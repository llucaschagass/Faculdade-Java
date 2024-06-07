/*
Crie um vetor de 6 números inteiros e mostre-os na
ordem inversa.
 */

public class Main {
    public static void main(String[] args) {

        int[] vetor = {4,-5,15,9,63,-74};
        int count =0;
        System.out.println("Vetor: ");

        while (count <= vetor.length-1){
            System.out.println(vetor[count]);
            count++;

        }
        System.out.println("Vetor invertido: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i] + "");
        }

    }
}