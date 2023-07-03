import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int filhos = 0, mediafilhos, contador = 0;
        double salario = 0, mediasalario, condicao;

        Scanner scan = new Scanner(System.in);

        do {
            contador = contador + 1;
            System.out.println("Digite a quantidade de filhos:");
            filhos = filhos + scan.nextInt();
            System.out.println("Digite seu salário: ");
            condicao = scan.nextDouble();

            salario = salario + condicao;

        }

        while (condicao >= 0);

        mediafilhos = filhos/contador;
        mediasalario = salario/contador;

        System.out.println("A média de filhos é: " + mediafilhos);
        System.out.println("A média de salário é: " + mediasalario);





    }
}