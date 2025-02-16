package IoStreams;

import java.io.File;

public class CheckFileType {
    public static void main(String[] args) {
        String path = "D:\\Tech Mahindra\\Java\\TechMAssignments\\Assignment_3\\IoStreams\\CheckFilePermissions.java"; 

        File file = new File(path);

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("The given path is a directory.");
            } else if (file.isFile()) {
                System.out.println("The given path is a file.");
            }
        } else {
            System.out.println("The file or directory does not exist: " + path);
        }
    }
}

