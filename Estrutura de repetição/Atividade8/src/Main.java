import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaidade, peso, somaidade = 0;
        int idade = 0, contador = 1, quantpessoas =0;

        while (contador <=7){
            System.out.println("Digite a idade:");
            idade = scan.nextInt();
            somaidade = idade + somaidade;

            System.out.println("Digite o peso:");
            peso = scan.nextDouble();
            if (peso > 90){
                quantpessoas++;
            }


            contador++;
        }
        mediaidade = somaidade / contador;
        System.out.println("A média de idade é: " + mediaidade);
        System.out.println("A quantidade de pessoas acima de 90KG é: " + quantpessoas);

    }
}