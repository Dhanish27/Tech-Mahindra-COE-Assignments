package IoStreams;

import java.io.File;

public class FileOrDirectoryExist {
    public static void main(String[] args) {
        String path = "D:\\Tech Mahindra\\Java";         
        File file = new File(path);

        if (file.exists()) {
            System.out.println("The file or directory exists: " + path);
        } else {
            System.out.println("The file or directory does not exist: " + path);
        }
    }
}
