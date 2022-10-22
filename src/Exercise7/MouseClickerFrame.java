package Exercise7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MouseClickerFrame extends JPanel{
    private ArrayList<Point> pts = new ArrayList<Point>();
    
    
    public MouseClickerFrame(Color c){
        setBackground(c);
        setBorder( BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new Mickey());
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for(int i = 0; i<pts.size(); i++){
            int x = pts.get(i).x;
            int y = pts.get(i).y;
            g.fillRect(x-10, y-10, 20, 20);
        }
    }
    
    private class Mickey implements MouseListener{
        public void mousePressed(MouseEvent e){
            if (SwingUtilities.isLeftMouseButton(e)){
                pts.add(new Point(e.getX(), e.getY()));
                repaint();
            }else{
                pts.removeAll(pts);
                repaint();
            }
        }
        public void mouseReleased( MouseEvent e){
            
        }
        public void mouseEntered(MouseEvent e){
            
        }
        public void mouseExited(MouseEvent e){
            
        }
        public void mouseClicked(MouseEvent e){}
    }
}
