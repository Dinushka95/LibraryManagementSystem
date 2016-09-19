/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static st.DB_Connect.con;
import static st.MainWindow.pst;

/**
 *
 * @author dinus
 */
public class Settings extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserOptions
     */
    public Settings() {
        initComponents();
        loadtable();
    }

public void loadtable()
{
 String SearchAllQuery="SELECT * FROM `user` ";

        try {
            pst =con.prepareStatement(SearchAllQuery);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.getColumnModel().getColumn(0).setHeaderValue("User ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("UserName");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Password");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Date/Time");
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCPCurrentPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCPNewPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDUUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDUPassword = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setTitle("Settings Form");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Change Password"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Current Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel1.add(jTextFieldCPCurrentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, -1));

        jLabel2.setText("New Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(jTextFieldCPNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, -1));

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 230, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Delete User"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("User Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 28, -1, -1));
        jPanel2.add(jTextFieldDUUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 24, 80, -1));

        jLabel5.setText("PassWord");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 75, -1, -1));
        jPanel2.add(jTextFieldDUPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 71, 80, -1));

        jButton2.setText("Delete User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 135, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 230, 210));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 790, 153));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Add User"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 110, -1));

        jLabel8.setText("Username");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));

        jLabel9.setText("Password");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, -1));

        jButton3.setText("ADD User");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 240, 210));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel11.setText("Settings Form");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String x="INSERT INTO `user`(`u_name`, `u_username`, `u_password`) VALUES ('"+jTextField7.getText()+"','"+jTextField8.getText()+"','"+jTextField9.getText()+"')";
       System.out.println(x);
       try {
            pst =con.prepareStatement(x);
            pst.execute();
        
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Couldn't add the Record", "" + "Error", JOptionPane.ERROR_MESSAGE);
             
        }
      JOptionPane.showMessageDialog(null, "Sucessfull Added ", "" + "", JOptionPane.OK_OPTION);
      jTextField7.setText("");
      jTextField8.setText("");
      jTextField9.setText("");
      loadtable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String x="UPDATE `user` SET `u_password`='"+jTextFieldCPNewPassword.getText()+"' WHERE `u_password`='"+jTextFieldCPCurrentPassword.getText()+"'";
       System.out.println(x);
       try {
            pst =con.prepareStatement(x);
            pst.execute();
        
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Couldn't add the Record", "" + "Error", JOptionPane.ERROR_MESSAGE); 
        }
       JOptionPane.showMessageDialog(null, "Sucessfull Added ", "" + "", JOptionPane.OK_OPTION);
       jTextFieldCPCurrentPassword.setText("");
       jTextFieldCPNewPassword.setText("");
       loadtable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String x="DELETE FROM `user` WHERE `u_password` ='"+jTextFieldDUPassword.getText()+"' AND `u_username`='"+jTextFieldDUUserName.getText()+"'";
       System.out.println(x);
       try {
            pst =con.prepareStatement(x);
            pst.execute();
        
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Couldn't add the Record", "" + "Error", JOptionPane.ERROR_MESSAGE);
             
        }
      JOptionPane.showMessageDialog(null, "Sucessfull Added ", "" + "", JOptionPane.OK_OPTION);
      jTextFieldDUUserName.setText("");
      jTextFieldDUPassword.setText("");
      loadtable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldCPCurrentPassword;
    private javax.swing.JTextField jTextFieldCPNewPassword;
    private javax.swing.JTextField jTextFieldDUPassword;
    private javax.swing.JTextField jTextFieldDUUserName;
    // End of variables declaration//GEN-END:variables
}
