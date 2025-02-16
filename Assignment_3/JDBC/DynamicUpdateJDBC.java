package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdateJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; 
    private static final String USER = "Dhanish"; 
    private static final String PASSWORD = "dc27"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to Database!");

            // Take user input for updating a row
            System.out.print("Enter Student ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter new age: ");
            int newAge = scanner.nextInt();

            // Perform update
            updateRow(conn, id, newName, newAge);
            System.out.println("Row updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateRow(Connection conn, int id, String newName, int newAge) throws SQLException {
        String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, newAge);
            pstmt.setInt(3, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully updated student with ID: " + id);
            } else {
                System.out.println("No student found with ID: " + id);
            }
        }
    }
}

