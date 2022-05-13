import java.util.Scanner;
public class Easter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int a,b,c,d,e,f,g,h,i,k,r,m,n, p,y;
            System.out.println("Please enter a year after 1582 and I will\n tell you when Easter fell or will fall.");
            y = in.nextInt();
            if(y < 1583)
                System.out.println("That is not a valid year. Please try again.");
            else
            {
                a = y%19;
                b = y/100;
                c = y%100;
                d = b/4;
                e = b%4;
                f = (b+8)/25;
                g = (b-f+1)/3;
                h = (19*a+b-d-g+15)%30;
                i = c/4;
                k = c%4;
                r = (32+2*e+2*i-h-k)%7;
                m = (a+11*h+22*r)/451;
                n = (h+r-7*m+114)/31;
                p = (h+r-7*m+114)%31;

                if(n == 3)

                    System.out.println("Easter fell or will fall on March "+(p+1)+" in the year "+y);
                else
                    System.out.println("Easter fell or will fall on April "+(p+1)+" in the year "+y);
            }    
        }
    }
}