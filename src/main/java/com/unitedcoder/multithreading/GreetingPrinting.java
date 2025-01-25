package com.unitedcoder.multithreading;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class GreetingPrinting implements Runnable{
    private String message;
    public GreetingPrinting(String message)
    {
        this.message=message;
    }
    @Override
    public void run() {
        //write our logic to print messages
        for(int i=0;i<=5;i++)
        {
            Date now=new Date();
            System.out.println(now+ " "+message);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long currentFilename=System.currentTimeMillis();
            try {
                FileUtils.write(new File("doc/"+currentFilename+".txt"),message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
