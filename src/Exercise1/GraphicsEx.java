package Exercise1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

public class GraphicsEx extends JFrame{
    public GraphicsEx(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(350, 200));
        jp.setLayout(null);
        
        DrawCircles dc = new DrawCircles(Color.ORANGE);
        dc.setBounds(60, 50, 250, 100);
        
        jp.add(dc);
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
