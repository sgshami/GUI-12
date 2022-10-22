package Exercise5;
import javax.swing.*;
import java.awt.*;

public class drawBox extends JPanel{
    Color c;
    public drawBox(Color c){
        setBackground(c);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(c);
        g.fillRect(10, 10, getWidth()-20, getHeight()-20);
    }
    
    public void colorChange(Color newColor){
        c = newColor;
        repaint();
    }
}
