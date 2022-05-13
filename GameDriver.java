import java.util.Scanner;
public class GameDriver
{
    public static void main(String[] args)
    {
        boolean done = false;
        while(!done)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 1 to input your own number, otherwise enter 0");
            int type = in.nextInt();
            if(type==1)
            {
                System.out.println("Enter the mystery number.");
                System.out.println("Remember it must be a 3 digit # with no repeats.");
                int secret = in.nextInt();
                PicoFermiGame bob = new PicoFermiGame(secret);
                bob.playGame();
            }
            else
            {
                PicoFermiGame bob = new PicoFermiGame();
                bob.playGame();
            }
            System.out.println("If you want to play again, enter 1, otherwise enter 0.");
            int choice = in.nextInt();
            if(choice == 0)
                done=true;
        }
    }
}

