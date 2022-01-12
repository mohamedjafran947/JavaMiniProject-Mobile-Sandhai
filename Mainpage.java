/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN PC
 */
import java.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;


public class Mainpage extends javax.swing.JDialog {
public Mainpage() {
        initComponents();
    }
    private void initComponents() {
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        scrollbar1 = new java.awt.Scrollbar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("dvgdfgdfg");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(1120, 102, 0, 0);
        jPanel1.add(scrollbar1);
        scrollbar1.setBounds(1164, 10, 16, 464);
        jButton1.setText("<--Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                 jDesktopPane1.setVisible(false);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 110, 23);
        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Click here to buy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                 jDesktopPane1.setVisible(false);
                           }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 250, 150, 30);
        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setText("Click here to buy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(690, 250, 130, 30);
        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setText("Click here to buy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(170, 470, 140, 30);
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Shonar Bangla", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("MOBILE EARTH");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\download.jpg")); // NOI18N
        jPanel3.add(jLabel2);
       jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 130, 90));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1060, 80);
        jLabel4.setBackground(new java.awt.Color(204, 102, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\sam.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 170, 154);
        jTable1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "Rs.35000"}
            },
            new String [] {
                "SAMSUNG Galaxy S6", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(38);
        jScrollPane1.setViewportView(jTable1);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 180, 250, 60);
         jLabel3.setBackground(new java.awt.Color(255, 102, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\mi.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 150, 160, 170);
        jTable2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "Rs.25000"}
            },
            new String [] {
                "REDMI 7 pro", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setRowHeight(28);
        jScrollPane2.setViewportView(jTable2);
        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(690, 180, 250, 50);
        jLabel6.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\honor.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 390, 150, 130);
        jTable3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "Rs.10,000"}
            },
            new String [] {
                "HONOR 6s", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setRowHeight(28);
        jScrollPane3.setViewportView(jTable3);
        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(170, 400, 280, 50);
        jLabel8.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\nokia.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 380, 150, 150);
        jTable4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "Rs.19,000"}
            },
            new String [] {
                "NOKIA 6.1 plus", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setRowHeight(28);
        jScrollPane4.setViewportView(jTable4);
        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(690, 400, 260, 50);
        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setText("Click here to buy");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(690, 470, 130, 30);
        jLabel7.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\oneplus.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 560, 150, 160);
        jTable5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "35,000"}
            },
            new String [] {
                "ONEPLUS 7t", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.setRowHeight(28);
        jScrollPane5.setViewportView(jTable5);
        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(170, 590, 280, 50);
        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setText("Click here to buy");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(170, 670, 140, 30);
        jLabel9.setIcon(new javax.swing.ImageIcon("H:\\mobilesa\\vivo.jpg")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(540, 580, 150, 150);
        jTable6.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "Rs.19,000"}
            },
            new String [] {
                "NOKIA 6.1 plus", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.setRowHeight(28);
        jScrollPane6.setViewportView(jTable6);
        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(690, 400, 260, 50);
        jTable7.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MRP:", "Rs.25,000"}
            },
            new String [] {
                "VIVO Z1 pro", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable7.setRowHeight(28);
        jScrollPane7.setViewportView(jTable7);
        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(690, 590, 280, 50);
        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setText("Click here for more");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(690, 670, 150, 30);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 980));
        jPanel1.getAccessibleContext().setAccessibleDescription("");
       pack();
    }// </editor-fold>
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        first q=new first();
        q.setVisible(true);
        this.setVisible(false);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Samsung s=new Samsung();
        s.setVisible(true);
        this.setVisible(false);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Redmi r=new Redmi();
        r.setVisible(true);
        this.setVisible(false);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Honor h=new Honor();
        h.setVisible(true);
        this.setVisible(false);
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        oneplus o=new oneplus();
        o.setVisible(true);
        this.setVisible(false);
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        nokia n=new nokia();
        n.setVisible(true);
        this.setVisible(false);
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        vivo v=new vivo();
        v.setVisible(true);
        this.setVisible(false);
    }
    public static void main(String args[]) {
       Mainpage a=new Mainpage();
       a.setVisible(true);       
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration
}