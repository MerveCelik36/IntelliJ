package Class31;

import Syntax.Utility.ConfigReader;
import Syntax.Utility.Constants;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {
        Properties properties= ConfigReader.read(Constants.ConfigReaderPath);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}
