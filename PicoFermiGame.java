    import java.util.*;
public class PicoFermiGame
{

    private int[] secret;

    public PicoFermiGame()
    {
        secret = new int[3];
        secret[0] = (int)(Math.random()*9+1);
        int position1 = (int)(Math.random()*10);
        secret[1] = position1;
        while(position1==secret[0])
        {
            position1 = (int)(Math.random()*10);
            secret[1] = position1;
        }
        int position2 = (int)(Math.random()*10);
        secret[2] = position2;
        while(position2==secret[0] || position2==secret[1])
        {
            position2 = (int)(Math.random()*10);
            secret[2] = position2;
        }
    }

    public PicoFermiGame(int n)
    {
        secret = new int[3];
        secret[2] = n%10;
        n/=10;
        secret [1] = n%10;
        n/=10;
        secret [0] = n;
    }

    public String getHint(int guess)
    {
        int first = guess%10;
        guess/=10;
        int second = guess%10;
        guess/=10;
        int third = guess;
        boolean isThere = false;
        String hint = "";
        for(int bob: secret)
        {
            if(bob==first || bob==second || bob==third)
                isThere=true;
        }
        if(!isThere)
            return "bagel";
        int fermis=0;
        if(secret[0]==third)
            fermis++;
        if(secret[1]==second)
            fermis++;
        if(secret[2]==first)
            fermis++;
        int picos=0;
        if(first==secret[0] || first==secret[1])
            picos++;
        if(second==secret[0] || second==secret[2])
            picos++;
        if(third==secret[2] || third==secret[1])
            picos++;
        if(fermis==3)
            return "fermi fermi fermi";
        if(fermis==0)
        {
            while(picos>0)
            {
                hint+="pico ";
                picos--;
            }
        }
        if(fermis>0 && picos>=0)
        {
            while(picos>0)
            {
                hint+="pico ";
                picos--;
            }
            while(fermis>0)
            {
                hint+="fermi ";
                fermis--;
            }
        }
        return hint;
    }

    public void playGame()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play! Enter a 3-digit number with no repeating digits.");
        int guess = in.nextInt();
        String hint = getHint(guess);
        int count = 1;
        while(!hint.equals("fermi fermi fermi"))
        {
            System.out.println(hint+"\nGuess again.");
            guess = in.nextInt();
            hint = getHint(guess);
            count++;
        }
        if(hint.equals("fermi fermi fermi"))
            System.out.println(hint+"\nIt took you "+count+" tries.");
    }  
    
}

    
