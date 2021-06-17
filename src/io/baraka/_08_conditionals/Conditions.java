package io.baraka._08_conditionals;

public class Conditions {
    public static void main(String[] args) {
        int age = 27;

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


        //ternary operator
        String status = age > 18 && !(age > 35) ? "Allowed to go out" :
                "Not allowed to go out";

        //switch
        String role = "adtjjrtmin";
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
build a program to process loans
version 1
if an applicant has high income and good credit they are eligible for a loan

version2
if an applicant has high income or good credit they are eligible for a loan

version3
if an applicant has good credit and does not
 have a criminal record they are eligible for a loan
 */
