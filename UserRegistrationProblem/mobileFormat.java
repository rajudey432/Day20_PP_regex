package com.bridgelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class mobileFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mobileNumber;

        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("^\\d{2} \\d{10}$");

        // Prompt the user for input until a valid mobile number is entered
        do {
            System.out.print("Enter your mobile number: ");
            mobileNumber = scanner.nextLine();
        } while (!pattern.matcher(mobileNumber).matches());

        System.out.println("Your mobile number is " + mobileNumber);
    }
}

