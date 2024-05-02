package davsdd.design.patterns.creationalpatterns.singleton.externalserviceconfig;

import java.io.IOException;
import java.net.URL;

public interface IUrl {
    static URL handleUrl(String url) {
        try {
            return new URL(url);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
