import java.awt.Color;
import apcslib.*;
public class MysteryPicture
{
    public static void main(String[] args)
    {
        DrawingTool cran = new DrawingTool();
        cran.setColor(Color.black);
        cran.setWidth(3);
        cran.forward(30);
        cran.backward(60);
        cran.forward(30);
        cran.setDirection(180);
        cran.forward(30);
        cran.backward(60);
        cran.up();
        cran.setDirection(270);
        cran.forward(40);
        cran.setDirection(180);
        cran.down();
        cran.forward(60);
    }
}
    
