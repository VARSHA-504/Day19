package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;

public class UserRegistration {
    public static void validFirstName() {
        System.out.println("Enter the first name");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String name = "^[A-Z]{1}[a-z]{3,}$";
        if (name.matches(firstName)) {
            System.out.println("Valid First name");
        } else {
            System.out.println("Invalid First name");

        }
    }

    public static void validLastName() {
        System.out.println("Enter the first name");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.next();
        String name = "^[A-Z]{1}[a-z]{3,}$";
        if (name.matches(lastName)) {
            System.out.println("Valid Last name");
        } else {
            System.out.println("Invalid Last name");

        }
    }
}

