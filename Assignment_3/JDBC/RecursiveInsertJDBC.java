package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecursiveInsertJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; 
    private static final String USER = "Dhanish"; 
    private static final String PASSWORD = "dc27"; 
    private static final String INSERT_SQL = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to Database!");

            // Ensure table exists
            createTable(conn);

            // Data to insert
            Object[][] data = {
                {1, "Alice", 22},
                {2, "Bob", 25},
                {3, "Charlie", 23},
                {4, "David", 24}
            };

            // Start recursive insertion
            insertRecursive(conn, data, 0);
            System.out.println("Rows inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertRecursive(Connection conn, Object[][] data, int index) throws SQLException {
        if (index >= data.length) return; // Base case: Stop recursion

        try (PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL)) {
            pstmt.setInt(1, (int) data[index][0]);   // ID
            pstmt.setString(2, (String) data[index][1]); // Name
            pstmt.setInt(3, (int) data[index][2]);   // Age

            pstmt.executeUpdate(); // Execute insert
        }

        // Recursive call for the next row
        insertRecursive(conn, data, index + 1);
    }

    private static void createTable(Connection conn) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                                "id INT PRIMARY KEY, " +
                                "name VARCHAR(50), " +
                                "age INT)";
        try (PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {
            pstmt.execute();
        }
    }
}

