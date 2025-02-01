package com.unitedcoder.configutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfig {

    //write a method to read from a configuration file
     public String readConfigurationFile(String filename,String key)
     {
         Properties properties=new Properties();
         //get current root folder
         String projectFolder=System.getProperty("user.dir");
         try {
             properties.load(new FileInputStream(projectFolder+ File.separator+filename));
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         String value=properties.getProperty(key);
         return value;
     }
}
