package Exercise6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bubbles extends JFrame{
    private Tank b1 = new Tank(Color.LIGHT_GRAY, 280, 100);
    private Tank b2 = new Tank(Color.YELLOW, 94, 200);
    private Tank b3 = new Tank(Color.ORANGE, 110, 110);
    private javax.swing.Timer timer;
    
    public Bubbles(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize( new Dimension( 300, 350));
        jp.setLayout(null);

        b1.setBounds(10, 10, 280, 100);
        b2.setBounds(10, 120, 94, 200);
        b3.setBounds(114, 120, 110, 110);
        
        timer = new javax.swing.Timer(100, new TimerListener());
        timer.start();
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
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
    
    private class ButtonEars implements ActionListener{
        public void actionPerformed(ActionEvent e){
            timer.start();
        }      
    }
    
    private class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            b1.update();
            b2.update();
            b3.update();
        }
    }
}
