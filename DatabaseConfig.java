import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConfig {
    // 1. Define the location of your database file
    private static final String URL = "jdbc:sqlite:exam_portal.db";

    public static Connection getConnection() throws SQLException {
        // 2. This returns a connection object to use in other parts of the app
        return DriverManager.getConnection(URL);
    }

    public static void initializeDatabase() {
        // 3. This creates the 'Questions' table automatically if it doesn't exist
        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS questions (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                question_text TEXT NOT NULL,
                option_a TEXT,
                option_b TEXT,
                option_c TEXT,
                option_d TEXT,
                correct_option TEXT
            );
            """;

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Database Initialized Successfully!");
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}