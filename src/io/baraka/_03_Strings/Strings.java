package io.baraka._03_Strings;

public class Strings {
    public static void main(String[] args) {
        /*this section focus a little deeper into strings*/
        int studentAge = 17;
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;

        /*Declare two strings studentFirstName and studentLastName*/
        String studentFirstName = "Ben";
        String studentLastName = "Hamilton";

        /*
        Because the string is a reference type,
        it kind of inherits from the String class prebuilt in Java
        so it gives access to methods that aid us to perform many functionalities on s string
        We can use the charAt method and input an index to extract that character from the string
        e.g extract studentFirstInitial and studentLastInitial from the studentFirstName and studentLastName respectively
        NOTE: indices start at zero
        */
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);


        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        /*
        We join strings by using the  + symbol - an operation called concatenation in programming
        which is simply adding one string to another to come up with a sentence or something of sorts
        */
        String studentDetails = studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA;

        System.out.println(studentDetails);

        /*
        To know how many characters are in the string you can call the .length()  method
        get the length of the sentence generated above
        */
        System.out.println(studentDetails.length());

        /*
        whenever you need to know the index of any character in a string you can use the .indexOf method
        and pass in the character you need to find its index
        */
        System.out.println(studentFirstName.indexOf('e'));

    }
}
