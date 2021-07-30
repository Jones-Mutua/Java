package io.baraka._08_conditions_scope;

public class Conditions {
    public static void main(String[] args) {
        int age = 27;
        /*
        Conditions are helpful when you need to execute ome lines of code based on whether
        some values evaluate to true or false
        */

        /* the is statement is widely used to handle conditions*/
        if (age < 18) {
            System.out.println("Not allowed to go out");
        } else if (age > 35) {
            System.out.println("Too old to go out");
        } else {
            System.out.println("Allowed to go out");
        }


        if (age > 18 && !(age > 35)) {
            System.out.println("difgierueryure");
            System.out.println("Allowed to go out");
        } else {
            System.out.println("Not allowed to go out");
        }


        /*
        if the statement to  be run after the condition is a one line statement
         you can use the ternary operator which helps ot write less code as compared
         to the if
         */
        String status = age > 18 && !(age > 35) ? "Allowed to go out" :
                "Not allowed to go out";

        /*
        At times if we have so many conditions to check through using an
        if else statement would lead to less readable code
        we ca convert the  if statement to a switch statement
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

        switch (role) {
            case "admin":
                System.out.println("You are admin");
                break;
            case "student":
                System.out.println("You are a student");
                break;
            case "trainer":
                System.out.println("You are a trainer");
                break;
            default:
                System.out.println("I do not know your role");
        }

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
