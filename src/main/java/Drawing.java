import shapes.Circle;
import shapes.Rect;
import shapes.Square;
import java.util.ArrayList;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Circle circle;
    Point p =new Point(200,200);
    Color c =new Color(0xE70909);// The RGB number comprises three bytes: red, green and blue

    private Rect rectangle;
    Point p1 = new Point(30,30);

    private Square square;
    Point p2 = new Point(230,300);

    private Frame f;   // A private field called f of AWT class Frame

    ArrayList<Shape> shapeList = new ArrayList<>();

    // The constructor
    public Drawing(){
        setupFrame();
        f.addWindowListener(new WindowAdapter(){ //Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        setupCanva();

        for (int i = 0; i < 5; i++){
            Circle circle = new Circle(p, c, 30);
            Rect rectangle = new Rect(p1, 25, 90, c);
            Square square = new Square(p2, 30, c);
            shapeList.add((Shape) circle);
            shapeList.add((Shape) rectangle);
            shapeList.add((Shape) square);
        }
        System.out.println(shapeList);
    }

    private void setupCanva() {
        setBackground(Color.WHITE); //Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null);  //Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimension of the Frame
        f.setVisible(true);
    }

    public void paint(Graphics g){
        Circle circle = new Circle(p, c, 30);
        Rect rectangle = new Rect(p1, 25, 90, c);
        Square square = new Square(p2, 30, c);
        circle.draw(g);
        rectangle.draw(g);
        square.draw(g);

        /*for (Shape shape : shapeList) {
            shape.draw(g);
        }*/
    }
}
