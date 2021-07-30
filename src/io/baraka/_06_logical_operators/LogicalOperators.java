package io.baraka._06_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 17;
        /*
        When we need to run some piece of code that depends on two or more conditions
        we can be able to combine the checks for the conditions using Logical operators
        */

        /*
        and operator
        evaluates to true if both conditions are true
         */
        System.out.println(age < 35 && age >18 );


        /*
        or operator
        evaluates to true if any of the conditions are true
         */
        System.out.println(age < 35 || age >18  );

       /*
        not operator
        flips or reverses the evaluation of a condition
         */
        System.out.println( !(age >18)  );
    }
}
