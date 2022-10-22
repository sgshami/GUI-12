package Exercise2;
import javax.swing.*;
import java.awt.*;

public class DrawPanels extends JPanel{
    public DrawPanels(Color c){
        setBackground(c);
        setBorder( BorderFactory.createLineBorder(Color.RED));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        int x = w/4;
        
        g.setColor(Color.BLACK);
        for(int i = 0; i<5; i++){
            g.drawLine(x, 0, x, h);
            x += w/4;
        }
    }
}
