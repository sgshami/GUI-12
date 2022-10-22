package Exercise2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

public class PanelsEx extends JFrame{
    public PanelsEx(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(450, 300));
        jp.setLayout(null);
        
        DrawPanels dp = new DrawPanels(Color.ORANGE);
        dp.setBounds(5, 5, 40, 290);
        
        DrawPanels dp1 = new DrawPanels(Color.YELLOW);
        dp1.setBounds(100, 5, 300, 220);
        
        jp.add(dp1);
        jp.add(dp);
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
