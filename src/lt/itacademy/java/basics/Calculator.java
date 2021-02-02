package lt.itacademy.java.basics;
import java.lang.Math;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void taskEleven()
    {
        String shape = "";
        String choice = "";
        boolean isRunning = true;
        while(isRunning)
        {
            System.out.println("Enter the shape you want to do calc with: ");
            shape = scanner.nextLine();
            switch(shape)
            {
                case "Rectangle":
                    calcRect();
                    break;
                case "Square":
                    calcSquare();
                    break;
                case "Triangle":
                    calcTriangle();
                    break;
                default:
                    System.out.println("Shape not known!");

            }

            System.out.println("Do you want to continue? (Y/N)");
            choice = scanner.nextLine();
            switch(choice)
            {
                case "Y":
                    break;
                case "N":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Incorrect parameter, running again");
                    break;

            }
        }
    }


    private static void calcRect()
    {
        int lengthOne = 0;
        int lengthTwo = 0;
        System.out.println("Enter length of side one: ");
        lengthOne = scanner.nextInt();
        if(lengthOne<=0)
        {
            System.out.println("Length of a side cannot be 0 or negative");
        }
        else
        {
            System.out.println("Enter length of side two: ");
            lengthTwo = scanner.nextInt();
            if(lengthTwo<=0)
            {
                System.out.println("Length of a side cannot be 0 or negative");
            }
            else
            {
                System.out.println("Perimeter of the rectangle is " + (lengthOne*2+lengthTwo*2) + " and the area is " + lengthOne*lengthTwo);
            }
        }

    }

    private static void calcTriangle()
    {
        int lengthOne = 0;
        int lengthTwo = 0;
        int lengthThree = 0;
        System.out.println("Enter length of side one: ");
        lengthOne = scanner.nextInt();
        System.out.println("Enter length of side two: ");
        lengthTwo = scanner.nextInt();
        System.out.println("Enter length of side three: ");
        lengthThree = scanner.nextInt();
        if(lengthOne > 0 && lengthTwo > 0 && lengthThree > 0)
        {
            if(lengthOne + lengthTwo > lengthThree && lengthOne + lengthThree > lengthTwo && lengthTwo + lengthThree > lengthOne)
            {
                double s = (lengthOne + lengthTwo + lengthThree) / 2;
                System.out.println("Perimeter of the triangle is " + (lengthOne+lengthTwo+lengthThree) + " and the area is " +
                        Math.sqrt((s*(s-lengthOne)*(s-lengthTwo)*(s-lengthThree))));

            }
            else
            {
                System.out.println("Illegal triangle!");
            }

        }
        else
        {
            System.out.println("One or more of the sides length is equal to 0 or is a negative number");
        }


    }

    private static void calcSquare()
    {
        int length = 0;
        System.out.println("Enter length: ");
        length = scanner.nextInt();
        if(length > 0)
        {
            System.out.println("Perimeter of the square is " + length*4 + " and the area is " + length*length);
        }
        else
        {
            System.out.println("Length cannot be 0 or a negative number");
        }

    }
}
