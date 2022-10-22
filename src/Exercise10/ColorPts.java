package Exercise10;
import javax.swing.*;
import java.awt.*;

public class ColorPts {
    Color c;
    Point p1;
    Point p2;
    
    public ColorPts(Color color, Point start, Point end){
        c = color;
        p1 = start;
        p2 = end;
    }
    public Color getColor(){
        return c;
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
}
