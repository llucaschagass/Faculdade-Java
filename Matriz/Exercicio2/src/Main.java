public class Main{
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int valor = 1;

        // Preencher a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Exibir a matriz na forma de uma tabela
        System.out.println("A matriz completa é:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}