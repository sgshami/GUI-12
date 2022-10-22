package Exercise3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame{
    private JButton button = new JButton("Change Panels");
    private drawCircle pl = new drawCircle(Color.WHITE);
    private drawCircle p2 = new drawCircle(Color.WHITE);
    private Color color;
    
    public ColorChanger(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.YELLOW);
        jp.setPreferredSize( new Dimension( 400, 300));
        jp.setLayout(null);
        
        button.setBounds(10, 10, 150, 30);
        button.addActionListener(new ButtonEars());
        pl.setBounds(20, 50, 70, 150);
        p2.setBounds(120, 50, 200, 200);

        jp.add(button);
        jp.add(pl);
        jp.add(p2);
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
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            color = new Color(R, G, B);
            pl.update(color);
            p2.update(color);
        }
    }
}
