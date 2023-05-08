package com.bridgelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;

        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

        // Prompt the user for input until a valid first name is entered
        do {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();
        } while (!pattern.matcher(firstName).matches());

        System.out.println("Your first name is " + firstName);
    }
}

