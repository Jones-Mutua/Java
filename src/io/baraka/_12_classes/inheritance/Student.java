package io.baraka._12_classes.inheritance;

public class Student  extends  User{
    private  String studentID;
    private int feeBalance;
    private  double gpa;
    String major;

    public Student(String username, String email, String password,
                   String studentID, String major, double gpa, int feeBalance) {
        super(username, email, password);
        this.studentID = studentID;
        this.major = major;
        this.gpa = gpa;
        this.feeBalance = feeBalance;

    }


    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getFeeBalance() {
        return feeBalance;
    }

    public void setFeeBalance(int feeBalance) {
        this.feeBalance = feeBalance;
    }
}
