package com.log_Analyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandling {
    public void writeFile(String lLine){
        try {
            String filepath = "F:\\SENG21222 Project\\Log_Analyzer\\LogAnalyzerApp\\src\\Output\\output.txt";
            FileWriter writer = new FileWriter(new File(filepath));
            String[] timestamp = lLine.split("Z");
            writer.write(timestamp[0]);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}