package DemoPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
        
public class MyFrame1 extends JFrame{
    public MyFrame1(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("HEY");
        JPanel jp = new JPanel();
        jp.setBackground(Color.LIGHT_GRAY);
        jp.setPreferredSize( new Dimension( 300, 250));
        jp.setLayout( null );
        
        DemoPanel d = new DemoPanel(Color.WHITE);
        d.setBounds( 5, 50, 290, 150);
        jp.add(d);
        getContentPane().add(jp);
        pack();
    }
    
    public void display(){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                setVisible(true);
            }
        });
    }
}
