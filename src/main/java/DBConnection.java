import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection(){
         try{
             String jdbcUrl = ("jdbc:postgresql://localhost:5432/mini_dish_db");
             String user = ("mini_dish_db_manager");
             String password = "123456";
             return DriverManager.getConnection(jdbcUrl, user, password);
         } catch (SQLException e){
             throw new RuntimeException(e);
         }
    }

    public void closeConnection(Connection connection){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
