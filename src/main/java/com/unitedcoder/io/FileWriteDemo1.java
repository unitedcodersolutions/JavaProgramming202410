package com.unitedcoder.io;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        StringBuilder fileContent=new StringBuilder();
        fileContent.append("I love java coding ").append("\n");
        fileContent.append("I have learned basic java coding").append("\n");
        fileContent.append("I finished many Java Quiz").append("\n");
        fileContent.append("I will learn Java SDET or Java Development soon");
        //write the above content to a file
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc2","testfile"+getCurrentDateTime(),".txt", fileContent.toString());
    }

    public static String getCurrentDateTime()
    {
        //
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
        return formatter.format(localDateTime);
    }
}
