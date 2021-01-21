package com.weborders.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

      private static Properties properties = new Properties();
    static {
        try {
            //try with resources
            //allows to automatically close input stream when object is not used any more
            //works only for the classes that implement AutoCloseable interface
            //#2- We get the path and pass it into FileInputStream, to open the file
            InputStream file = new FileInputStream("configuration.properties");
            //#3- We load the opened file into properties object
            properties.load(file);
            //#5- close the file
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration.properties file!");
        }
    }
    //#4- We read from file: we will be creating a utility method for reading.
    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }


}
