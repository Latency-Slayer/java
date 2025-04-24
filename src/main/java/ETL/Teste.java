package ETL;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
   public static void header(String... valores) {
       System.out.println(Arrays.toString(valores));
   }


    public static void main(String[] args) {
       List<String> cabecalho = List.of("CPU", "RAM", "Disco");

        header(cabecalho.toArray(new String[0]));
    }



}
