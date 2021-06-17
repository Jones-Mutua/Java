package io.baraka._02_referenceTypes;

public class ReferenceTypes {
        public static void main(String[] args) {
            int studentAge = 17;
            double studentGPA = 3.45;
            char studentFirstInitial = 'B';
            char studentLastInitial = 'M';
            boolean hasPerfectAttendance = true;
         /*
         String  - a sequence of ordered characters
         e.g a word or persons name
         String is a reference type because
         it is built up of characters
         */

            //String  studentName ="Ben Hamilton";

            String studentFirstName = "Ben";
            String studentLastName = "Hamilton";

            System.out.println(studentAge);
            System.out.println(studentGPA);
            System.out.println(studentFirstInitial);
            System.out.println(studentLastInitial);
            System.out.println(hasPerfectAttendance);

            System.out.println(studentFirstName);
            System.out.println(studentLastName);


        }
    }
