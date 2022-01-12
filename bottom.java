/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN PC
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author paulin jenifer
 */
public class bottom {
      private JFrame f;
   private JPanel p;
    private JButton b,b1;
    private JLabel l;
    private JLabel l1;
    private ImageIcon ImageIcon;
    public bottom()
{
    ma();
}
public void ma()
{
   f=new JFrame("mobile earth");
   
   
   p=new JPanel();
    p.setLayout(null);
    ImageIcon icon=new ImageIcon("H:\\mobilesa\\download.jpg");
 l=new JLabel(icon);
    l.setBackground(Color.RED);
   l.setBounds(0, 0, 310, 600);
   p.add(l);
   
   l.setVisible(true);
   l1=new JLabel();
 
   l1.setText("THANK YOU FOR SHOPPING");
          
           l1.setBounds(40, 60, 720, 110);
           l1.setFont(new Font("Rockwell Nova",1,15));
           l1.setBackground(Color.BLACK);
 l1.setForeground(Color.RED);
          l1.setVisible(true);
           p.add(l1);
    b=new JButton();
    b.setBackground(Color.MAGENTA);
     b.setForeground(Color.BLACK);
    b.setText("CONITINUE SHOPPING");
    b.setBounds(50, 300, 200, 70);
    b.setVisible(true);
    b.addActionListener((java.awt.event.ActionEvent evt) -> {
        
    
            bActionPerformed(evt);
        
        });

    
            
    
    b1=new JButton();
    b1.setBackground(Color.MAGENTA);
    b1.setForeground(Color.BLACK);
    b1.setText("EXIT");
    b1.setBounds(100, 450, 110, 40);
    b1.setVisible(true);
    b1.addActionListener(this::b1ActionPerformed);
    f.add(b);
    f.add(b1);
    f.add(l1);
    f.add(l);
    f.add(p);
     f.setSize(315,635);
    f.setBackground(Color.BLACK);
    f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    private void bActionPerformed(java.awt.event.ActionEvent evt) {
        
        
        f.setVisible(false);

        Mainpage m=new Mainpage();
        m.setVisible(true);
        
    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
      
        
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setVisible(false);
        
    }

public static void main(String[] arg){
          bottom bottom = new bottom();
}
}

