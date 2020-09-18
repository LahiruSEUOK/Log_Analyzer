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

        int count = 0;
        String lLine = getLastLine(count,filepath);
        String timeStamp = getTimeStamp(lLine);

        //
        Scanner inputFilepath = new Scanner(new File(filepath));



        while(inputFilepath.hasNextLine())
        {
            String line = inputFilepath.nextLine();
            count++;
            String key = "ERROR";
            String start = timeStamp;
            if (line.contains(key)) {
                System.out.println(line);
            }

        }

        System.out.println(lLine);
        getTimeStamp(lLine);


    }

    static String getLastLine(int count, String filepath) throws IOException {
        int n_lines = count;
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

    public void writeFile(String text){
        try {
            FileWriter writer = new FileWriter("File.txt");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    




}
