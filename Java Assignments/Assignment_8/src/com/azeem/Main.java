package com.azeem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter your email id: ");
        String email = scr.nextLine();

        System.out.print("Enter password: ");
        String password = scr.nextLine();

        System.out.print("Enter your age: ");
        short age = scr.nextShort();

        try{
            Validation validation = new Validation();
            validation.validateDetails(email, password, age);
        }
        catch (EmailValidation e){
            System.out.println(e.getMessage());
        }
        catch (PasswordValidation e){
            System.out.println(e.getMessage());
        }
        catch (AgeValidation e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("You cannot have any null values");
        }
        finally {
            System.out.println("Execution of the program completes");
        }

    }
}
