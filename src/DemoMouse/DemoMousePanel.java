package DemoMouse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMousePanel extends JPanel{
    private int x = -50;
    private int y = -50;
    
    public DemoMousePanel(Color bg){
        setBackground(bg);
        setBorder( BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new Mickey());
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(x-20, y-20, 40, 40);
    }
    
    private class Mickey implements MouseListener{
        public void mousePressed(MouseEvent e){
            x = e.getX();
            y = e.getY();
            repaint();
        }
        public void mouseReleased( MouseEvent e){
            x = -50;
            y = -50;
            repaint();
        }
        public void mouseEntered(MouseEvent e){
            Color c = getBackground();
            setBackground( c.brighter());
        }
        public void mouseExited(MouseEvent e){
            Color c = getBackground();
            setBackground(c.darker());
        }
        public void mouseClicked(MouseEvent e){}
    }
}
