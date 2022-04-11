package com.bl;

import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration1");
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : To validate Last Name ");
        System.out.println("Enter 3 : To validate E-mail ");
        System.out.println("Enter 4 : To validate Phone Number ");
        System.out.println("Enter 5 : To validate Password ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
            case 2:
                UserRegistration.validLastName();
            case 3:
                UserRegistration.validEmailId();
            case 4:
                UserRegistration.validPhoneNumber();
            case 5:
                UserRegistration.validPassword();
                break;
            }
        }
}
