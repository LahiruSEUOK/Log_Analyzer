package FileHandling;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface LogFile {
    public List<String> readFile(String filepath) throws IOException;
    public String getLastLine(String filepath) throws IOException;
    public List<String> getLinesToRead(Date timeStamp, List<String> lines) throws ParseException;
}
