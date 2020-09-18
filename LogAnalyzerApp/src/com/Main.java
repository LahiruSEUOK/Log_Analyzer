package com;

import com.Errors.ErrorDetec;
import com.Errors.ErrorDetection;
import com.FileHandling.LogFileHandling;
import com.FileHandling.TextFileHandling;
import com.Input.CmdInput;
import com.Input.Input;

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
        Date timestamp = new Date();
        ErrorDetec errorDetec = new ErrorDetection();
        errorDetec.findError(timestamp,lines);

        //Send emails


        //Store last timestamp in a text file
        TextFileHandling textFileHandling = new TextFileHandling();
        textFileHandling.writeFile(logFileHandling.getLastLine(filepath));


    }












}