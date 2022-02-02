package com.azeem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*
       Problem Description
         Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a
         sentence to see that it begins with a capital letter and ends with a period.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String text = scr.nextLine();
        Pattern pattern = Pattern.compile("[A-Z].+[.]");
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()){
            System.out.println("The input matches the pattern");
        }else {
            System.out.println("Input does not match");
        }
    }
}
