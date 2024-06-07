
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
            String caminho = "C:\\Users\\Lucas\\OneDrive\\Área de Trabalho\\Atividade Julio\\Leitura de arquivos\\Exercicio1\\src\\arquivo.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                String linha;
                int quantlinhas = 0;
                while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
                    quantlinhas = quantlinhas+1;

                }
                System.out.println("A quantidade de linhas é: " + quantlinhas);
            }
            catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }


        }
    }

