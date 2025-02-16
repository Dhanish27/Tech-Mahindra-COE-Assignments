package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDeleteJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; 
    private static final String USER = "Dhanish"; 
    private static final String PASSWORD = "DC27"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to Database!");

            // Take user input for deleting a row
            System.out.print("Enter Student ID to delete: ");
            int id = scanner.nextInt();

            // Perform delete operation
            deleteRow(conn, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteRow(Connection conn, int id) throws SQLException {
        String deleteSQL = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully deleted student with ID: " + id);
            } else {
                System.out.println("No student found with ID: " + id);
            }
        }
    }
}

