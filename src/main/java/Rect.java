import java.awt.* ;
public class Rect extends Shape{
    public int width, height;

    public Rect(Point initPos, int w, int h, Color col){ // The constructor
        super(initPos, col);
        width = w;
        height = h;
    }

    @Override
    public void draw(Graphics g){ // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);;
    }
}
