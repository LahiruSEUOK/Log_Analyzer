package com.log_Analyzer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        //Get file path from the user
        Input input = new Input();
        String filepath = input.getFilePath();

        //Read file
        LogFileHandling logFileHandling = new LogFileHandling();
        List<String> lines= logFileHandling.readFile(filepath);

        //Select lines to read
        Date timestamp = new Date();
        List<String> newLines = getLinesToRead(timestamp,lines);

        //Find ERROR
        logFileHandling.findError(newLines,filepath);

        //Send emails


        //Store last timestamp in a text file
        TextFileHandling textFileHandling = new TextFileHandling();
        String lLine = getLastLine(filepath);
        textFileHandling.writeFile(lLine);


    }

    public static String getLastLine(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        String result="";
        for (String line : lines){
            if(line==null)
                break;
            result=line;
        }
        return result;
    }

    static Date getTimeStamp(String lLine) throws ParseException {
        String[] Time = lLine.split("Z");
        String[] Date = Time[0].split("T");
        String timeStamp = Date[0]+" "+Date[1];
        Date date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(timeStamp);
        return date;
    }

    static List<String> getLinesToRead(Date timestamp, List<String> lines) throws ParseException, NullPointerException {
        List<String> newLines = new ArrayList<>();
        for (String line : lines){
            Date time = getTimeStamp(line);
            while(time.compareTo(timestamp)>0){
                newLines.add(line);
            }
        }
        return newLines;
    }






}
