package ETL;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {
    public ByteArrayOutputStream writeCsv(List<String> cabecalho, List<List<Double>> componentData) throws IOException {
        // Criar um CSV em memória utilizando ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(cabecalho.toArray(new String[0])));

        for (List<Double> linha : componentData) {
            List<String> linhaFormatada = new ArrayList<>();

            for (int i = 0; i < cabecalho.size(); i++) {
                Double valor = linha.get(i);
                String[] partesCabecalho = cabecalho.get(i).split("_");

                //tipo_nome_metrica
                if (partesCabecalho.length >= 3 && partesCabecalho[2].equals("%")) {
                    linhaFormatada.add(String.format("%.0f", valor));
                } else {
                    linhaFormatada.add(String.format("%.1f", valor));
                }
            }
            csvPrinter.printRecord(linhaFormatada);
        }
        csvPrinter.flush();
        writer.close();

        // Retornar o ByteArrayOutputStream que contém o CSV gerado
        return outputStream;
    }
}
