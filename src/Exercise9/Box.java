package Exercise9;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class Box extends JPanel{
    private ArrayList<Point> pts = new ArrayList<Point>();
    private ClicktheCircle ctc;
    int width; 
    int height;
    
    public Box(Color c, int w, int h, ClicktheCircle frame){
        ctc = frame;
        setBackground(c);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        width = w; 
        height = h;
        for(int i = 0; i<10; i++){
            pts.add(new Point((int)(Math.random()*(width)), (int)(Math.random()*(height)))); //(int)(Math.random()*height))
        }
        addMouseListener(new Mickey());
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<pts.size(); i++){
            g.setColor(Color.BLUE);
            g.fillOval((pts.get(i).x), pts.get(i).y, 20, 20);
        }
        addMouseListener(new Mickey());
    }
    
    public void update(){
        for(int i = 0; i<pts.size(); i++){
            int y = (pts.get(i).y);
            int x = pts.get(i).x + 1;
            if(x > getWidth()){
                x = 0;
            }
            pts.set(i, new Point(x, y));
        }
        repaint();
    }
    private class Mickey implements MouseListener{
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getX();
            if (SwingUtilities.isLeftMouseButton(e)){
                for(int i = 0; i<pts.size(); i++){
                    if(x >= pts.get(i).getX()-25 && x <= pts.get(i).getX()+25){
                        if(y >= pts.get(i).getY()-25 && y <= pts.get(i).getY()+25){
                            pts.remove(i);
                            ctc.updateLabel(pts.size());
                            repaint();
                            
                        }
                    }
                }
                repaint();
            }
        }
        public void mouseReleased( MouseEvent e){}
        
        public void mouseEntered(MouseEvent e){}
        
        public void mouseExited(MouseEvent e){}
        
        public void mouseClicked(MouseEvent e){}
    }
}
