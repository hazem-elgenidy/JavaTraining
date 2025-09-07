package javaAssignments;

import java.util.Scanner;

public class Cashier {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of the items");
        int quantity = scanner.nextInt();
        double total=0;


        for (int i=0 ; i<quantity; i++){
            System.out.println("enter the cost of the items");
            double price = scanner.nextDouble();

            total += price ;

            System.out.println("the price is "+ total);

        }
    }
}
