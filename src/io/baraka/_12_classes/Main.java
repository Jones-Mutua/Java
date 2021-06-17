package io.baraka._12_classes;

public class Main {
    public static void main(String[] args) {
        /*
        A class is a blue print of an object
        An Object is an Instance of a class
        A class can be referred to as a logical entity (real life entity)
        Entities have attributes (properties)
        Entities have behaviours(methods)
         */

        Student michael = new Student("Michael Achieng",
                23, "Java Programming", 4.0);
        System.out.println(michael);
        michael.setMajor("Data Science");
        System.out.println(michael);
        michael.Mail("Exam Results are out");
    }
}
