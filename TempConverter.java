 

import java.util.Scanner;
public class TempConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the temperature converter.");
        System.out.println("Enter 1 to go from F to C, 2 to go from C to F, and 0(zero) to quit.");
        int choice = in.nextInt();
        TempConverter bob = new TempConverter();
        while(choice != 0)
        {
            if(choice == 1)
            {
                System.out.println("Enter the temperature in fahrenheit.");
                double f = in.nextDouble();
                double c = bob.fToC(f);
                System.out.println("That temperature in celsius is: " + c);
            }
            else if (choice == 2)
            {
                System.out.println("Enter the temperature in celsius.");
                double c = in.nextDouble();
                double f = bob.cToF(c);
                System.out.println("That temperature in fahernheit is: " + f);
            } 
            else
                System.out.println("Invalid entry. Try again,");
            System.out.println("Enter 1 to go from F to C, 2 to go from C to F, and 0(zero) to quit.");
            choice = in.nextInt();
        }
    }

    public double cToF(double c)
    {
        return c*9/5 + 32;
    }

    public double fToC(double f)
    {
        return (f-32)*5/9;
    }

}           
