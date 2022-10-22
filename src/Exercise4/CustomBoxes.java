package Exercise4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomBoxes extends JFrame{
    private JButton button = new JButton("Change Panels");
    private JLabel verticalLines = new JLabel("# of Vertical Lines");
    private JLabel horizontalLines = new JLabel("# of Horizonal Lines");
    private JTextField vl = new JTextField();
    private JTextField hl = new JTextField();
    private drawBox b1 = new drawBox(Color.WHITE);
    private drawBox b2 = new drawBox(Color.WHITE);
    
    public CustomBoxes(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.YELLOW);
        jp.setPreferredSize( new Dimension( 500, 450));
        jp.setLayout(null);
        
        button.addActionListener(new ButtonEars());
        verticalLines.setBounds(10, 10, 125, 30);
        vl.setBounds(10, 50, 125, 30);
        horizontalLines.setBounds(10, 90, 125, 30);
        hl.setBounds(10, 120, 125, 30);
        button.setBounds(10, 220, 125, 30);
        
        b1.setBounds(170, 10, 300, 100);
        b2.setBounds(170, 130, 150, 300);
        
        jp.add(button);
        jp.add(verticalLines);
        jp.add(horizontalLines);
        jp.add(vl);
        jp.add(hl);
        jp.add(b1);
        jp.add(b2);
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
           int vlines = Integer.parseInt(vl.getText());
           int hlines = Integer.parseInt(hl.getText());
           if(hlines == 0){
            hlines++;
        }
        if(vlines == 0){
            vlines++;
        }
           b1.update(vlines, hlines);
           b2.update(vlines, hlines);
           
        }
    }
}
