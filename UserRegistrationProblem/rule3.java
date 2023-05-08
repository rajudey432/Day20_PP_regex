package com.bridgelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class rule3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");

        // Prompt the user for input until a valid password is entered
        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
        } while (!pattern.matcher(password).matches());

        System.out.println("Your password is " + password);
    }
}
