package javaAssignments;

import java.util.Scanner;

public class conditionalStatement {
    public static void main (String[] args){
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number to figure out if it's positive , negative or Zero");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("the number " + number + "is positive");

        }
        else if (number <0){
            System.out.println("the number "+ number+ "is negative");

        }
        else {
            System.out.println("the number is zero ");
        }


      scanner.close();


Scanner scanner = new Scanner (System.in);
        System.out.println("enter first number");
        int firstNum = scanner.nextInt();
        System.out.println("enter second number");
        int secondNum = scanner.nextInt();
        System.out.println("enter third number");
        int thirdNumb = scanner.nextInt();

        if (firstNum>secondNum&&firstNum>thirdNumb){
            System.out.println("the first number is the biggest");

        }
        else if (secondNum>firstNum&&secondNum<thirdNumb){
            System.out.println("the second number is the biggest");
        }
else {
            System.out.println("the third number is the biggest");
        }
*/
Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day number");
        int dayNumber = scanner.nextInt();

        if (dayNumber==1){
            System.out.println("sun");
        } else if (dayNumber==2) {
            System.out.println("mon");

        }
        else if (dayNumber==3){
            System.out.println("tue");
        }
        else if (dayNumber==4){
            System.out.println("wed");

        }
        else if (dayNumber==5){
            System.out.println("thur");
        } else if (dayNumber==6) {
            System.out.println("fri");

        }
        else if (dayNumber==7){
            System.out.println("sat");
        }
        else {
            System.out.println("please enter number from 1 : 7");

        }
        switch (dayNumber){
            case 1 :
            System.out.println("sun");
            break;
            case 2 :
                System.out.println("mon");
                break;
            case 3 :
                System.out.println("tue");
                break;
            case 4 :
                System.out.println("wed");
                break;
            case 5 :
                System.out.println("thur");
                break;
            case 6 :
                System.out.println("fri");
                break;
            case 7 :
                System.out.println("sat");
                break;
            default:
                System.out.println("invalid number : please enter number from 1 - 7");
        }
    }
}
