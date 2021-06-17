package io.baraka._11_Functions;

import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        //these are the lines of code to be executed when the function is used
        System.out.println("Awaiting for the announcement......");
        System.out.println("Type in a random word and press enter to start the developer tea-time ");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("It is developer Tea Time");
    }

    public static void main(String[] args) {
        /*
        Functions help in program design to break down code into small chunks of executable files
        A function in software development is a series of finite steps that accomplish some tasks
        Example :
        To make a peanutButter
        - Gather ingredients
        - Spread the peanut butter on one slice and jelly on the other side
        - combine the two slices and place on a plate

        we call this combination of finite steps in association with a task a function

        After definition we can use the function by referring to ist name/label
        with some open and close parenthesis
        functions help in designing reusable code
        In java we must specify the return type of a function when we define it
         */

        /*
        differentiate between definition and usage
         */
        System.out.println("Welcome to your new Job");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review Code");

        announceDeveloperTeaTime();
        System.out.println("Write code");
        System.out.println("Get Promoted");
    }


}
