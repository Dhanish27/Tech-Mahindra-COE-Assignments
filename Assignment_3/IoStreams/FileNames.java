package IoStreams;

import java.io.File;


public class FileNames {
    public static void main(String[] args) {
        String directoryPath="D:\\Tech Mahindra\\Java";
        File directory = new File(directoryPath);

        String[] fileList = directory.list();

        if(fileList!=null){
            System.out.println("Files and Directories in : "+directoryPath);
            for(String filename : fileList){
                System.out.println(filename);
            }
        }
        else{
            System.out.println("The directory does not exist or is empty");
        }

    }
}
