package davsdd.design.patterns.creationalpatterns.singleton.externalserviceconfig;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public interface IHttpURLConnection {
    static HttpURLConnection getUrlConnection(URL url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            return connection;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
