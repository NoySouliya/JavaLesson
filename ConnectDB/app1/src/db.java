import java.sql.*;

public class db {
    public static Connection ConnectDB() {
        try {
            String url = "jdbc:mysql://localhost/db_student";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
            return con;
        } catch (SQLException e) {
            System.out.println("Error in connection");
            return null;
        }
    }

    public static void main(String[] args) {
        new db();
        db.ConnectDB();
    }
}
