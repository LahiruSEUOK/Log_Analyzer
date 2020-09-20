package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileHandling implements TextFile{

    String filepath = "C:\\Users\\ASUS\\Desktop\\SENG21222 Project\\Log_Analyzer\\LogAnalyzerApp\\src\\com\\Output\\output.txt";

    public String readFile(String filepath) throws IOException {
//        File myObj = new File(filepath);
        Scanner myReader = new Scanner(new File(filepath));
        String line = null;
        while (myReader.hasNextLine()) {
            line = myReader.nextLine();
//            System.out.println(line);
        }
        myReader.close();
        return line;
    }

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
