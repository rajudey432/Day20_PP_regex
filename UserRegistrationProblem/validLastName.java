package com.bridgelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastName;

        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

        // Prompt the user for input until a valid last name is entered
        do {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();
        } while (!pattern.matcher(lastName).matches());

        System.out.println("Your last name is " + lastName);
    }
}

