package com.company;

import java.io.File;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
public class EmailSender {
    // ...
    public void sendSimpleMessage() throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post(  "https://api.mailgun.net/v3/sandbox50bceee942734739a5d4bc580a9c9bdd.mailgun.org"+ "/messages")
			.basicAuth("api", "6c350f36deaa110fe06c8522da01a3f3-d5e69b0b-9f4a0d5f")
                .queryString("from", "Admin  <sisithajayawardhane@gmail.com>")
                .queryString("to", "sisithajayawardana123@gmail.com")
                .queryString("subject", "Informing about errors")
                .queryString("text", "This is a testing email")
                .asJson();
        //System.out.println(request.getBody());
    }
}
