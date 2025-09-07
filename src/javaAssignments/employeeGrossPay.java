package javaAssignments;

import java.util.Scanner;

public class employeeGrossPay {
    public static void main (String[] args){

        int rate = 15;
        int maxWeeklyHours = 40;

        Scanner scanner = new Scanner (System.in);

        System.out.println("enter your weekly hours ");

        double empWeeklyHours = scanner.nextDouble();

        while (empWeeklyHours>maxWeeklyHours||empWeeklyHours<=0){
            System.out.println("invalid input : please enter a number between 1-40 ");
        }
        double grossSalary = empWeeklyHours*rate;
        System.out.println("your weekly gross salary is "+ grossSalary + "$");



    }
}
