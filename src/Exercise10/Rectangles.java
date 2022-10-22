package Exercise10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rectangles extends JFrame{
    private JLabel green = new JLabel();
    private JLabel blue = new JLabel();
    private JLabel yellow = new JLabel();
    private JLabel red = new JLabel();
    private Canvas c = new Canvas(Color.RED);
    
    public Rectangles(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize( new Dimension( 300, 350));
        jp.setLayout(null);
        
        green.setBounds(10, 10, 50, 50);
        green.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        green.setBackground(Color.GREEN);
        green.setOpaque(true);
        
        blue.setBounds(60, 10, 50, 50);
        blue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        blue.setBackground(Color.BLUE);
        blue.setOpaque(true);
        
        yellow.setBounds(110, 10, 50, 50);
        yellow.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        yellow.setBackground(Color.YELLOW);
        yellow.setOpaque(true);
        
        red.setBounds(160, 10, 50, 50);
        red.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        red.setBackground(Color.RED);
        red.setOpaque(true);
        
        c.setBounds(10, 70, 280, 270);
        c.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        green.addMouseListener(new Mickey());
        blue.addMouseListener(new Mickey());
        yellow.addMouseListener(new Mickey());
        red.addMouseListener(new Mickey());
        jp.add(green);
        jp.add(blue);
        jp.add(yellow);
        jp.add(red);
        jp.add(c);
        getContentPane().add(jp);
        pack();
    }
    public void display(){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                setVisible(true);
            }
        });
    }
    
    private class Mickey implements MouseListener{
        public void mousePressed(MouseEvent e){}
        
        public void mouseReleased( MouseEvent e){}
        
        public void mouseEntered(MouseEvent e){}
        
        public void mouseExited(MouseEvent e){}
        
        public void mouseClicked(MouseEvent e){
           c.changeColor(getBackground());
           if(e.getSource() == green){
               c.changeColor(Color.GREEN);
           }else if(e.getSource() == blue){
               c.changeColor(Color.BLUE);
           }else if(e.getSource() == yellow){
               c.changeColor(Color.YELLOW);
           }else{
               c.changeColor(Color.RED);
           }
        }
    }
}
