package com.bl.pgm1;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scan.next();
        String regexPassword = "(^[A-Z]{1}[a-z]{3})";
        if (password.matches(regexPassword)) {
            System.out.println("Valid First name");
        }
        else{
            System.out.println("Invalid First name");

        }
    }
}
