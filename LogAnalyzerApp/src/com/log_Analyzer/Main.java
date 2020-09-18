package com.log_Analyzer;

import Errors.ErrorDetection;
import FileHandling.LogFileHandling;
import FileHandling.TextFileHandling;
import Input.CmdInput;
import Input.Input;

import java.io.*;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        //Get file path from the user
        Input input = new CmdInput();
        String filepath = input.getFilePath();

        //Read file
        LogFileHandling logFileHandling = new LogFileHandling();
        List<String> lines= logFileHandling.readFile(filepath);

        //Find ERROR
        ErrorDetection errorDetection = new ErrorDetection();
        errorDetection.findError(lines);

        //Send emails


        //Store last timestamp in a text file
        TextFileHandling textFileHandling = new TextFileHandling();
        String lLine = logFileHandling.getLastLine(filepath);
        textFileHandling.writeFile(lLine);


    }












}
