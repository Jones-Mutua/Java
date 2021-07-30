package io.baraka._01_variables;

public class Variables {
    public static void main(String[] args) {
        /*
          we represent pieces of data in code using variables
          lets represent a student in code
          (age, gpa, first-initial, last-initial, GPA, perfectAttendance)
          a variable is a label/identifier
         */
        /*Declare an integer*/
        int studentAge = 17;

        /*Declare a double */
        double studentGPA = 3.45;

        /*Declare a character*/
        char studentFirstInitial = 'B';
        char studentLastInitial = 'M';

        /*Declare a boolean value*/
        boolean hasPerfectAttendance = true;

        /*Print out the variables on the terminal*/
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
    }
}
