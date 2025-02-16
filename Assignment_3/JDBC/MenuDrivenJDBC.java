package JDBC;

import java.sql.*;
import java.util.Scanner;

public class MenuDrivenJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; 
    private static final String USER = "Dhanish"; 
    private static final String PASSWORD = "DC27"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to Database!");

            while (true) {
                System.out.println("\nMENU:");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        insertRow(conn, scanner);
                        break;
                    case 2:
                        updateRow(conn, scanner);
                        break;
                    case 3:
                        deleteRow(conn, scanner);
                        break;
                    case 4:
                        selectRow(conn, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert a new row into the table
    private static void insertRow(Connection conn, Scanner scanner) throws SQLException {
        String insertSQL = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Row Inserted Successfully!");
            }
        }
    }

    // Update an existing row in the table
    private static void updateRow(Connection conn, Scanner scanner) throws SQLException {
        String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            System.out.print("Enter Student ID to Update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter New Age: ");
            int age = scanner.nextInt();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Row Updated Successfully!");
            } else {
                System.out.println("No Student Found with ID: " + id);
            }
        }
    }

    // Delete a row from the table
    private static void deleteRow(Connection conn, Scanner scanner) throws SQLException {
        String deleteSQL = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            System.out.print("Enter Student ID to Delete: ");
            int id = scanner.nextInt();

            pstmt.setInt(1, id);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Row Deleted Successfully!");
            } else {
                System.out.println("No Student Found with ID: " + id);
            }
        }
    }

    // Select a row from the table
    private static void selectRow(Connection conn, Scanner scanner) throws SQLException {
        String selectSQL = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
            System.out.print("Enter Student ID to View: ");
            int id = scanner.nextInt();

            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Age: " + rs.getInt("age"));
                } else {
                    System.out.println("No Student Found with ID: " + id);
                }
            }
        }
    }
}

