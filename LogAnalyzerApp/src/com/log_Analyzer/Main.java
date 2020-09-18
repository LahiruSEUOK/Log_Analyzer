package com.log_Analyzer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Get file path from the user
        Input input = new Input();
        String filepath = input.getFilePath();

        //Read file
        FileHandling fileHandling = new FileHandling();
        List<String> lines=fileHandling.readFile(filepath);

        //Find ERROR
        fileHandling.findError(lines);

        //Send emails

        //Save last timestamp in a text file
        fileHandling.writeFile(getTimeStamp(getLastLine(filepath)));

    }

    static String getLastLine(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        String result="";
        for (String line : lines){
            if(line==null)
                break;
            result=line;
        }
        return result;
    }

    static String getTimeStamp(String lLine){

        String timeStamp = lLine.substring(0,19);
        return timeStamp;
    }


    




}
