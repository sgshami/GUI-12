package Exercise10;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class Canvas extends JPanel{
    Color c;
    private ArrayList<ColorPts>pts = new ArrayList<ColorPts>();
    int x = 50;
    int y = 50;
    Point temp;
    
    public Canvas(Color color){
        c = color;
        addMouseListener(new Mickey());
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<pts.size(); i++){
            g.setColor(pts.get(i).getColor());
            g.fillRect(pts.get(i).getP1().x, pts.get(i).getP1().y, (pts.get(i).getP2().x - pts.get(i).getP1().x), (pts.get(i).getP2().y - pts.get(i).getP1().y));
        }
    }
    
    public void changeColor(Color color){
        c = color;
    }
    
    private class Mickey implements MouseListener{
        public void mousePressed(MouseEvent e){
            temp = (new Point(e.getX(), e.getY()));
        }
        
        public void mouseReleased( MouseEvent e){
            pts.add(new ColorPts(c, temp, new Point(e.getX(), e.getY())));
            repaint();
        }
        
        public void mouseEntered(MouseEvent e){}
        
        public void mouseExited(MouseEvent e){}
        
        public void mouseClicked(MouseEvent e){}
    }
}
