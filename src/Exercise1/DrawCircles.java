package Exercise1;
import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JPanel{
    public DrawCircles(Color c){
        setBackground(c);
        setBorder( BorderFactory.createLineBorder(Color.BLACK));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(10, 10, 230, 80);
        g.setColor(Color.WHITE);
        g.fillOval( 0, 0, h/2, h/2);
        g.setColor(Color.GRAY);
        g.fillOval(w-(h/2), (h-h/2), h/2, h/2);
        
        //Radius of Circle is bigger because 25 pixel is too small and doesn't look like example image
    }
}
