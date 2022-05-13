import apcslib.*;
import java.awt.Color;
public class PowerTool extends DrawingTool
{
    public void jump(double x, double y)
    {
        this.up();
        this.move(x,y);
        this.down();
    }

    public void jump(double x, double y, double a)
    {
        this.up();
        this.move(x,y);
        this.down();
        this.setDirection(a);        
    }

    public void drawTri(double s)
    {
        this.forward(s);
        this.turnRight(120);
        this.forward(s);
        this.turnRight(120);
        this.forward(s);
        this.turnRight(120);
    }

    public void drawOcto(double s)
    {
        int n = 0;
        while(n<8)
        {
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);
            this.setColor(new Color(r,g,b));
            this.forward(s);
            this.turnRight(45);
            n++;
        }

    }

    public void drawRegPoly(int n, double s)
    {
        int c = 0;
        while(c<n)
        {
            this.forward(s);
            this.turnRight(360.0/n);
            c++;
        }
    }

    public void drawA(double s)
    {
        this.setDirection(60);
        this.forward(2*s);
        this.turnRight(120);
        this.forward(s);
        this.turnRight(120);
        this.forward(s);
        this.backward(s);
        this.setDirection(-60);
        this.forward(s);
    }

    public void drawM()
    {
        this.setDirection(90);
        this.drawArc(180,1);
        this.setDirection(90);
        this.drawArc(180,1);
    }

    public void drawArc(double d, double s)
    {
        int c = 0;
        while(c < d)
        {
            this.forward(s);
            this.turnRight(1);
            c++;
        }
    }

    public void drawLeftArc(double d, double s)
    {
        int c = 0;
        while(c < d)
        {
            this.forward(s);
            this.turnLeft(1);
            c++;
        }
    }

    public void drawStarburst(int n, double len)
    {
        int c = 0;
        while(c<n)
        {
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);
            this.setColor(new Color(r,g,b));
            this.forward(len);
            this.backward(len);
            this.turnRight(360.0/n);
            c++;
        }
    }

    public void drawMullerLyer()
    {
        this.setColor(Color.red);

        this.setDirection(30);
        this.forward(10);
        this.backward(10);
        this.setDirection(-30);
        this.forward(10);
        this.backward(10);
        this.setDirection(0);
        this.forward(100);
        this.setDirection(150);
        this.forward(10);
        this.backward(10);
        this.setDirection(210);
        this.forward(10);
        this.backward(10);

        this.up();
        this.setDirection(270);
        this.forward(100);
        this.setDirection(30);
        this.down();
        this.forward(10);
        this.backward(10);
        this.setDirection(-30);
        this.forward(10);
        this.backward(10);
        this.setDirection(180);
        this.forward(100);
        this.setDirection(150);
        this.forward(10);
        this.backward(10);
        this.setDirection(210);
        this.forward(10);        
    }

    public void drawBenzene()
    {
        this.setDirection(-90);
        this.drawRegPoly (6,100);
        this.turnRight(60);
        this.up();
        this.forward(100);
        this.down();
        this.drawCircle(75);
    }

}
    
