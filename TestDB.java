import java.sql.*;

public class TestDB {
    public static void main(String[] args) {
        try {
            // FORCE LOAD THE DRIVER
            // This tells Java: "Go find the SQLite class in the JAR file right now"
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:my_exam_database.db";
            Connection conn = DriverManager.getConnection(url);

            if (conn != null) {
                System.out.println("Success! Database connected and created.");
                // Create a small table to confirm it's working
                Statement stmt = conn.createStatement();
                stmt.execute("CREATE TABLE IF NOT EXISTS admin (id INTEGER);");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("CRITICAL ERROR: The SQLite JAR file is NOT in your Referenced Libraries.");
        } catch (SQLException e) {
            System.out.println("DATABASE ERROR: " + e.getMessage());
        }
    }
}