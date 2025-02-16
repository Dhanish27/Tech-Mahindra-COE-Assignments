package IoStreams;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {
    public static void main(String[] args) {
        String filePath = "D:\\Tech Mahindra\\Java\\Hanif.txt"; 

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                System.out.println("File content:");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("The file does not exist or is not a valid file: " + filePath);
        }
    }
}

