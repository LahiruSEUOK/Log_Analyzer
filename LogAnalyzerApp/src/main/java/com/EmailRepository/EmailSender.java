package com.Email;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.List;

public class EmailSender {
//    public void sendSimpleMessage(String email, List<String> message) throws UnirestException {
//        HttpResponse<JsonNode> request = Unirest.post(  "https://api.mailgun.net/v3/sandbox6d32cd1eaf2e4eae8cdcb5b3456762ca.mailgun.org"+ "/messages")
//                .basicAuth("api", "9d7e7a6bfdf70a932dffd7f9f6d85d9c-d5e69b0b-42579f9c")
//                .queryString("from", "Admin  <sisithastuff@gmail.com>")
//                .queryString("to", email)
//                .queryString("subject", "Informing about errors")
//                .queryString("text", "Following errors are found in the log file.\n"+message)
//                .asJson();
//        System.out.println(request.getBody());
//    }

    public void sendSimpleMessage(String email, List<String> message) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post(  "https://api.mailgun.net/v3/sandbox6d32cd1eaf2e4eae8cdcb5b3456762ca.mailgun.org"+ "/messages")
                .basicAuth("api", "001a5ec2155ca7d201f945a1eaf11391-d5e69b0b-f181b3db")
                .queryString("from", "Admin  <maducm20@gmail.com>")
                .queryString("to", email)
                .queryString("subject", "Informing about errors")
                .queryString("text", "Following errors are found in the log file.\n"+message)
                .asJson();
        System.out.println(request.getBody());
    }

}
