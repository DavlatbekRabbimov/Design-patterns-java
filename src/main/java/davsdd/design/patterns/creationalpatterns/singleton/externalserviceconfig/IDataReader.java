package davsdd.design.patterns.creationalpatterns.singleton.externalserviceconfig;

import java.io.BufferedReader;
import java.io.IOException;

public interface IDataReader {
    static void readData(BufferedReader bufferedReader, StringBuilder builder) {
        try {
            String dataLine;
            while ((dataLine = bufferedReader.readLine()) != null) {
                builder.append(dataLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
