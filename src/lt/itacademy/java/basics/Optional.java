package lt.itacademy.java.basics;

public class Optional {

    public static boolean optionalOne(String password)
    {
        int digitCount = 0;
        if(password.length()<10)
        {
            System.out.println("Password must contain at least 10 characters");
        }
        else
        {
            char[] passwordCharArray = password.toCharArray();
            for(char c : passwordCharArray)
            {
                if(Character.isLetterOrDigit(c))
                {
                    if(Character.isDigit(c))
                    {
                        digitCount++;
                    }


                }
                else
                {
                    System.out.println("The password is not alphanumeric");
                    return false;
                }

            }

            if(digitCount>=2)
            {
                return true;
            }
            else
            {
                System.out.println("There must be 2 or more digits in the password");

            }
        }

        return false;

    }




    public static int optionalTwo(String string, int length, char charToFind)
    {
        int occurances = 0;
        int stringCounter = 0;
        char[] str = string.toCharArray();
        for(int i=0; i<length; i++)
        {
            if(stringCounter == string.length())
            {
                stringCounter = 0;
            }
            if(str[stringCounter] == charToFind)
            {
                occurances++;
            }
            stringCounter++;

        }

        return occurances;

    }


    public static int optionalThree(String numberOne, String numberTwo)
    {

        return Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
    }

}
