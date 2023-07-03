import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int masculino = 0, feminino = 0, peso, contador = 0;
        String sexo;

        while (contador <= 10){
            System.out.println("Digite o sexo da pessoa: ");
            sexo = scan.next();
            System.out.println("Digite o peso da pessoa: ");
            peso = scan.nextInt();

            if (sexo == "masculino" && peso >=60 && peso <=80){
                masculino = masculino++;
            }
            else if (sexo == "feminino" && peso >=50 && peso <=70){
                feminino = feminino++;
            }

            contador++;


        }

        System.out.println("A quantidade de Homens que se enquadram nos requisitos é: ");
        System.out.println(masculino);
        System.out.println("A quantidade de mulheres que se enquadram nos requisitos é: ");
        System.out.println(feminino);


    }
}