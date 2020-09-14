package com.log_Analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your full file path: ");
        String filename = keyboard.nextLine();
        Scanner inputFile = new Scanner(new File(filename));
        while(inputFile.hasNextLine()) {
            System.out.println(inputFile.nextLine());
    }
}}
