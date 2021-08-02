package io.baraka._08_conditions_scope;

public class Conditions {
    public static void main(String[] args) {
        int age = 27;
        /*
        Conditions are helpful when you need to execute ome lines of code based on whether
        some values evaluate to true or false
        */

        /* the is statement is widely used to handle conditions*/


        /* it can also be used with logical operators too */


        /*
        if the statement to  be run after the condition is a one line statement
         you can use the ternary operator which helps ot write less code as compared
         to the if
         */


        /*
        At times if we have so many conditions to check through using an
        if else statement would lead to less readable code
        we can convert the  if statement to a switch statement
         */

        String role = "admin";
        if (role == "admin") {
            System.out.println("You are admin");
        } else if (role == "student") {
            System.out.println("You are a student");
        } else if (role == "trainer") {
            System.out.println("You are a trainer");
        } else {
            System.out.println("I do not know your role");
        }

        /*Switch statement */

    }
}



/*
TODO
Trainee task
build a program to process loans
version 1
if an applicant has high income and good credit they are eligible for a loan

version2
if an applicant has high income or good credit they are eligible for a loan

version3
if an applicant has good credit and does not
 have a criminal record they are eligible for a loan

 version4
 use the switch statement to build all  versions as one program
 */
