package davsdd.design.patterns.creationalpatterns.singleton.dbconfig;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
class TestDbConfig {
    public static void main(String[] args) {
        DbConfig config = DbConfig.getConfig();
        try {
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            connection.close();
            log.info("Success: DataBase connected!");
        } catch (SQLException e) {
            log.error("Error: DataBase couldn't connect!");
            throw new RuntimeException(e.getMessage());
        }
    }
}
