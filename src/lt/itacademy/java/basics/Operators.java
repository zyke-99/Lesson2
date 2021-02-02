package lt.itacademy.java.basics;

public class Operators {

    public static void taskSix(double sideOne, double sideTwo, double sideThree)
    {
        if(sideOne == sideTwo && sideTwo == sideThree)
        {
            System.out.println("The triangle is equilateral");
        }
        else if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree)
        {
            System.out.println("The triangle is isosceles");
        }
        else
        {
            System.out.println("The triangle is scalene");
        }

    }


    public static void taskSeven(double distance, double fuelLeft, double fuelAverages, double fuelPrice)
    {
        double distanceLeft = distance - (fuelLeft / fuelAverages)*100;
        if(distanceLeft > 0)
        {
            double fuelNeeded = distanceLeft/100 * fuelAverages;
            double fuelNeededPrice = fuelNeeded * fuelPrice;
            System.out.println("Destination is in " + distance + "km. The car is not able to reach it. It needs " + fuelNeeded + "L more fuel. It will cost " + fuelNeededPrice);

        }
        else
        {
            distanceLeft *= (-1);
            fuelLeft = distanceLeft/100 * fuelAverages;

            System.out.println("Destination is in " + distance + "km. The car is able to reach it. It will have " + fuelLeft + "L fuel left.");

        }

    }

}
