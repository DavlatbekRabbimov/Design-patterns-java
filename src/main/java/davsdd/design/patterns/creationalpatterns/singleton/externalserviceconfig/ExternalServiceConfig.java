package davsdd.design.patterns.creationalpatterns.singleton.externalserviceconfig;

import lombok.Getter;

@Getter
public class ExternalServiceConfig {

    private static volatile ExternalServiceConfig config = null;
    private final String apiUrl;

    private ExternalServiceConfig() {
        this.apiUrl = "https://api.coinlore.net/api/tickers/";
    }

    public static ExternalServiceConfig getConfig() {
        if (config == null) {
            synchronized (ExternalServiceConfig.class) {
                if (config == null) return config = new ExternalServiceConfig();
            }
        }
        return config;
    }
}
