package com.demoblaze.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static{ // helps us run our logic once before everything else and sets the properties object

        try {
            // 1 - We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            // 2 - Load the properties object using FileInputStream object and handle it in case the file isn't found
            properties.load(file);

            // 3 - close the file
            file.close();

        }catch (IOException e){
            System.out.println("File not found in the ConfigurationReader class.");
        }

    }

    // when we call this method all the above stuff will be already happened, that's why we do not use getProperty method right away
    // getProperty method returns the value of the key
    public static String getProperty(String key){

        return properties.getProperty(key);

    }


}
