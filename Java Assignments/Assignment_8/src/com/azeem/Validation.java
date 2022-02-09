package com.azeem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public void validateDetails(String email, String password, short age) throws EmailValidation, PasswordValidation, AgeValidation {
        // regex to check if a statement follows a particular pattern for email string
        String regex = "^(.+)@(.+)$";

        // Pattern and Matcher class used to compile the regex and match it with the statement.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            throw new EmailValidation("Email format is incorrect");
        }
        if(password.length() < 8){
            throw new PasswordValidation("Password length must be greater than 8");
        }
        if(age < 18){
            throw new AgeValidation("Age must not be less than 18");
        }
    }
}
