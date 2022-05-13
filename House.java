import java.awt.Color;
import apcslib.*;
public class House
{
    public static void main(String[] args)
    {
        DrawingTool cran = new DrawingTool();
        
        //New Colors
        Color SpongePine = new Color (233,182,51);
        Color SpongeLeaf = new Color (107,172,55);
        Color SpongeDoor1 = new Color (193,213,252);
        Color SpongeDoor2 = new Color (84,108,185);
        Color SpongeLeaf2 = new Color (49,240,146);
        Color Outpine = new Color (93,25,0);
        
        //Pineapple
        cran.setColor(Outpine);
        cran.setWidth(4);
        cran.drawOval(260,300);
        cran.setColor(SpongePine);
        cran.fillOval(260,300);
                
        //Door Base
        cran.up();
        cran.move(-30,-150);
        cran.setWidth(3);
        cran.setColor(SpongeDoor2);
        cran.setDirection(0);
        cran.down();
        cran.forward(60);

        //Door Right
        cran.setDirection(90);
        cran.forward(120);

        //Door Top
        cran.setDirection(180);
        cran.forward(60);

        //Door Left    
        cran.setDirection(270);
        cran.forward(120);

        //Fill Door
        cran.up();
        cran.move(0,-90);
        cran.setColor(SpongeDoor1);
        cran.down();
        cran.fillRect(60,120);

        //Door Bottom Border
        cran.up();
        cran.move(-20,-150);
        cran.setColor(SpongeDoor2);
        cran.setDirection(0);
        cran.down();
        cran.forward(40);

        //Door Right Border
        cran.setDirection(90);
        cran.forward(110);

        //Door Top Border
        cran.setDirection(180);
        cran.forward(40);

        //Door Left Border
        cran.setDirection(270);
        cran.forward(110);

        //Doorknob
        cran.up();
        cran.move(0,-100);
        cran.setColor(SpongeDoor2);
        cran.down();
        cran.drawCircle(10);
        cran.drawCircle(15);

        //Doorknob Top
        cran.up();
        cran.move(0,-85);
        cran.setDirection(90);
        cran.down();
        cran.forward(7);

        //Doorknob Left
        cran.up();
        cran.move(-15,-100);
        cran.setDirection(180);
        cran.down();
        cran.forward(7);

        //Doorknob Bottom
        cran.up();
        cran.move(0,-115);
        cran.setDirection(270);
        cran.down();
        cran.forward(7);

        //Doorknob Right
        cran.up();
        cran.move(15,-100);
        cran.setDirection(0);
        cran.down();
        cran.forward(7);

        //Leaf 1
        cran.up();
        cran.move(-45,130);
        cran.setDirection(120);
        cran.setColor(SpongeLeaf2);
        cran.setWidth(25);
        cran.down();
        cran.forward(75);
        cran.turnRight(165);
        cran.setColor(SpongeLeaf);
        cran.forward(75);

        //Leaf 2
        cran.setDirection(105);
        cran.setColor(SpongeLeaf2);
        cran.forward(85);
        cran.turnRight(165);
        cran.setColor(SpongeLeaf);
        cran.forward(85);

        //Leaf 3
        cran.setDirection(90);
        cran.setColor(SpongeLeaf2);
        cran.forward(90);
        cran.turnRight(165);
        cran.setColor(SpongeLeaf);
        cran.forward(90);

        //Leaf 4
        cran.setDirection(75);
        cran.setColor(SpongeLeaf2);
        cran.forward(85);
        cran.turnRight(165);
        cran.setColor(SpongeLeaf);
        cran.forward(85);

        //Leaf 5
        cran.setDirection(60);
        cran.setColor(SpongeLeaf2);
        cran.forward(75);
        cran.turnRight(165);
        cran.setColor(SpongeLeaf);
        cran.forward(75);        

        //Nonagon Window
        cran.up();
        cran.move(60,-40);
        cran.setWidth(5);
        cran.setColor(SpongeDoor1);
        cran.setDirection(0);
        cran.down();
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);

        //Nonagon Window Border
        cran.up();
        cran.move(60,-40);
        cran.setWidth(1);
        cran.setColor(SpongeDoor2);
        cran.setDirection(0);
        cran.down();
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);        
        cran.turnRight(40);
        cran.forward(15);

        //Decagon Window
        cran.up();
        cran.move(-80,30);
        cran.setWidth(5);
        cran.setColor(SpongeDoor1);
        cran.setDirection(0);
        cran.down();
        cran.forward(15);        
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);        

        //Decagon Window Border
        cran.up();
        cran.move(-80,30);
        cran.setWidth(1);
        cran.setColor(SpongeDoor2);
        cran.setDirection(0);
        cran.down();
        cran.forward(15);        
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        cran.turnRight(36);
        cran.forward(15);
        
        //Chimney Piece 1 Outline
        cran.up();
        cran.move(100,37.5);
        cran.setWidth(7);
        cran.setColor(SpongeDoor2);
        cran.setDirection(90);
        cran.down();
        cran.forward(10);
        cran.turnRight(90);
        cran.forward(20);
        cran.turnRight(90);
        cran.forward(10);
        cran.turnRight(90);
        cran.forward(20);
        
        //Chimney Piece 1 Fill
        cran.setColor(SpongeDoor1);
        cran.up();
        cran.backward(10);
        cran.setDirection(90);
        cran.forward(5);
        cran.down();
        cran.fillRect(20,10);
        
        //Chimney Piece 2
        cran.up();
        cran.move(120,37.5);
        cran.setWidth(5);
        cran.setColor(SpongeDoor2);
        cran.setDirection(90);
        cran.down();
        cran.forward(20);
        cran.turnRight(90);
        cran.forward(5);
        cran.turnLeft(90);
        cran.forward(10);
        cran.turnRight(90);
        cran.forward(20);
        cran.turnRight(90);
        cran.forward(35);
        cran.turnRight(90);
        cran.forward(25);
        
        //Chimney Piece 2 Fill
        cran.up();
        cran.move(132.5,45);
        cran.setColor(SpongeDoor1);
        cran.down();
        cran.fillRect(25,22.5);
        cran.up();
        cran.move(135,50);
        cran.down();
        cran.fillRect(20,32.5);
        
        //Chimney Line
        cran.up();
        cran.move(120,57.5);
        cran.setColor(SpongeDoor2);
        cran.setWidth(2);
        cran.setDirection(0);
        cran.down();
        cran.forward(25);
        
        //Chimney Piece 2 Revision
        cran.up();
        cran.move(120,37.5);
        cran.setWidth(5);
        cran.setColor(SpongeDoor2);
        cran.setDirection(90);
        cran.down();
        cran.forward(20);
        cran.turnRight(90);
        cran.forward(5);
        cran.turnLeft(90);
        cran.forward(10);
        cran.turnRight(90);
        cran.forward(20);
        cran.turnRight(90);
        cran.forward(35);
        cran.turnRight(90);
        cran.forward(25);
        
        //Chimney Piece 3
        cran.up();
        cran.move(125,67.5);
        cran.setDirection(100);
        cran.setWidth(5);
        cran.down();
        cran.forward(16);
        cran.setDirection(0);
        cran.forward(30);
        cran.setDirection(260);
        cran.forward(16);
        
        //Chimney Piece 3 Fill
        cran.up();
        cran.move(137.5,75);
        cran.setColor(SpongeDoor1);
        cran.down();
        cran.fillRect(25,12.5);
        
        //Chimney Piece 3 Revision
        cran.up();
        cran.move(125,67.5);
        cran.setDirection(100);
        cran.setColor(SpongeDoor2);
        cran.setWidth(2);
        cran.down();
        cran.forward(16);
        cran.setDirection(0);
        cran.forward(30);
        cran.setDirection(260);
        cran.forward(16);
        
        //Name
        cran.up();
        cran.move(-300,300);
        cran.setColor(SpongePine);
        cran.down();
        cran.drawString("Annie Marazita - PineBob ApplePants");
    }
}

