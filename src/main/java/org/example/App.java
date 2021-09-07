package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declaration
        String password = "abc$123";

        System.out.println("\nWhat is the password? "); //ask the user for the password
        Scanner possiblePasswordInput = new Scanner(System.in); //scan for the password
        String possiblePassword = possiblePasswordInput.next();

        if(possiblePassword.equals(password)) { //if the user uses the correct password
            //welcome the user
            System.out.println("\nWelcome!");

        }
        else { //if the user doesn't use the correct password
            //don't permit the user entry
            System.out.println("\nI don't know you.");


        }
    }
}