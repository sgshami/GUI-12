package Exercise8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tiles extends JFrame{
    private JButton button = new JButton("New Special Color");
    private JLabel display = new JLabel();
    private TileMaker panels [][] = new TileMaker[8][8];
    private int x; 
    private int y;
    private Color c;
    
    public Tiles(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graphics");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(425, 450));
        jp.setLayout(null);
        
        c = Color.BLACK;
        display.setBackground(c);
        button.addActionListener(new ButtonEars());
        display.setOpaque(true);
        button.setBounds(10, 10, 150, 25);
        display.setBounds(170, 10, 25, 25);
        
        y = 40;
        x = 10;
        for(int i = 0; i<panels.length; i++){
            for(int k = 0; k<panels[0].length; k++){
                panels[i][k] = new TileMaker(Color.WHITE);
                panels[i][k].setBounds(x, y, 50, 50);
                jp.add(panels[i][k]);
                x += 50;
                panels[i][k].changeColor(c);
            }
            y += 50;
            x = 10;
        }
        
        jp.add(button);
        jp.add(display);
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
    
    private class ButtonEars implements ActionListener{
        public void actionPerformed(ActionEvent e){
           c = new Color((int)(Math.random()*(255)), (int)(Math.random()*(255)), (int)(Math.random()*(255)));
           for(int i = 0; i< panels.length; i++){
               for(int j = 0; j< panels.length; j++){
                   panels[i][j].changeColor(c);
               }
           }
           display.setBackground(c);
        }
    }
    
}

//(int)(Math.random()*(255);
//(int)(Math.random() * (max - min) + min)