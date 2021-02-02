package lt.itacademy.java.basics;
import java.util.Scanner;

public class Basics {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {





    }


    private void taskOne()
    {
        String name = "";
        String surname = "";
        int age = 0;
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Enter your surname");
        surname = scanner.nextLine();
        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("Hello I am " + name + " " + surname + ". I am attending IT Academy 2021");
    }

    private void taskTwo()
    {
        boolean isCool = true;
        byte myByte = 0;
        char myChar = 'a';
        float myFloat = 10.4f;
        int myInt = 42;
        short myShort = 30;

        System.out.println("My concat: " + isCool + myByte + myChar + myFloat + myInt + myShort);
    }

    private void taskThree(int a, int b)
    {
        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("");
        if(a > b)
        {
            System.out.println("Max: " + a);
            System.out.println("Min: " + b);
            System.out.println("Distance: " + (a-b));
        }
        else
        {
            System.out.println("Max: " + b);
            System.out.println("Min: " + a);
            System.out.println("Distance: " + (b-a));

        }

    }

}
