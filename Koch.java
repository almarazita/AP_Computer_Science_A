import apcslib.*;
import java.util.Scanner;
import java.awt.Color;
public class Koch
{
    private DrawingTool pen;

    public Koch()
    {
        pen = new DrawingTool();
        pen.setColor(Color.magenta);
        pen.setWidth(2);
    }

    public void drawCurve(int level, double len)  //recursive
    {
        if(level == 0)
            pen.forward(len);
        else{
            drawCurve(level-1, len/3);
            pen.turnLeft(60);
            drawCurve(level-1, len/3);
            pen.turnRight(120);
            drawCurve(level-1, len/3);
            pen.turnLeft(60);
            drawCurve(level-1, len/3);
        }
    }

    public void snowflake(int level, int sides, double len)
    {
        pen.up();
        pen.move(-300,300);
        pen.down();
        pen.setDirection(0);
        for(int i=0; i<sides; i++)
        {
            //changed color
            drawCurve(level+3, len);
            pen.move(0,100);
            pen.turnRight(360.0/sides);
        }
        //move pen?
        //setColor?
        //drawRegPoly
        //in loop will say drawCurve(level, len);       
    }

    public void misSnowflake(int level, int sides, double len)
    {
        pen.up();
        pen.move(-300,300);
        pen.down();
        pen.setDirection(0);
        for(int i=0; i<sides; i++)
        {
            drawCurve(level, len);
            pen.turnRight(480.0/sides);
        }       
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many sides do you want for your snowflake?");
        int s = in.nextInt();
        System.out.println("What level do you want for your Koch curve?");
        int level = in.nextInt();
        System.out.println("How long do you want each side to be?");
        double len = in.nextDouble();
        Koch bob = new Koch();
        //bob.drawCurve(level, len);
        bob.misSnowflake(level, s, len);
    }
}

