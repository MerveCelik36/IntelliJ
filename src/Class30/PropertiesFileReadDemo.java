package Class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {


    String path="Files/Abdul.properties";
    FileInputStream fileInputStream= new FileInputStream(path);

        Properties properties =new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("browser"));
        fileInputStream.close();



    }
}
