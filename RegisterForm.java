 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SRI. Nilavan
 */
public class RegisterForm extends javax.swing.JFrame {
 Connection conn =null;
 PreparedStatement pst=null;
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3close = new javax.swing.JLabel();
        jLabel4min = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton4register = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3register = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cmpGender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setForeground(new java.awt.Color(138, 203, 219));

        jLabel6.setFont(new java.awt.Font("Verdana Pro Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register");

        jLabel3close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3close.setText("x");
        jLabel3close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3closeMouseClicked(evt);
            }
        });

        jLabel4min.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4min.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4min.setText("-");
        jLabel4min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4minMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 255, 238));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(209, 108, 240));
        jLabel7.setText("Username:");

        txtUsername.setBackground(new java.awt.Color(131, 175, 212));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(51, 97, 90));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jButton4register.setBackground(new java.awt.Color(255, 128, 0));
        jButton4register.setForeground(new java.awt.Color(255, 255, 255));
        jButton4register.setText("REGISTER");
        jButton4register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4registerActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(242, 38, 19));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CLOSE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPanel6.setVisible(false);
                 jPanel3.setVisible(false);
                
                first n=new first();
                n.setVisible(true);
            }
        });

        jLabel3register.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3register.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3register.setText("Click here to login");
        jLabel3register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3registerMouseClicked(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 255, 204));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 97, 90));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 97, 90));
        jLabel2.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 97, 90));
        jLabel4.setText("Email ID:");

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setForeground(new java.awt.Color(204, 255, 204));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 97, 90));
        jLabel11.setText("Phone No:");

        txtPhone.setBackground(new java.awt.Color(204, 204, 204));
        txtPhone.setForeground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 97, 90));
        jLabel8.setText("Password:");

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 255, 204));

        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(204, 255, 204));
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 97, 90));
        jLabel3.setText("Gender:");

        cmpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others", " " }));
        cmpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpGenderActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell Nova Cond Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("MOBILE EARTH");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4register)
                .addGap(48, 48, 48))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3register, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName)
                    .addComponent(txtUsername)
                    .addComponent(txtEmail)
                    .addComponent(txtPhone)
                    .addComponent(txtPass)
                    .addComponent(jScrollPane1)
                    .addComponent(cmpGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4register, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3register)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3close)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3close)
                    .addComponent(jLabel4min))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
    
    }                                       
private void jLabel3registerMouseClicked(java.awt.event.MouseEvent evt) {                                             
        signup ob=new signup();
        this.dispose();
    }                                            
    private void jButton4registerActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       try{
          
             String url="jdbc:mysql://localhost:3306/mydb";
                                String username="root";
                                String password="";
                                 conn=DriverManager.getConnection(url,username,password);
          // conn = DriverManager.getConnection("jdbc:derby://localhost:1527/s","s","s");
           String query="insert into USERREGISTRATION (NAME,UNAME,MAIL,GENDER,PHONE,PASS,ADRESS) VALUES (?,?,?,?,?,?,?)";
           
           pst = conn.prepareStatement(query);
           pst.setString(1, txtName.getText());
           pst.setString(2, txtUsername.getText());
           pst.setString(3, txtEmail.getText());
           pst.setString(4, cmpGender.getSelectedItem().toString());
           pst.setString(5, txtPhone.getText());
           pst.setString(6, txtPass.getText());
           pst.setString(7, txtAddress.getText());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Registed successfully!!!...");
           this.setVisible(false);
           signup k=new signup();
           k.setVisible();
       }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex); 
       }
    }                                                

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jLabel4minMouseClicked(java.awt.event.MouseEvent evt) {                                        
        this.setState(JFrame.ICONIFIED);
    }                                       

    private void jLabel3closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         

    private void cmpGenderActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> cmpGender;
    private javax.swing.JButton jButton4register;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3close;
    private javax.swing.JLabel jLabel3register;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4min;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
                  
}
