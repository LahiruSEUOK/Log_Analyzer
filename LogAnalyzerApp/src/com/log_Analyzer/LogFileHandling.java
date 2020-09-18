package com.log_Analyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class LogFileHandling {

    public List<String> readFile(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        return lines;
    }

    public void findError(List<String> lines,String filepath) throws ParseException, IOException {
        for (String line : lines){
            String key = "ERROR";
            if (line.contains(key)) {
                System.out.println(line);
            }
        }
    }

}
