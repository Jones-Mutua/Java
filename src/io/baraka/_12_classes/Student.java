package io.baraka._12_classes;

public class Student {
    //properties
    String name;
    int age;
    String major;
    double GPA;

/*
constructor {defines holes to be filled during instantiation }
special type of method provided by ava to initialize any classes object

*/

    public Student(String name, int age, String major, double GPA) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.GPA = GPA;
    }


    //getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void Mail(String message){
        System.out.println("Hello " + this.getName() + " \n"
                + "This is an email to notify that " +
                message
                );
    }

    public String toString(){
        return  ("Student Name is " + this.getName() +
                ", age is: " + this.getAge() +
                ", Major: " + this.getMajor() +
                ", Has a GPA of " + this.getGPA());
    }
}
