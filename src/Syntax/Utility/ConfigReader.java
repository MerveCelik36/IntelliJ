package Syntax.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path)  {

        // Properties class that handles the .properties files
        Properties properties=new Properties();
        FileInputStream fileInputStream=null;
        try{
            //Navigate to that location
            fileInputStream=new FileInputStream(path);

            //Loads the data from the HardDrive to RAM
            properties.load(fileInputStream);
        }catch (IOException io){
            System.out.println("Please check the file at this path if it is present path = "+path);
            io.printStackTrace();
        }finally {
            if(fileInputStream!=null){
                try{
                    fileInputStream.close();
                }catch (IOException ioException){
                    System.out.println("Error while closing the file");
                    ioException.printStackTrace();
                }

            }

        }
        return properties;
    }
}
