import apcslib.*;
import java.awt.Color;
public class Pictures
{
    public static void main(String[] args)
    {
        PowerTool cran = new PowerTool();
        cran.setWidth(4);
        cran.setColor(Color.black);
        
        cran.jump(-200,-200);
        cran.drawBenzene();
        
        //cran.jump(-200,200,90);
        //cran.drawPonzo();
        
        cran.jump(200, 200, 90);
        cran.drawMullerLyer();
    }
}
    
