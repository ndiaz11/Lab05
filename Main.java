import java.util.Scanner;
import java.util.*;

// i am adding this comment for GITHUB !!!!


public class Main {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        double mpgRate,
                tankCap,
                tankPer,
                rawRange;

        //ask for car's mpg

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpgRate = scnr.nextDouble();

        if (mpgRate <= 0)
        {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }
        else
        {
            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
            tankCap = scnr.nextDouble();

            if (tankCap <= 0)
            {
                System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
                System.exit(0);
            }
            else
            {
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
                tankPer = scnr.nextDouble();

                if (tankPer < 0 || tankPer > 100)
                {
                    System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                    System.exit(0);
                }
                else
                {
                    rawRange = (mpgRate * tankCap * (tankPer * 0.01));

                    if (rawRange <= 25)
                    {
                        System.out.println("Attention! Your current estimated range is running low: " + ((int) (rawRange)) + "miles left!!!");
                    }
                    else
                    {
                        System.out.println("Keep driving! Your current estimated range is: " + ((int)(rawRange)) +"miles!");
                    }
                }
            }
        }
    }
}