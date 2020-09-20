package com.Errors;

import com.FileHandling.LogFile;
import com.FileHandling.LogFileHandling;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ErrorDetection implements ErrorDetec {
    String filepath = "F:\\SENG21222 Project\\Log_Analyzer\\LogAnalyzerApp\\src\\com\\Output\\output.txt";

    public List<String> findError(List<String> lines) throws ParseException, IOException, SQLException, ClassNotFoundException {
        LogFile logFile = new LogFileHandling();
        List<String> newLines = logFile.getLinesToRead(lines,filepath);
        List<String> ErrorLines = new ArrayList<>();
        for (String line : newLines){
            String key = "ERROR";
            if (line.contains(key)) {
//                System.out.println(line);
                ErrorLines.add(line);
            }
        }
//        System.out.println(ErrorLines);
        return ErrorLines;
    }

}
