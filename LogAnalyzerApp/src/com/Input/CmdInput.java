package com.Input;

import java.util.Scanner;

public class CmdInput implements Input{
    public String getUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filepath = input.nextLine();
        return filepath;
    }
}
