package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandling implements TextFile{

    String filepath = "LogAnalyzerApp/src/com/Output/output.txt";

    public void writeFile(String lLine){
        try {
            FileWriter writer = new FileWriter(new File(filepath));
            String[] timestamp = lLine.split("Z");
            writer.write(timestamp[0]);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
