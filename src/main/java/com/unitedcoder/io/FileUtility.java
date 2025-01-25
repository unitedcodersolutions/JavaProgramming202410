package com.unitedcoder.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    //design a method to write a text file
    public void writeToFile(String fileFolder,String fileName,String fileExtension,String fileContent)
    {
        //create a folder if the folder does not exist
        String workingDirectory=System.getProperty("user.dir");
       String finalDirectory=workingDirectory+ File.separator+fileFolder;
        System.out.println(finalDirectory);
        File file=new File(finalDirectory);
        //if the folder does not exist, we need to create the folder
        if(!file.exists())
        {
            file.mkdir(); //create a folder
            System.out.println("Folder is created");
        }
        String finalFileName=finalDirectory+File.separator+fileName+fileExtension; //final file name
        //Write content to the file
        File myFile=new File(finalFileName);
        //use FileWriter to write a content to a file
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(myFile.getAbsoluteFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //use Buffered Writer to write the content to the file
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write(fileContent);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
