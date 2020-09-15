package com.log_Analyzer;

import java.util.Scanner;

public class PathObtainer {

    public getPath(String filePath) {

        Scanner scan = new Scanner(filePath);
        System.out.println("Enter the file path:");
        String filePath = scan.nextLine();

        if(!(filePath.length()==0)){
            return scan.next();
        }
        else{
            return "";
        }

    }
}
