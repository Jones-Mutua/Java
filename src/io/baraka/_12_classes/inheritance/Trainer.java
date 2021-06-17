package io.baraka._12_classes.inheritance;

import java.util.Arrays;

public class Trainer extends  User {

    private  String employeeID;
    private  String[]  courses;
    private  String status;

    public Trainer(String username, String email, String password,
                   String employeeID, String[] courses) {
        super(username, email, password);
        this.courses = courses;
        this.employeeID = employeeID;
        this.status = "active";
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getCourses() {
        return Arrays.toString(courses);
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
