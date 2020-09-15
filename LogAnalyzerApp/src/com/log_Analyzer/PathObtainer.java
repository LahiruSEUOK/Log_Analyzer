package com.log_Analyzer;

import java.util.Scanner;

public class PathObtainer {
    public getPath(String filePath) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file path:");
        String filePath = scan.nextLine();

        System.out.println(filePath);
    }
}
