package io.baraka._10_loops;

public class Loops {
    public static void main(String[] args) {
        /*loops are used to perform repetitive tasks */


        //while
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            //argument operator
            count += 1;
        }

        //for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        //for loop --enhanced for loop
        int[] numbers = {2, 0, 1, 4, 100, 4, 98, 77, 78};
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index = " + i + " Value = " + numbers[i]);
        }

        //enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }

        /*
        write a program to print out even numbers between 0 and 100
        loop
        if statement
         */

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is an even number");
            }
        }


    }
}
