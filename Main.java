package com.bl;

import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration1");
        System.out.println("Enter 1 : to validate First Name ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
            case 2:
                UserRegistration.validLastName();
                break;
            }
        }
}
