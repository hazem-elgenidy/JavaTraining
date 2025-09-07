package javaAssignments;

import java.util.Scanner;

public class IfStatement {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your age ");
        int studentAge = scanner.nextInt();

        System.out.println("student age is " + studentAge);
        String status = studentAge>18?"eligible ":"not eligible";
        System.out.println(status);


        if (studentAge>=18){
            System.out.println("eligible to vote ");


        }
        else {
            System.out.println("not eligible to vote");

        }

        System.out.println("enter a number to figure out if it's even or odd ");

        int number = scanner.nextInt();

        if(number%2==0){
            System.out.println("the number "+ number + " is even");

        }
        else{
            System.out.println("the number "+ number + " is odd ");


        }



        scanner.close();

    }
}
