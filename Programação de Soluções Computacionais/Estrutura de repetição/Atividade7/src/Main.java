import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5;

        System.out.println("Digite 5 notas: ");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        nota4 = scan.nextDouble();
        nota5 = scan.nextDouble();


        double maiorNota = nota1;

        if (nota2 > maiorNota) {
            maiorNota = nota2;
        }
        if (nota3 > maiorNota) {
            maiorNota = nota3;
        }
        if (nota4 > maiorNota) {
            maiorNota = nota4;
        }
        if (nota5 > maiorNota) {
            maiorNota = nota5;
        }

        System.out.println("A maior nota é: " + maiorNota);
        
    }
}