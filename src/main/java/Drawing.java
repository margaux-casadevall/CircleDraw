import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Circle circle;
    Point p =new Point(200,200);
    Color c =new Color(0xE70909);// The RGB number comprises three bytes: red, green and blue
    private Frame f;   // A private field called f of AWT class Frame

    // The constructor
    public Drawing(){
        circle = new Circle(p, c, 30);
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null);  //Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimension of the Frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){ //Closes the program if close window clicked
          public void windowClosing(WindowEvent e) {
              f.dispose();
          }
        });
        setBackground(Color.WHITE); //Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }
    public void paint(Graphics g){
        circle.draw(g);
    }
}
