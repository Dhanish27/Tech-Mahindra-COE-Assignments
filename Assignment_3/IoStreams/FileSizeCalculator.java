package IoStreams;

import java.io.File;

public class FileSizeCalculator {
    public static void main(String[] args) {
        String filePath = "D:\\Tech Mahindra\\Java\\TechMAssignments\\Assignment_3\\IoStreams\\CheckFilePermissions.java"; 

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            System.out.println("File Size:");
            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + String.format("%.2f", fileSizeInKB));
            System.out.println("MB: " + String.format("%.2f", fileSizeInMB));
        } else {
            System.out.println("The file does not exist or is not a valid file: " + filePath);
        }
    }
}