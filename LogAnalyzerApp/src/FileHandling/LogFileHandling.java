package FileHandling;

import Timestamp.Timestamp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogFileHandling implements LogFile{

    Timestamp timestamp = new Timestamp();

    public List<String> readFile(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        return lines;
    }

    public String getLastLine(String filepath) throws IOException {
        List<String> lines = readFile(filepath);
        String result="";
        for (String line : lines){
            if(line==null)
                break;
            result=line;
        }
        return result;
    }

    public List<String> getLinesToRead(Date timeStamp, List<String> lines) throws ParseException, NullPointerException {
        List<String> newLines = new ArrayList<>();
        for (String line : lines){
            Date time = timestamp.getTimeStamp(line);
            while(time.compareTo(timeStamp)>0){
                newLines.add(line);
            }
        }
        return newLines;
    }

}
