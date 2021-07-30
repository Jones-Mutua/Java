package io.baraka._11_Functions;

public class MoreOnFunctions {


    /*
    simple function that takes two integers as inputs
    or in correct programming language  (parameters)
    and returns the sum of the two
     */
    public static int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    /*
    more dynamic function
    Write a function to calculate the total cost of a meal
    --Tip = tipRate * listedMealPrice
    --tax = taxRate * listedMealPrice
    --total cost = tip +tax listedMealPrice
    all inputs cannot be hard coded if they are values that change every time
     */

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal Price  " + result);
    }

    public static double calculateTotalMealPriceTwo(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
          /*
    split the bill
    return statement allows to take a value of a function and make it available at a different scope
     */
        return result;
    }

    public static void main(String[] args) {
        /*
        Functions can be dynamic and take in inputs and also produce different outputs
        depending on the kind of inputs they receive
         */

        add(10, 40);
        calculateTotalMealPrice(20, 0.2, 0.14);
        System.out.println(calculateTotalMealPriceTwo(20, .2, .14) / 3);
    }

}


/*
TODO
Trainee Task
create a function to calculate the employees salary
based on how many hours an employee works per week and how much an employee makes per hour
inputs [hours/week  pay/hour]
output: employees gross yearly salary
Bonus - add an input that accounts for the vacation days and the
employee does not get paid on vacation days assuming
that a vacation day is equal to 8hrs of work
 */