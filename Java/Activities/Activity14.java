package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:\\Users\\002BPM744\\Project\\src\\main\\java\\Activities\\newfile.txt");
            boolean fStatus = file.createNewFile();
            /*
            writeStringToFile is depricated so unable to write anything in file so added the test manually
            String text = "This is a newly created file";
            FileUtils.writeStringToFile(file, text);
            */
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            File fileUtil = FileUtils.getFile("C:\\Users\\002BPM744\\Project\\src\\main\\java\\Activities\\newfile.txt");

            System.out.println("Text in the file: " + FileUtils.readFileToString(fileUtil, "UTF8"));


            File directory = new File("resources");

            FileUtils.copyFileToDirectory(file, directory);

            File newFile = FileUtils.getFile(directory, "newfile.txt");

            String fileData = FileUtils.readFileToString(newFile, "UTF8");

            System.out.println("Text in the new file: " + fileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}
