package com.bridgelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validMailId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");

        // Prompt the user for input until a valid email is entered
        do {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();
        } while (!pattern.matcher(email).matches());

        System.out.println("Your email is " + email);
    }
}

