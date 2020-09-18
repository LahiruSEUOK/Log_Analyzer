package com.log_Analyzer;

import java.util.Scanner;

public class Input {
    public String getFilePath(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filepath = input.nextLine();
        return filepath;
    }
}
