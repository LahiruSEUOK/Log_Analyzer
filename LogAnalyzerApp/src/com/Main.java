package com;

import com.Errors.ErrorDetec;
import com.Errors.ErrorDetection;
import com.FileHandling.LogFileHandling;
import com.FileHandling.TextFile;
import com.FileHandling.TextFileHandling;
import com.Input.CmdInput;
import com.Input.EmailInput;
import com.Input.Input;
import com.dbConnection.AddOperation;
import com.dbConnection.OperationFactory;

import java.io.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ParseException, SQLException, ClassNotFoundException {
        //Get file path from the user
        Input input = new CmdInput();
        String filepath = input.getUserInput();

        //Read file
        LogFileHandling logFileHandling = new LogFileHandling();
        List<String> lines= logFileHandling.readFile(filepath);

        //Find ERROR
        Date timestamp = new Date();
        ErrorDetec errorDetec = new ErrorDetection();
        errorDetec.findError(lines);

        //Send emails


        //Store last timestamp in a text file
        TextFile textFile = new TextFileHandling();
        textFile.writeFile(logFileHandling.getLastLine(filepath));

//        String mail = " ";
//        Input input= new EmailInput();
//        String email = input.getUserInput(mail);
//
//        OperationFactory operationFactory = new AddOperation();
//        operationFactory.perform(email);


    }












}
