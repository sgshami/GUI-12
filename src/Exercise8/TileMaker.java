package Exercise8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TileMaker extends JPanel{
    private int x = -50;
    private int y = -50;
    private Color c;
    private Color oldColor;
    
    public TileMaker(Color co){
        setBackground(co);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new Mickey());
    }
    public void changeColor(Color newColor){
        oldColor = getBackground();
        c = newColor;
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
            setBackground(c);
        }
        public void mouseExited(MouseEvent e){
            setBackground(oldColor);
        }
        public void mouseClicked(MouseEvent e){}
    }
}
