import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temperatura = 0, contador = 1, dias, media;

        System.out.println("Informe quantos dias você deseja calcular a media de temperatura: ");
        dias = scan.nextInt();

        while (contador <= dias){

            System.out.println("Informe a temperatura do " + contador +"º dia: ");
            temperatura = temperatura +scan.nextInt();
            contador = contador +1;

        }
        media = temperatura/dias;

        System.out.println("A média de temperatura no periodo selecionado foi: " + media);
    }
}