package com.EmailRepository;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmailFactory {
    public void sendEmails(List<String> ErrorMessage) throws SQLException, ClassNotFoundException {
        if (ErrorMessage.isEmpty()==false){
            EmailList emailReading = new EmailList();
            ArrayList<String> mailList = emailReading.getMailList();
            com.Email.EmailSender emailSender = new com.Email.EmailSender();
            mailList.forEach((e) -> {
                try {
                    emailSender.sendSimpleMessage(e,ErrorMessage);
                    System.out.println("Emails sent successfully");
                } catch (UnirestException unirestException) {
                    unirestException.printStackTrace();
                    System.out.println("Emails sending failed");
                }
            });
        }else{
            System.out.println("No Errors");
        }
    }
}
