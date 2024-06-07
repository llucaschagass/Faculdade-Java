import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matricula;
        double nota1, nota2, nota3, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de matricula: ");
        matricula = scan.nextInt();

        while (matricula >= 0){
            System.out.println("Digite a primeira nota: ");
            nota1 = scan.nextDouble();

            System.out.println("Digite a segunda nota: ");
            nota2 = scan.nextDouble();

            System.out.println("Digite a terceira nota: ");
            nota3 = scan.nextDouble();

            media = (nota1+nota2+nota3)/3;

            if (media >= 70){
                System.out.println("A média do aluno foi: " + media);
                System.out.println("Aluno APROVADO");

            }
            else if (media >=60){
                System.out.println("A média do aluno foi: " + media);
                System.out.println("Aluno irá realizar o EXAME");

            }
            else if (media >0 && media <60) {
                System.out.println("A média do aluno foi: " + media);
                System.out.println("Aluno REPROVADO");

            }
            else{
                System.out.println("Ops, você deve ter digitado alguma nota negativa");
            }

            System.out.println("Digite o número de matricula: ");
            matricula = scan.nextInt();
        }

    }
}