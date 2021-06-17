package io.baraka._07_user_input;

import java.util.Date;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println("What is your age ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();

        System.out.println("You are " + userAge + " Years Old");

    }
}

/*
TODO
Write a java program that meets the following conditions
1. Asks the user to enter their age
2. calculates the year the user was born based on the current year
3. print out on the terminal an appropriate statement
 */

