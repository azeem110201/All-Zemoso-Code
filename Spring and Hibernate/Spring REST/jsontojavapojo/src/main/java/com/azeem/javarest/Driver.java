package com.azeem.javarest;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();

            // read JSON  file and map/convert to Java POJO
            Student student = mapper.readValue(
                    new File("data/sample-full.json"), Student.class);

            System.out.println(student);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
