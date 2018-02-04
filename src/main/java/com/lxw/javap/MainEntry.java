package com.lxw.javap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lxw.javap.model.ClassBody;
import com.lxw.javap.parser.ClassParser;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainEntry {
    public static void main(String... args) throws IOException {
        if (args.length == 1) {
            String classPath = args[0];
            System.out.println("Your class file path is:" + classPath);
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(classPath))));
            ClassBody classBody = ClassParser.parserClass(dataInputStream);
            System.out.println(classBody);
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            String outputStr = gson.toJson(classBody);
//            System.out.println(outputStr);
        }
        System.out.println("Please tell me your class file location.");
    }
}
