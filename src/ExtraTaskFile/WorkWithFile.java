package ExtraTaskFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


public class WorkWithFile {
    private final String PATH_TO_FILE = "/home/roman/IdeaProjects/LearnJava.Siforov.G4/src/";

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private String folderName = simpleDateFormat.format(new Date(System.currentTimeMillis()))+"/";
    private String exactFileName = "massive-"+simpleDateFormat.format(new Date(System.currentTimeMillis())) + ".txt";


    private void createFolder() {
        String pathToDirectory = PATH_TO_FILE + folderName;
        if (new File(pathToDirectory).isDirectory()) {
            System.out.println("The folder already exists");
        } else {
            System.out.println("No such folder. Creating ...");
            new File(pathToDirectory).mkdir();
        }
    }

    public void createFile() {
            File file = new File(PATH_TO_FILE +folderName+ exactFileName);
            createFolder();
            try {
                if (file.createNewFile()) {
                    System.out.println("The file " + exactFileName + " has been created");
                }else{
                    System.out.println("The file already exists");
                }
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }

    }

    public boolean checkFileSize(String fileName){
        boolean flag = true;
        Path path = Paths.get(fileName);
        try{
            long sizeInKiloBytes =Files.size(path)/1024;
            System.out.println(String.format("%,d kilobytes", sizeInKiloBytes/1024));
            if (sizeInKiloBytes > 5){
                System.out.println("This size is more than 5 KBytes");
                flag=false;
            }
            else{
                System.out.println("This size is less than 5 KBytes");
            }
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return flag;
    }

}
