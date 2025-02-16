package IoStreams;

import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilter {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "D:\\Tech Mahindra\\Java";
        String extension = ".java"; 

        File directory = new File(directoryPath);

        FilenameFilter filter = (dir, name) -> name.endsWith(extension);  //FilenameFilter is a functional interface and we are overriding it and creating a filter using lambda function

        String[] filesList = directory.list(filter); // using created filter here

        // Check if the directory exists and has matching files
        if (filesList != null && filesList.length > 0) {
            System.out.println("Files with extension " + extension + " in: " + directoryPath);
            for (String fileName : filesList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("No files with extension " + extension + " found in the directory.");
        }
    }
}
