package io.baraka._08_conditionals;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
         /*
        the scope of a variable/ function is the part of the program
        where the piece of code is accessible
        or with which it can be used
        curly braces create different blocks or regions or scopes in java
         */
        System.out.println("Pick a number between 1 and 10 ");
        Scanner input = new Scanner(System.in);

        int pick = input.nextInt();
        int favouriteNum = 10;
        //global variable
        System.out.println(favouriteNum);

        if(pick < 5){
            favouriteNum = 15;
            int myNumber =90;
            System.out.println(favouriteNum);
            //accessible -in scope
            System.out.println(myNumber);
            //accessible -in scope
            System.out.println("Enjoy the good luck a friend brings you");
        }else {
            System.out.println("Your shoe collection will make you happy today");
            favouriteNum = 89;
            System.out.println(favouriteNum);
            //System.out.println(myNumber);
            //in-accessible -out of scope
        }

        //System.out.println(myNumber);
        //in-accessible -out of scope
    }
}
