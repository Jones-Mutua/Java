package io.baraka._06_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 17;
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
        and operator
        flips or reverses the evaluation of a condition
         */
        System.out.println( !(age >18)  );
    }
}
