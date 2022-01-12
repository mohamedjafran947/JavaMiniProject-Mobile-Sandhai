
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class signup implements ActionListener {
    int check;
    String url="jdbc:mysql://localhost:3306/mydb";
    String user="root";
    String pass="";
    String pass1,id;
    JFrame fr=new JFrame();
    JTextField f1,f2;
    JLabel p,q,x,g;
    ResultSet res=null;
    PreparedStatement stmt=null;
    Connection con=null;

    signup()
    {
        
        fr.setLayout(null);
        f1=new JTextField(20);
        f1.setHorizontalAlignment(JLabel.LEFT);
        f1.setBounds(110, 100, 200, 50);
        f1.setVisible(true);
        f1.setBackground(Color.PINK);

        f2=new JTextField(20);
        f2.setHorizontalAlignment(JLabel.LEFT);
        f2.setBounds(100, 250, 200, 50);
        f2.setVisible(true);
        f2.setBackground(Color.PINK);

        p=new JLabel();
        p.setText("USER NAME:");
        p.setBounds(10, 80, 1000, 100);

        x=new JLabel();
        x.setText("PASSWORD:");
        x.setBounds(10, 230, 1000, 100);

        q=new JLabel();
        q.setText("**************LOGIN PAGE***************");
        q.setFont(new Font("Courier New",Font.BOLD,25));
        q.setBounds(100, 10, 1000, 100);

        g=new JLabel();
        g.setText("NEW  USER  KINDLY SIGN UP (PLEASE!)");
        g.setFont(new Font("Courier New",Font.BOLD,20));
        g.setBounds(50, 500, 1000, 100);

        JButton b1=new JButton("login");
        JButton b2=new JButton("sign up");
        b1.setBounds(100, 400, 90, 30);
        b2.setBounds(100, 650, 90, 30);
        b1.setBackground(Color.magenta);
        b2.setBackground(Color.MAGENTA);

        fr.getContentPane().setBackground(Color.cyan);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
          fr.add(f1);
          fr.add(f2);
          fr.add(b1);
          fr.add(b2);
          fr.add(p);
          fr.add(x);
          fr.add(q);
          fr.add(g);
          fr.setTitle("MOBILE SANDHAI");
          fr.setBounds(0,0,800,800);
          fr.setVisible(true);
          fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("login"))
        {
            try {
                String query = "SELECT * FROM `userregistration";
                try {
                    con = DriverManager.getConnection(url, user, pass);
                    stmt = con.prepareStatement(query);
                    res = stmt.executeQuery(query);
                } catch (Exception e1) {
                }
                id = f1.getText();
                pass1 = f2.getText();
                System.out.println(id);
                System.out.println(pass1);
                while (res.next()) {
                    check=0;
                    String username = res.getString("uname");
                    String password = res.getString("pass");
//                    System.out.println(id);
//                    System.out.println(username);
//                    System.out.println(password);
                    
                    if (id.equals(username) && pass1.equals(password)) {
                        Mainpage z = new Mainpage();
                        z.setVisible(true);
                        
                        System.out.println("successfull");
                        fr.setVisible(false);
                        check=1;
                        break;
                    }
                }
                if(check==0)
                {
                    JOptionPane t=new JOptionPane();
                    t.showMessageDialog(fr, "check your username and password");
            }
            }
            
            catch (SQLException ex) {
                        System.out.println(ex);
            }
        }
                       
                     
        if(s.equals("sign up"))
        {
            RegisterForm n=new   RegisterForm();
            n.setVisible(true);
              // new frame();//here the user details page need to be added
               fr.setVisible(false);

        }

    }



public static void main(String[] args){
   
    new signup();
    }

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

