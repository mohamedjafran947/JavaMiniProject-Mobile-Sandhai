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
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class mini  implements ActionListener {
    JFrame f;
    String name1,age1,det1;
    JLabel l,M,N,O,P,q,r,s,t;
    JButton a,b,c,d,e;
    mini()
    {
        int i=0;
        int j=0;
        f=new JFrame();
        f.setBackground(Color.WHITE);
        l=new JLabel();
        l.setText("BILL GENERATION:");
        l.setBounds(50, 50, 1000, 100);
       
        
        M=new JLabel();
        M.setText("YOU ARE SELECTED THESE ITEMS:");
        M.setBounds(50, 100, 1000, 100);
       

        O=new JLabel();
        O.setText("*******************************************************");
        O.setBounds(50, 75, 1000, 100);
       
        P=new JLabel();
        P.setText("TOTAL PAYMENT================");
        P.setBounds(50, 500, 1000, 100);
       

        String url="jdbc:mysql://localhost:3306/mydb";
        String user="root";
        String pass="";
        Connection con=null;
        ResultSet res=null;
        String abc="SELECT * FROM tab ";     
        try{
             con=DriverManager.getConnection(url,user,pass);
             PreparedStatement  stmt= con.prepareStatement(abc);            
             res=stmt.executeQuery(abc);
             while(res.next()){
                name1=res.getString("mob");
                age1=res.getString("val");
                det1=res.getString("det");             
           }         
                q=new JLabel();
                s=new JLabel();
                r=new JLabel();
                t=new JLabel();
                
                q.setText(name1);
                s.setText(age1);
                r.setText(det1);
                t.setText(age1);
                s.setBounds(200, 200, 1000, 100);
                q.setBounds(50, 200, 1000, 100);
                r.setBounds(250, 200, 1000, 100);
                t.setBounds(300, 500, 1000, 100);
                con.close();
        }
        catch(Exception e)
        {

        }
        a=new JButton("pay   and   proceed");
        a.setBounds(300, 300, 200, 80);
        a.setBackground(Color.PINK);
        a.addActionListener(this);
        f.add(a);
        f.add(l);
        f.add(M);
        f.add(O);
        f.add(P);
        f.add(q);
        f.add(s);
        f.add(r);
        f.add(t);
       
        f.setBounds(0, 0, 800, 600);
        
        f.setTitle("MOBILE SANDAI");
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
         public void actionPerformed(ActionEvent e)
    {
             String s=e.getActionCommand();

             if(s.equals("pay   and   proceed"))
                     {
                        f.setVisible(false);
                        bottom m=new bottom();
                        

                      //  sappai k=new sappai();

     } 
         }
        


    
    public static void main(String[] arg)
    {
        mini z=new mini();
       
    }

}

