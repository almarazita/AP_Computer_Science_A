    import apcslib.*;
import java.awt.Color;
public class Initials
{
    public static void main(String[] args)
    {
        PowerTool bob = new PowerTool();
        bob.setWidth(4);
        bob.setColor(Color.blue);
        bob.jump(-100,-100,90);
        bob.drawA(100);
        bob.jump(150,-100,90);
        bob.setColor(Color.black);
        bob.drawM();
        //jump around and draw starbursts

        bob.jump(-400,0);       
        bob.drawStarburst(6,10);
        bob.jump(-100,-350);
        bob.drawStarburst(8,5);
        bob.jump(250,100);
        bob.drawStarburst(12,15);
        bob.jump(-200,-200);
        bob.drawStarburst((int)Math.random(), 20);
        bob.jump(0,120);
        bob.drawStarburst(16, 25);
        bob.jump(-260,80);
        bob.drawStarburst(3, 10);
        bob.jump(300,-20);
        bob.drawStarburst(4, 20);
    }
}
    
