package IoStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {
    public static void main(String[] args) {
        String filePath = "D:\\Tech Mahindra\\Java\\TechMAssignments\\Assignment_3\\IoStreams\\CheckFilePermissions.java"; 

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] fileData = new byte[(int) file.length()];
                fis.read(fileData);
                
                System.out.println("File content in bytes:");
                for (byte b : fileData) {
                    System.out.print(b + " ");
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("The file does not exist or is not a valid file: " + filePath);
        }
    }
}
