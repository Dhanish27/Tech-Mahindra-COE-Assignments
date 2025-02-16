package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

public class ReadFileWithException {
    public static void readFile(String filePath) throws FileNotFoundException, IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("File content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "D:\\Tech Mahindra\\Java\\Hanif.txt"; 
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}