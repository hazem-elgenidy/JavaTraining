public class RouteAcademy {
    public static void main (String[] args){

        //Day 2 (Ehab Mekky)

        int a = 10; double b = 5.5;
        double sum = a+b; // compile
        System.out.println(sum); //15.5
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //relational => true / false
        int r = 20; int t =25;

        System.out.println(r > t); // false
        System.out.println(r < t );//true

        int l =12;  int k = 12;
        System.out.println(l >= k); // true
        System.out.println(l >= r); //false
        System.out.println(l <= r); // true
        System.out.println(l == r); //false
        System.out.println(l == k);// true
        System.out.println(r != t); //true
        System.out.println(l != k);// false


        // logical operators  && ||   !
        boolean lora = true , amin = true;
        System.out.println(lora&&amin); //false
        boolean roqaya = true ,salwa = false;
        System.out.println(roqaya && salwa); // true
        boolean gehad = true , abdelrahman = false;
        System.out.println(gehad || abdelrahman); // true
        System.out.println(!gehad); //false
        System.out.println(!abdelrahman); //true


        boolean b1 = 10>20; //false
        boolean b2 = 20>10; //true
        System.out.println(b1||b2); //true
        System.out.println(b1&&b2); // false


        // increment ++ and decrement -- operators
        int a = 10;
        int increment = a++;

        System.out.println(a);
        System.out.println(increment);


        int preIncrement = ++a;
        int postIncrement = a++;
        System.out.println(preIncrement);
        System.out.println(postIncrement);

        int a = 10;
        int decrement = a--;
        System.out.println(decrement);
        System.out.println(a);

        int x = 10; int y = 20; //swap
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        //assignment operators

        int a = 10; int b = 15;
        if (a >= b)
            System.out.println("hello ya basha");
        else
            System.out.println("el basha tlmiz");

        //solve using ternary

        int a = 20; int b = 10 ,c;
        if(a < b)
            System.out.println("a is greater than b");
        else
            System.out.println("a is not greater than b ");

        System.out.println(a > b ? "OK" : "no");

        if(a>b)
            c=a;
        else
            c = b;
        System.out.println(c);  //value=

        c = (a>b ? a:b);
        System.out.println(c);





    }
}
