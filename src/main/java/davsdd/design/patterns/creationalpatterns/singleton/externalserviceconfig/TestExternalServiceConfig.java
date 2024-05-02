package davsdd.design.patterns.creationalpatterns.singleton.externalserviceconfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestExternalServiceConfig {
    public static void main(String[] args) {
        ExternalServiceConfig config = ExternalServiceConfig.getConfig();
        URL url = IUrl.handleUrl(config.getApiUrl());
        HttpURLConnection httpURLConnection = IHttpURLConnection.getUrlConnection(url);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder builder = new StringBuilder();
            IDataReader.readData(bufferedReader, builder);
            bufferedReader.close();
            httpURLConnection.disconnect();
            IJSONData.printData(builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
