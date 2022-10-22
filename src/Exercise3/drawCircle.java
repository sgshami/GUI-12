package Exercise3;
import javax.swing.*;
import java.awt.*;

public class drawCircle extends JPanel{
    private Color color;
    public drawCircle(Color c){
        setBackground(c);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int h = getHeight();
        int w = getWidth();
        g.setColor(color);
        g.fillOval(0, 0, w, h);
    }
    
    public void update(Color c){
        color = c;
        repaint();
    }
}