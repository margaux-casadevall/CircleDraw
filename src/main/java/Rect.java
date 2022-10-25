import java.awt.* ;
public class Rect {
    private int X;
    private int Y;
    private int width, height;
    private Color col; // AWT class Color

    public Rect(int x, int y, int w, int h, Color col){ // The constructor
        this.X = x;
        this.Y = y;
        width = w;
        height = h;
        this.col=col;
    }
    public void draw(Graphics g){ // A method that draws the object in g
        g.setColor(col);
        g.fillRect(X, Y,width,height);;
    }
}
