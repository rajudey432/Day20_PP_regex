package com.bridgelabz.UserRegistrationProblem;

import java.util.Scanner;

public class emailSamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        // Prompt the user for input until a valid email is entered
        do {
            System.out.print("Enter your email address: ");
            email = scanner.nextLine();
        } while (!isValidEmail(email));

        System.out.println("Your email address is " + email);
    }

    public static boolean isValidEmail(String email) {
        // Check if the email matches the required format
        String regex = "^[A-Za-z]+(\\.[A-Za-z]+)*@[A-Za-z]+(\\.[A-Za-z]{2,}){1,2}$";
        return email.matches(regex);
    }
}

