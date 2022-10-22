package Exercise9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClicktheCircle extends JFrame{
    private Box box = new Box(Color.YELLOW, 280, 305, this);
    private JLabel circles = new JLabel("There are 10 circle(s)");
    private javax.swing.Timer timer;
    
    public ClicktheCircle(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize( new Dimension( 300, 350));
        jp.setLayout(null);
        
        circles.setBounds(10, 10, 200, 25);
        box.setBounds(10, 40, 280, 305);
        
        timer = new javax.swing.Timer(10, new TimerListener());
        timer.start();
        jp.add(circles);
        jp.add(box);
        getContentPane().add(jp);
        pack();
    }
    
    public void updateLabel(int n){
        circles.setText("There are " + n + " circle(s) left.");
    }
    
    public void display(){
        EventQueue.invokeLater(new Runnable(){
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
            box.update();
        }
    }
}
