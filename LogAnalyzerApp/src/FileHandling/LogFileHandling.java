package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogFileHandling {

    public static List<String> readFile(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        return lines;
    }

    public static String getLastLine(String filepath) throws IOException {
        List<String> lines = readFile(filepath);
        String result="";
        for (String line : lines){
            if(line==null)
                break;
            result=line;
        }
        return result;
    }

    static Date getTimeStamp(String line) throws ParseException {
        String[] Time = line.split("Z");
        String[] Date = Time[0].split("T");
        String timeStamp = Date[0]+" "+Date[1];
        Date date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(timeStamp);
        return date;
    }

    public List<String> getLinesToRead(Date timestamp, List<String> lines) throws ParseException, NullPointerException {
        List<String> newLines = new ArrayList<>();
        for (String line : lines){
            Date time = getTimeStamp(line);
            while(time.compareTo(timestamp)>0){
                newLines.add(line);
            }
        }
        return newLines;
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
