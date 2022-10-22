package Exercise7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClicker extends JFrame{
    private MouseClickerFrame p1 = new MouseClickerFrame(Color.ORANGE);
    private MouseClickerFrame p2 = new MouseClickerFrame(Color.YELLOW);
    
    public MouseClicker(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(300, 260));
        jp.setLayout(null);
        p1.setBounds(20, 20, 260, 100);
        p2.setBounds(20, 140, 260, 100);
        jp.add(p1);
        jp.add(p2);
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
}
