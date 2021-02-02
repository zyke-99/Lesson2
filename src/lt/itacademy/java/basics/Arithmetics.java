package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {

    static Scanner scanner = new Scanner(System.in);

    public static void taskFour() {

        int length = scanner.nextInt();
        System.out.println("Volume: " + length*length*length);
        System.out.println("Perimeter: " + length*12);

    }


    public static void taskFive (double feet, double inches)
    {
        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println("Converted to cm: " + centimeters);
    }

}
