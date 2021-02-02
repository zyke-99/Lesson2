package lt.itacademy.java.basics;

public class Loops {


    public static void taskEight(int days)
    {
        int hours = 0;
        int minutes = 0;
        for(int i=1; i<=days; i++)
        {
            hours += 24;
            minutes += 1440;

        }
        System.out.println("There are " + hours + " hours and " + minutes + " minutes in a year.");
    }

    public static void taskNine(int days)
    {
        int hours = 0;
        int minutes = 0;
        int i = 0;
        while (i<days)
        {
            hours += 24;
            minutes += 1440;
            i++;
        }
        System.out.println("There are " + hours + " hours and " + minutes + " minutes in a year.");
    }

    public static void taskTen(int number)
    {
        int factorial = 1;
        for(int i=number; i>0; i--)
        {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
