package Exercise5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame{
    private JButton start = new JButton("Start");
    private JButton end = new JButton("End");
    private drawBox b1 = new drawBox(Color.WHITE);
    private drawBox b2 = new drawBox(Color.RED);
    private drawBox b3 = new drawBox(Color.CYAN);
    private javax.swing.Timer timer;
    
    public ColorChanger(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.BLUE);
        jp.setPreferredSize( new Dimension( 300, 300));
        jp.setLayout(null);
        
        start.addActionListener(new ButtonEars());
        end.addActionListener(new ButtonEars());
        start.setBounds(10, 10, 120, 30);
        end.setBounds(140, 10, 120, 30);
        b1.setBounds(10, 50, 60, 60);
        b2.setBounds(80, 50, 60, 60);
        b3.setBounds(10, 120, 250, 100);
        
        timer = new javax.swing.Timer(100, new TimerListener());
        jp.add(start);
        jp.add(end);
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
            if(e.getSource().equals(start)){
                timer.start();
            }else{
                timer.stop();
            }
        }      
    }
    
    private class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Color a = random();
            Color b = random();
            Color c = random();
            b1.colorChange(a);
            b2.colorChange(b);
            b3.colorChange(c);
        }
    }
    
    private Color random(){
        int red = (int)(256*Math.random());
        int green = (int)(256*Math.random());
        int blue = (int)(256*Math.random());
        return new Color(red, green, blue);
    }
}
