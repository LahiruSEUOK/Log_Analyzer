package com.FileHandling;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface LogFile {
     List<String> readFile(String filepath) throws IOException;
     String getLastLine(String filepath) throws IOException;
     List<String> getLinesToRead(List<String> lines,String lLine) throws ParseException;
     Date getTimeStamp(String line) throws ParseException;
}
