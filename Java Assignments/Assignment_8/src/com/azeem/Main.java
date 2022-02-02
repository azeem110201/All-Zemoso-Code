package com.azeem;
import java.util.Scanner;

public class Main {
    /*
       Problem Description

       Create three new types of exceptions.
       Write a class with a method that throws all three.
       In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
       Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
     */
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
