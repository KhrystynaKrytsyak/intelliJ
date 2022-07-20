package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        // this Demo shows how to read Properties files
        //Steps to read a file:
        // we need to know the path/location of file
        String path = "Files/Config.properties";
        //Navigating to that path where file is stored
        FileInputStream fileInputStream=new FileInputStream(path);
        // we need special software that understands that file that we can use to open and edit that file.
        Properties properties = new Properties();
        //loading all the data from the file inside the properties objects
        properties.load(fileInputStream);

        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));

        fileInputStream.close();
    }
}
