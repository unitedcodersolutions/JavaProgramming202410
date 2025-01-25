package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) {
        String content= null;
        String message="";
        try {
            content = FileUtils.readFileToString(new File("doc/scores18220.txt"));
            content=content.replace("Java","C#");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            message=content==null?"Not found":"File Found";
        }
        finally {
            System.out.println(message);
        }

    }
}
