package ETL;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CsvWriter {
    public ByteArrayOutputStream writeCsv(List<Components> component) throws IOException {
        // Criar um CSV em memória utilizando ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("storage_C:\\_GB", "storage_C:\\_%", "CPU_%", "ram_DDR4_GB", "ram_DDR4_%"));

        // Processar e escrever cada objeto no CSV
        for (Components stock : component) {
            csvPrinter.printRecord(
                    stock.getStorage_C_GB(),
                    stock.getStorage_C_percent(),
                    stock.getCpu_percent(),
                    stock.getRam_DDR4_GB(),
                    stock.getRam_DDR4_percent()
            );
        }

        // Fechar o CSV para garantir que todos os dados sejam escritos
        csvPrinter.flush();
        writer.close();

        // Retornar o ByteArrayOutputStream que contém o CSV gerado
        return outputStream;
    }
}
