/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//97818047154
/**
 *
 * @author ADMIN PC
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first implements ActionListener{
   
     JFrame f;
     JPanel p;
     JButton b;
     JLabel l;
     ImageIcon ImageIcon;




public  first()
{
    f=new JFrame("MOBILE EARTH");
    
    
    
    //p=new JPanel();
    //p.setLayout(null);
    b=new JButton("START");
     b.setBackground(Color.orange);
   
    b.setBounds(320,420,100,50);
    b.addActionListener(this);
    //b.setVisible(true);
    
    
 ImageIcon icon=new ImageIcon("H:\\mobilesa\\download.jpg");
 l=new JLabel(icon);
    l.setBackground(Color.BLACK);
   l.setBounds(0,0,1000,510);
  // l.setVisible(true);
 
   //p.add(l);
  
 f.add(b);
 f.add(l);
 f.setVisible(true);
    f.setBounds(0,0,800,600);
 //f.add(p);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
     @Override
     public void actionPerformed(ActionEvent e)
{
    String a=e.getActionCommand();
    if(a.equals("START"))
                     {
                        
                        signup q=new signup();
//                        q.setVisible(true);
                         f.setVisible(false);

                      //  sappai k=new sappai();

     } 
}

public static void main(String[] arg){
        new first();
}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

