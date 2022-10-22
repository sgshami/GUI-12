package DemoPanel2;
import javax.swing.*;
import java.awt.*;

public class Demo2Panel extends JPanel{
    private int numLines = 0;
    public Demo2Panel(Color c){
        setBackground(c);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int h = getHeight();
        for(int n = 1; n <= numLines; n++){
            g.drawLine(0, 0, n*25, h);
        }
    }
    
    public void update(int n){
        if(n < 0){
            numLines = 0;
        }else{
            numLines = n;
        }
        repaint();
    }
}
