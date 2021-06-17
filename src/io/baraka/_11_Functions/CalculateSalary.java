package io.baraka._11_Functions;

/*
create a function to calculate the employees salary
based on how many hours an employee works per week and how much an employee makes per hour
inputs [hours/week  pay/hour]
output: employees gross yearly salary
Bonus - add an input that accounts for the vacation days and the
employee does not get paid on vacation days assuming that a vacation day is equal to 8hrs of work
*/
public class CalculateSalary {
    public static double calculateSalary(double hoursPerWeek, double amountPerHour, int vacationDays) {
        if (hoursPerWeek < 1 || amountPerHour < 1) {
            return -1;
        }
        double weeklyPayCheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;

        return (weeklyPayCheck * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        double salary = calculateSalary(40, 15, 8);
        System.out.println("$ " + salary);
    }
}
