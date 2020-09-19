package com;

import com.EmailRepository.EmailSender;
import com.Errors.ErrorDetec;
import com.Errors.ErrorDetection;
import com.FileHandling.LogFileHandling;
import com.FileHandling.TextFile;
import com.FileHandling.TextFileHandling;
import com.Input.CmdInput;
import com.Input.Input;
import com.dbConnection.ReadEmail;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
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

        ReadEmail readEmail = new ReadEmail();
        ArrayList<String> mailList = readEmail.getMailList();
        EmailSender emailSender = new EmailSender();
        mailList.forEach((e) -> {
            try {
                emailSender.sendSimpleMessage(e);
            } catch (UnirestException unirestException) {
                unirestException.printStackTrace();
            }
        });



    }












}
