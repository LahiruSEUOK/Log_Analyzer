package com.log_Analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileHandling {

    public List<String> readFile(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        return lines;
    }

    public void findError(List<String> lines){
        for (String line : lines){
            String key = "ERROR";
            if (line.contains(key)) {
                System.out.println(line);
            }
        }
    }
}
