package com.Errors;

import com.FileHandling.LogFileHandling;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class ErrorDetection implements ErrorDetec{
    public void  findError(Date Timestamp, List<String> lines) throws ParseException {
        LogFileHandling logFileHandling = new LogFileHandling();
        List<String> newLines = logFileHandling.getLinesToRead(Timestamp,lines);
        for (String line : newLines){
            String key = "ERROR";
            if (line.contains(key)) {
                System.out.println(line);
            }
        }
    }

}
