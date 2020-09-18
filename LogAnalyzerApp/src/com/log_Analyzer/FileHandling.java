package com.log_Analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public void readFile(String filepath) throws FileNotFoundException {
        Scanner inputFilepath = new Scanner(new File(filepath));

        while(inputFilepath.hasNextLine())
        {
            String line = inputFilepath.nextLine();
            String key = "ERROR";
            if (line.contains(key)) {
                System.out.println(line);
            }

        }
    }
}
