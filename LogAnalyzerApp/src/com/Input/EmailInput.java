package com.Input;

import java.util.Scanner;

public class EmailInput implements Input{

    @Override
    public String getUserInput(String mail) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email to add ti DB: ");
        String email = input.nextLine();
        return email;
    }
}
