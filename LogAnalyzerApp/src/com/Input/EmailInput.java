package com.Input;

import java.util.Scanner;

public class EmailInput implements Input{

    @Override
    public String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email to add to DB: ");
        String email = input.nextLine();
        return email;
    }
}
