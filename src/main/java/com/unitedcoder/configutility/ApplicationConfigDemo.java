package com.unitedcoder.configutility;

import com.unitedcoder.io.FileUtility;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ApplicationConfigDemo {
    public static void main(String[] args) {
        String configFile="config.properties";
        ApplicationConfig applicationConfig=new ApplicationConfig();
      String folderName=  applicationConfig.readConfigurationFile(configFile,"file_folder");
        System.out.println("Folder name: "+folderName);
        String amazonUrl=applicationConfig.readConfigurationFile(configFile,"amazon");
        System.out.println("Amazon URL: "+amazonUrl);
        String fileExtension=applicationConfig.readConfigurationFile(configFile,"file_extension");
        String filePrefix=applicationConfig.readConfigurationFile(configFile,"file_prefix");
        StringBuilder s=new StringBuilder();
        s.append("Java config properties are very easy to learn").append("\n");
        s.append("Today's date is: "+new Date()).append("\n");
        s.append("This is an example of config file");
        try {
            FileUtils.write(new File(folderName+File.separator+filePrefix+"_execution_log"+fileExtension),s.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
