import java.awt.* ;

public class Square extends Rect {
    public Square(Point initPos, int w, Color col) { // The constructor
        super(initPos, w, w, col);
    }
    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, width);
        ;
    }
}
