package Input;

import com.log_Analyzer.Input;

import java.util.Scanner;

public class CmdInput implements Input{
    public String getFilePath(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filepath = input.nextLine();
        return filepath;
    }
}
