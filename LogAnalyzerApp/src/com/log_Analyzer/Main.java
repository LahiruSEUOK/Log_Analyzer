package com.log_Analyzer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filepath = input.nextLine();
        Scanner inputFilePath = new Scanner(new File(filepath));
        while (inputFilePath.hasNextLine()){
            System.out.println(inputFilePath.nextLine());
        }
    }
}
