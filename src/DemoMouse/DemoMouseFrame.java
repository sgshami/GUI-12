package DemoMouse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMouseFrame extends JFrame{
    private DemoMousePanel p1 = new DemoMousePanel(Color.RED);
    private DemoMousePanel p2 = new DemoMousePanel(Color.ORANGE);
    
    public DemoMouseFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(300, 250));
        jp.setLayout(null);
        p1.setBounds(20, 20, 100, 200);
        p2.setBounds(160, 20, 100, 200);
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
