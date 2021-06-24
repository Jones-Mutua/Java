package io.baraka._11_Functions;

        /*
       create a function to calculate the employees salary
       based on how many hours an employee works per week and how much an employee makes per hour
       inputs [hours/week  pay/hour]
       output: employees gross yearly salary
       Bonus - add an input that accounts for the vacation days and the
       employee does not get paid on vacation days assuming
       that a vacation day is equal to 8hrs of work
        */
public class CalculateSalary {

    public  static  double calculateGrossSalary(double hoursPerWeek,
                                                double amountPerHour,
                                                int vacationDays
                                                ){
        double weeklyPay = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays  * 8;
        double unpaidAmount  = unpaidTime * amountPerHour;

        return (weeklyPay * 52) - unpaidAmount;

    }


    public static void main(String[] args) {
        double salary = calculateGrossSalary(40,
                15,
                10);
        System.out.println(salary);
    }
}
