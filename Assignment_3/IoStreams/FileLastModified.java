package IoStreams;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLastModified {
    public static void main(String[] args) {
        String path = "D:\\Tech Mahindra\\Java\\TechMAssignments\\Assignment_3\\IoStreams\\CheckFilePermissions.java"; 

        File file = new File(path);

        if (file.exists()) {
            long lastModified = file.lastModified();
            System.out.println(lastModified);
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(new Date(lastModified));
            
            System.out.println("Last modified date: " + formattedDate);
        } else {
            System.out.println("The file does not exist: " + path);
        }
    }
}

