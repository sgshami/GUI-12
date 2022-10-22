package Exercise6;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tank extends JPanel{
    private ArrayList<Point> pts = new ArrayList<Point>();
    int width; 
    int height;
    
    public Tank(Color c, int w, int h){
        setBackground(c);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        width = w; 
        height = h;
        for(int i = 0; i<10; i++){
            pts.add(new Point((int)(Math.random()*(width)), (int)(Math.random()*(height)))); //(int)(Math.random()*height))
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<pts.size(); i++){
            g.drawOval((pts.get(i).x), pts.get(i).y, 10, 10);
        }
    }
    
    public void update(){
        
        for(int i = 0; i<pts.size(); i++){
            int x = (pts.get(i).x);
            int y = pts.get(i).y - 10;
            if(y < -10){
                y = getHeight();
            }
            pts.set(i, new Point(x, y));
        }
        repaint();
    }
}


//(int)(Math.random() * (max - min) + min)
