package IoStreams;
import java.io.File;

public class CheckFilePermissions {
    public static void main(String[] args) {
        String path = "D:\\Tech Mahindra\\Java"; 

        File file = new File(path);

        if (file.exists()) {
            System.out.println("The file or directory exists: " + path);
            
            if (file.canRead()) {
                System.out.println("The file or directory has read permission.");
            } else {
                System.out.println("The file or directory does NOT have read permission.");
            }
            
            if (file.canWrite()) {
                System.out.println("The file or directory has write permission.");
            } else {
                System.out.println("The file or directory does NOT have write permission.");
            }
        } else {
            System.out.println("The file or directory does not exist: " + path);
        }
    }
}
