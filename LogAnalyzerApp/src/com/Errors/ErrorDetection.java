package com.Errors;

import com.EmailRepository.EmailSender;
import com.FileHandling.LogFileHandling;
import com.dbConnection.ReadEmail;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ErrorDetection implements ErrorDetec{

    String filepath = "F:\\SENG21222 Project\\Log_Analyzer\\LogAnalyzerApp\\src\\com\\Output\\output.txt";

    public void  findError(List<String> lines) throws ParseException, IOException, SQLException, ClassNotFoundException {
        LogFileHandling logFileHandling = new LogFileHandling();
        List<String> newLines = logFileHandling.getLinesToRead(lines,filepath);
        System.out.println(newLines);
        for (String line : newLines){
            String key = "ERROR";
            if (line.contains(key)) {
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
    }

}
