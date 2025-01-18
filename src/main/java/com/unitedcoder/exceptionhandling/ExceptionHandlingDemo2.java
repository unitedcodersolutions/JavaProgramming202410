package com.unitedcoder.exceptionhandling;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<=10;i++)
        {
            String currentTime= String.valueOf(new java.util.Date());
            s.append(currentTime).append("\n");
            System.out.println(currentTime);
            Thread.sleep(1000);
        }
        try {
            FileUtils.write(new File("doc/recordTime.txt"),s.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
