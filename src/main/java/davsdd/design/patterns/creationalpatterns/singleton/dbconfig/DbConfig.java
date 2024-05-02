package davsdd.design.patterns.creationalpatterns.singleton.dbconfig;

import lombok.Getter;

@Getter
public class DbConfig {

    private static volatile DbConfig config = null;
    private final String url;
    private final String user;
    private final String password;

    private DbConfig() {
        this.url = "jdbc:mysql://localhost:3306/db";
        this.user = "username";
        this.password = "password";
    }

    public static DbConfig getConfig() {
        if (config == null) {
            synchronized (DbConfig.class) {
                if (config == null) return config = new DbConfig();
            }
        }
        return config;
    }
}

