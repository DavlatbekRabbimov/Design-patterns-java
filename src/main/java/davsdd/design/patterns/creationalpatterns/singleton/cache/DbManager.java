package davsdd.design.patterns.creationalpatterns.singleton.cache;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.CompletableFuture;

public class DbManager {

    private final DataSource dataSource;

    public DbManager() {
        this.dataSource = createDataSource();
    }

    private DataSource createDataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/db");
        config.setUsername("username");
        config.setPassword("password");
        return new HikariDataSource(config);
    }

    public CompletableFuture<Object> fetchDataFromDbAsync(String key){
        String sqlQuery = "SELECT * FROM sample WHERE id = ?";
        return CompletableFuture.supplyAsync(() -> {
            Object data = null;
            try(Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sqlQuery);
            ){
                statement.setString(1, key);
                ResultSet result = statement.executeQuery();
                if (result.next()) data = result.getString("Continent");
            }catch (SQLException e){
                e.printStackTrace();
            }
            return data;
        });
    }

}
