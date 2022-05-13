import java.awt.Color;
import apcslib.*;
import java.util.Scanner;
public class Sierpinski
{
    private DrawingTool pen;

    public Sierpinski()
    {
        pen = new DrawingTool();
        pen.setWidth(2);
    }

    public void drawSier(int level, double x1, double y1, double x2, double y2, double x3, double y3)
    {
        if(level==0)
        {
            pen.up();
            pen.move(x1, y1);
            pen.down();
            pen.move(x2, y2);
            pen.move(x3, y3);
            pen.move(x1, y1);
        }
        else
        {
            drawSier(level-1, x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2);
            drawSier(level-1, x2, y2, (x1+x2)/2, (y1+y2)/2, (x2+x3)/2, (y2+y3)/2);
            drawSier(level-1, x3, y3, (x1+x3)/2, (y1+y3)/2, (x3+x2)/2, (y3+y2)/2);
        }

    }

    public void Doritos(int level, double x1, double y1, double x2, double y2, double x3, double y3)
    {
        int r1 = (int)(Math.random()*256);
        int g1 = (int)(Math.random()*256);
        int b1 = (int)(Math.random()*256);
        pen.setColor(new Color (r1,g1,b1));
        drawSier(level+2, x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2);
        int r2 = (int)(Math.random()*256);
        int g2 = (int)(Math.random()*256);
        int b2 = (int)(Math.random()*256);
        pen.setColor(new Color (r2,g2,b2));
        drawSier(level+2, x2, y2, (x1+x2)/2, (y1+y2)/2, (x2+x3)/2, (y2+y3)/2);
        int r3 = (int)(Math.random()*256);
        int g3 = (int)(Math.random()*256);
        int b3 = (int)(Math.random()*256);
        pen.setColor(new Color (r3,g3,b3));
        drawSier(level+2, x3, y3, (x1+x3)/2, (y1+y3)/2, (x3+x2)/2, (y3+y2)/2);
    }

    public static void main(String[] args)
    {
        Sierpinski bob = new Sierpinski();
        bob.Doritos(5,-300,-300,0,300,300,-300);
    }    
}