package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JsonWriteDemo1 {
    public static void main(String[] args) {
        User user1=new User("MikeABC","test123","guest",25,true);
        //user object mapper to write the user to a file
        ObjectMapper objectMapper=new ObjectMapper();
        String user1JsonString= null;
        try {
            user1JsonString = objectMapper.writeValueAsString(user1);
            System.out.println(user1JsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try {
            FileUtils.write(new File("doc/testuser2.json"),user1JsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
