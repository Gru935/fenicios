import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Integer count = 0;
        Integer height = 0;
        Integer width = 0;
        String map[][];
        // ArrayList<String> map = new ArrayList<String>();
        String diretorio = Paths.get("").toAbsolutePath().toString();
        String nomeCompleto = diretorio + "\\" + "caso01.txt";

        try {
            File texto = new File(nomeCompleto);
            FileInputStream arquivo = new FileInputStream(texto);
            InputStreamReader input = new InputStreamReader(arquivo);

            try (BufferedReader leitor = new BufferedReader(input)) {
                String linha = "";
                while ((linha = leitor.readLine()) != null && count == 0) {
                    String[] strs = linha.split(" ");
                    height = Integer.parseInt(strs[0]);
                    width = Integer.parseInt(strs[1]);
                    count++;
                }

                map = new String[height][width];
                while ((linha = leitor.readLine()) != null) {
                    String[] strs = linha.split("");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            map[i][j] = strs[j];
                            System.out.println(strs[j]);
                        }
                    }
                }

            } catch (IOException e) {
                System.err.format("Erro na leitura de linhas", e);
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.err.format("Erro na leitura do arquivo", e);
            e.printStackTrace();
        }
    }
}