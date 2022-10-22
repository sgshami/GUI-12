package Exercise4;
import javax.swing.*;
import java.awt.*;

public class drawBox extends JPanel{
    private int vertical;
    private int horizontal;
    public drawBox(Color c){
        setBackground(c);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        if(vertical == 0){
            vertical++;
        }
        if(horizontal == 0){
            horizontal++;
        }
        int x = getHeight(); //height, y
        int y = getWidth(); // base, x
        int hline = ((int)x/horizontal)+1;
        int vline = ((int)y/vertical)+1;
        int h = hline;
        int v = vline;
        for(int i = 0; i<horizontal; i++){
            g.drawLine(0, h, y, h);
            h += hline;
        }
        for(int i = 0; i<vertical; i++){
            g.drawLine(v, 0, v, x);
            v += vline;
        }
    }
    
    public void update(int v, int h){
        vertical = v;
        horizontal = h;
        repaint();
    }
}
