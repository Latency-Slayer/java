package ETL;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    public List<String> mapHeader(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        CSVParser parser = CSVFormat.DEFAULT.parse(reader); //leitura do arquivo CSV
        return new ArrayList<>(parser.getHeaderMap().keySet()); //Pegar o header do CSV
    }
    public List<List<Double>> mapComponentData(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);

        List<List<Double>> listaDados = new ArrayList<>();

        //CSVRecord representa um linha no meu CSV
        for (CSVRecord row : parser){

        }

        return listaDados;
    }
}
