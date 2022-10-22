package DemoPanel2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo2Frame extends JFrame{
    private JButton button = new JButton("Update Panel");
    private JLabel lbl = new JLabel("Number of Lines: 0");
    private Demo2Panel pl = new Demo2Panel(Color.ORANGE);
    
    public Demo2Frame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize( new Dimension( 400, 250));
        jp.setLayout(null);
        
        button.setBounds(10, 10, 150, 30);
        button.addActionListener(new ButtonEars());
        lbl.setBounds(10, 50, 150, 30);
        pl.setBounds(170, 10, 200, 200);
        
        jp.add(button);
        jp.add(lbl);
        jp.add(pl);
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
            int num = (int)(50*Math.random())+1;
            lbl.setText("Number of Lines: " + num);
            pl.update(num);
        }
    }
}
