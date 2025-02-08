package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReadDemo1 {
    //read a json file using Jackson faster xml library
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        User myuser;
        try {
            myuser=objectMapper.readValue(new File("doc/loginuser-new.json"),User.class);
            System.out.println(String.format("Username: %s",myuser.getUsername()));
            System.out.println(String.format("Password: %s",myuser.getPassword()));
            System.out.println(String.format("Age : %d",myuser.getAge()));
            System.out.println(String.format("User Type: %s",myuser.getUsertype()));
            System.out.println(String.format("Is Active: %b",myuser.isActive()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
