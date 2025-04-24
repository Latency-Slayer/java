package ETL;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    public List<List<String>> lerArquivoCSVComSplit(InputStream inputStream) throws  IOException {

        List<List<String>> linhas = new ArrayList<>();
        BufferedReader entrada = null;

        try {
            entrada = new BufferedReader(new InputStreamReader(inputStream,StandardCharsets.UTF_8));
            String[] registro;
            String linha = entrada.readLine();
            while (linha != null){
                registro = linha.split(";");
                linhas.add(Arrays.asList(registro));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
            e.printStackTrace();
        } finally {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return linhas;
    }
}
