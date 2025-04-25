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
    public ByteArrayOutputStream writeCsv(List<String> cabecalho, List<List<String>> componentData) throws IOException {
        // Criar um CSV em memória utilizando ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(cabecalho.toArray(new String[0])));

        for (List<String> linha : componentData) {
            csvPrinter.printRecord(componentData);
        }
        csvPrinter.flush();
        writer.close();

        // Retornar o ByteArrayOutputStream que contém o CSV gerado
        return outputStream;
    }
}
