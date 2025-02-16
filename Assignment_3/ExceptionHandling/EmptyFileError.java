package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileEmptyException extends Exception {
    public FileEmptyException(String message) {
        super(message);
    }
}

public class EmptyFileError {

    public static void isFileEmpty(String filePath) throws FileEmptyException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            if (reader.readLine() == null) { 
                throw new FileEmptyException("File is empty: " + filePath);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "D:\\Tech Mahindra\\Java\\EmptyFile.txt";
        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            try {
                isFileEmpty(filePath);
                System.out.println("File is not empty.");
            } catch (FileEmptyException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File Does Not Exist or It’s a Directory");
        }
    }
}
