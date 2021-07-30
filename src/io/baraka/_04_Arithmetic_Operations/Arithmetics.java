package io.baraka._04_Arithmetic_Operations;

public class Arithmetics {
    public static void main(String[] args) {
        /*
        Just like in mathematics we can be able to perform arithmetic operations with Java too
         */
        int a = 19;
        int b  = 34;
        double c = 65.89;

        //addition
        System.out.println( a + b + c);

        //subtraction
        System.out.println(c -b );

        //multiplication
        System.out.println( a * b);

        //division
        System.out.println(c/b);

        //modulus (get the remainder after division)
        System.out.println(c%b);

        //pre-increment (add one and return new value)
        System.out.println(++a); //20

        //pre-decrement (subtract one and return new value)
        System.out.println(--b); //32

        //post increment (add one and return old value before increment)
        int _a  = a++;
        System.out.println(_a); // 20
        System.out.println(a); //21

        //post-decrement  (subtract one and return the old value )
        int _b  = b--;
        System.out.println(_b); // 33
        System.out.println(b); //32
    }
}
