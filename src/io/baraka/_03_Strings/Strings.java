package io.baraka._03_Strings;

public class Strings {
    public static void main(String[] args) {
        int studentAge = 17;
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;

        String studentFirstName = "Ben";
        String studentLastName = "Hamilton";

        //finding a character
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);

        //concatenation
        String studentDetails = studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA;

        System.out.println(studentDetails);

        //length of a string
        System.out.println(studentDetails.length());

        //index of a character in a string'
        System.out.println(studentFirstName.indexOf('e'));

    }
}
