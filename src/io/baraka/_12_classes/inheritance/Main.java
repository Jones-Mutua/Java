package io.baraka._12_classes.inheritance;

public class Main {
    public static void main(String[] args) {

        /*
        Inheritance in Java is a concept that acquires the properties from one class to other classes;
        for example, the relationship between father and son.
        In Java, a class can inherit attributes and methods from another class.
        The class that inherits the properties is known as the sub-class or the child class.

          Create  a Parent class user
          create a class Trainer that inherits from user
          create another class Student that also inherits from user
         showcase inheritance and create instances of a class

         */
        Student sam = new Student("samson", "sam@gmail.com", "123Asd",
                "IST005", "Android Development", 4.0, 40000);

        System.out.println(sam.getGpa());
        System.out.println(sam);

        Trainer baraka = new Trainer("baraka", "baraka@gmail.com",
                "1234456", "IST9021",
                new String[]{"Android", "Web Development", "ICDL", "Redhat"});
        System.out.println(baraka.getCourses());
    }
}
