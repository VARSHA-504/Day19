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

    public static void validEmailId() {
        System.out.println("Enter the email ID");
        Scanner scanner = new Scanner(System.in);
        String emailId = scanner.next();
        String id = "^[\\w]+(?:\\.[\\w]+)*@[\\w]+(?:\\.[\\w]+)*$";
        if (id.matches(emailId)) {
            System.out.println("Valid email Id");
        } else {
            System.out.println("Invalid email Id");

        }
    }

    public static void validPhoneNumber() {
        System.out.println("Enter the phone number");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.next();
        String number = "^91[ ][\\d]{10}$";
        if (number.matches(phoneNumber)) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");

        }
    }

    public static void validPassword() {
        System.out.println("Enter the password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        String pw =  "[\\w([A-Z]{1,0})]{8,}";
        if (pw.matches(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");

        }
    }
}

