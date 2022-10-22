package DemoPanel;
import javax.swing.*;
import java.awt.*;

public class DemoPanel extends JPanel{
    public DemoPanel(Color c){
        setBackground(c);
        setBorder( BorderFactory.createLineBorder(Color.BLACK));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        
        g.setColor(Color.GREEN);
        g.drawRect(50, 10, w/2, 4*h/5);
        g.setColor(Color.BLUE);
        g.fillOval( 0, h/2, w, h/4);
    }
}
