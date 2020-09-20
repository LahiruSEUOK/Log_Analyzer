package com.Input;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailInputTest {
    @Test
    public void should_return_email() {
        EmailInput email = new EmailInput();
        String result = email.getUserInput("D:\\last\\Log_Analyzer\\LogAnalyzerApp\\src\\main\\java\\resources\\sample.txt");
    }
}