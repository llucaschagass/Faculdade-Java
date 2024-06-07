import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\Lucas\\OneDrive\\Área de Trabalho\\Atividade Julio\\Leitura de arquivos\\Exercicio2\\src\\notas.txt";
        int totalLinhas = 0;
        int totalNotas = 0;
        double somaTotal = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] notas = linha.split(",");
                int quantidadeNotas = notas.length;
                double somaLinha = 0.0;
                for (String nota : notas) {
                    double valorNota = Double.parseDouble(nota.trim());
                    somaLinha += valorNota;
                    somaTotal += valorNota;
                    totalNotas++;
                }
                double mediaLinha = somaLinha / quantidadeNotas;
                System.out.println("Média da linha " + (totalLinhas + 1) + ": " + mediaLinha);
                totalLinhas++;
            }

            if (totalNotas > 0) {
                double mediaTotal = somaTotal / totalNotas;
                System.out.println("Média total das notas: " + mediaTotal);
            } else {
                System.out.println("O arquivo está vazio.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
