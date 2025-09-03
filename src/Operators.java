import java.util.Scanner;

public class Operators {
    public static void main (String[] args){

        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter your Age: ");
        int studentAge = scanner.nextInt();

        System.out.println("student age is: "+ studentAge);

        String status = studentAge>18? "eligible": "not eligible";
        System.out.println(status);







        scanner.close();
    }
}
