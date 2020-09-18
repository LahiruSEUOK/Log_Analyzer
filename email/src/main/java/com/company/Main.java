package com.company;

import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

    public static void main(String[] args) throws UnirestException {
	EmailSender a = new EmailSender();
	a.sendSimpleMessage();
    }
}
