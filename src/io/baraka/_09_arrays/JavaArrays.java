package io.baraka._09_arrays;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        //arrays == a list of things
        String fruit1 = "Mango";
        String fruit2 = "Apple";
        String fruit3 = "Pear";

        //declare an array
        String[] fruits = {"Apple", "Mango", "Pear"};

        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits[1]);
        System.out.println(fruits[fruits.length - 1]);

        /*
        The length of the array is the highest index + 1
        The highest index of an array is the length of the array -1
         */
        /*
        TODO
        Expound on arrays in Java
        Write a program to remove duplicated from an array
         */
    }
}
