/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

import static st.DB_Connect.con;
import static st.MainWindow.UId;
import static st.MainWindow.pst;

/**
 *
 * @author dinus
 */
public class BorrowReturn extends javax.swing.JInternalFrame {
public ResultSet rs =null;
    /**
     * Creates new form BorrowReturn
     */
    public BorrowReturn() {
        initComponents();
        jTextFieldMemberId.setEditable(true);
        jTextFieldName.setEditable(false);
        jTextFieldNIC.setEditable(false);
        
        jTextFieldBookId.setEditable(true);
        jTextFieldIsbnNo.setEditable(false);
        jTextFieldTitle.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelIsbnNo = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldMemberId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldNIC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBookId = new javax.swing.JTextField();
        jLabelIsbnNo1 = new javax.swing.JLabel();
        jTextFieldIsbnNo = new javax.swing.JTextField();
        jLabelTitle1 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jButtonBBorrow = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelRMemberid = new javax.swing.JLabel();
        jLabelRName = new javax.swing.JLabel();
        jTextFieldRName = new javax.swing.JTextField();
        jTextFieldRMemberId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldRBookId = new javax.swing.JTextField();
        jLabelRBookId = new javax.swing.JLabel();
        jLabelRTitle = new javax.swing.JLabel();
        jTextFieldRTitle = new javax.swing.JTextField();
        jLabelRIsbm = new javax.swing.JLabel();
        jTextFieldRIsbn = new javax.swing.JTextField();
        jButtonRReturn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Borrow / Return Form");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrow Section"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Member ID");
        jLabel6.setToolTipText("");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, -1, -1));

        jLabelIsbnNo.setText("Name");
        jPanel5.add(jLabelIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 80, 51, 20));

        jLabelTitle.setText("NIC No");
        jPanel5.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 51, 20));

        jTextFieldMemberId.setEditable(false);
        jTextFieldMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMemberIdActionPerformed(evt);
            }
        });
        jTextFieldMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMemberIdKeyReleased(evt);
            }
        });
        jPanel5.add(jTextFieldMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 165, -1));

        jTextFieldName.setText("Automatically filled");
        jTextFieldName.setToolTipText("");
        jPanel5.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 165, -1));

        jTextFieldNIC.setText("Automatically filled");
        jPanel5.add(jTextFieldNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 120, 165, -1));

        jLabel7.setText("Book ID");
        jLabel7.setToolTipText("");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jTextFieldBookId.setEditable(false);
        jTextFieldBookId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBookIdKeyReleased(evt);
            }
        });
        jPanel5.add(jTextFieldBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 165, -1));

        jLabelIsbnNo1.setText("ISBN No");
        jPanel5.add(jLabelIsbnNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 51, 20));

        jTextFieldIsbnNo.setText("Automatically filled");
        jTextFieldIsbnNo.setToolTipText("");
        jPanel5.add(jTextFieldIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 165, -1));

        jLabelTitle1.setText("Title");
        jPanel5.add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 51, 20));

        jTextFieldTitle.setText("Automatically filled");
        jPanel5.add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 165, -1));

        jButtonBBorrow.setText("Borrow Book");
        jButtonBBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBBorrowActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonBBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 110, 60));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 26, 1070, 170));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Return Section"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRMemberid.setText("Member ID");
        jLabelRMemberid.setToolTipText("");
        jPanel1.add(jLabelRMemberid, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, -1, -1));

        jLabelRName.setText("Name");
        jPanel1.add(jLabelRName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 80, 51, 20));

        jTextFieldRName.setText("Automatically filled");
        jTextFieldRName.setToolTipText("");
        jPanel1.add(jTextFieldRName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 165, -1));

        jTextFieldMemberId.setEditable(false);
        jTextFieldRMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRMemberIdKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldRMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 165, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 600, 240));

        jTextFieldMemberId.setEditable(false);
        jTextFieldRBookId.setEditable(false);
        jTextFieldRBookId.setText("Automatically filled");
        jPanel1.add(jTextFieldRBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 165, -1));

        jLabelRBookId.setText("Book ID");
        jLabelRBookId.setToolTipText("");
        jPanel1.add(jLabelRBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelRTitle.setText("Title");
        jPanel1.add(jLabelRTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 51, 20));

        jTextFieldRTitle.setEditable(false);
        jTextFieldRTitle.setText("Automatically filled");
        jTextFieldRTitle.setToolTipText("");
        jPanel1.add(jTextFieldRTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 165, -1));

        jLabelRIsbm.setText("ISBN No");
        jPanel1.add(jLabelRIsbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 51, 20));

        jTextFieldRIsbn.setEditable(false);
        jTextFieldRIsbn.setText("Automatically filled");
        jTextFieldRIsbn.setToolTipText("");
        jPanel1.add(jTextFieldRIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 165, -1));

        jButtonRReturn.setText("Return Book");
        jButtonRReturn.setToolTipText("");
        jButtonRReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRReturnActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 110, 60));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1070, 310));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1140, 540));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setText("Borrow / Return Form");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBBorrowActionPerformed
        boolean error=false;
    String x="INSERT INTO `transaction`(`t_m_mid`, `t_b_bid`, `t_u_uid`) VALUES ("+jTextFieldMemberId.getText()+","+jTextFieldBookId.getText()+","+UId+")";
    String y="UPDATE `book` SET `b_availability`=0 WHERE `b_bid`="+jTextFieldBookId.getText();
    System.out.println(x);
    System.out.println(y);
        try {
            pst =con.prepareStatement(x);
            pst.execute();
            pst =con.prepareStatement(y);
            pst.execute();
        
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Couldn't add the Record", "" + "Error", JOptionPane.ERROR_MESSAGE);
             error=true;
        }
        
    if(error==false)
     JOptionPane.showMessageDialog(null, "Borrowed Sucessfull ", "" + "", JOptionPane.OK_OPTION);
    jTextFieldMemberId.setText("");
    jTextFieldName.setText("");
    jTextFieldNIC.setText("");
    jTextFieldBookId.setText("");
    jTextFieldTitle.setText("");
    jTextFieldIsbnNo.setText("");
    }//GEN-LAST:event_jButtonBBorrowActionPerformed

    private void jButtonRReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRReturnActionPerformed
        boolean error1=false;
        int tid=0;
                
        Date myDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
        String myDateString = sdf.format(myDate);
   
    
    String z1="SELECT `t_tid`  FROM `transaction` WHERE `t_m_mid` ="+jTextFieldRMemberId.getText()+" AND `t_b_bid` ="+jTextFieldRBookId.getText();

     try { 
            pst =con.prepareStatement(z1);
            rs=pst.executeQuery();
            rs.next();
            tid=rs.getInt("t_tid");            
        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println(tid);
    String x1="UPDATE `transaction` SET `t_rdatetime`='"+myDateString+"' WHERE `t_tid`="+tid;
    String y1="UPDATE `book` SET `b_availability`=1 WHERE `b_bid`="+jTextFieldRBookId.getText();
     
     try {
            pst =con.prepareStatement(x1);
            pst.execute();
            
            pst =con.prepareStatement(y1);
            pst.execute();
          
            
        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
      System.out.println(x1);
      System.out.println(y1);
      System.out.println(z1);
      
    if(error1==false)
    JOptionPane.showMessageDialog(null, "Return Sucessfull", "" + "", JOptionPane.OK_OPTION); 
    jTextFieldRMemberId.setText("");
    jTextFieldRName.setText("Automatically filled");
    jTextFieldRBookId.setText("Automatically filled");
    jTextFieldRTitle.setText("Automatically filled");
    jTextFieldRIsbn.setText("Automatically filled");

    }//GEN-LAST:event_jButtonRReturnActionPerformed

    private void jTextFieldMemberIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMemberIdKeyReleased
         
     
       
       String  SearchQuery="SELECT * FROM `member` WHERE `m_mid` ="+jTextFieldMemberId.getText();

    
    try {
            pst =con.prepareStatement(SearchQuery);
            rs=pst.executeQuery();
            if(rs.next()) { 
              String name = rs.getString("m_name");
              jTextFieldName.setText(name);
              String nic = rs.getString("m_nic");
              jTextFieldNIC.setText(nic);

            }
            else
            {jTextFieldName.setText("No result");
            jTextFieldNIC.setText("No result");
            }

        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            jTextFieldName.setText("Automatically filled");
            jTextFieldNIC.setText("Automatically filled");
        }
     
    }//GEN-LAST:event_jTextFieldMemberIdKeyReleased

    private void jTextFieldMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMemberIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMemberIdActionPerformed

    private void jTextFieldBookIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBookIdKeyReleased

       String  SearchQuery="SELECT * FROM `book` WHERE `b_bid` ="+jTextFieldBookId.getText()+" AND `b_availability` = true";
   
    try {
            pst =con.prepareStatement(SearchQuery);
            rs=pst.executeQuery();
            if(rs.next()) { 
              String name = rs.getString("b_isbn");
              jTextFieldIsbnNo.setText(name);
              String nic = rs.getString("b_title");
              jTextFieldTitle.setText(nic);
            }
                        else
            {jTextFieldTitle.setText("No result");
            jTextFieldIsbnNo.setText("No result");
            }
        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            jTextFieldIsbnNo.setText("Automatically filled");
            jTextFieldTitle.setText("Automatically filled");
        }
    }//GEN-LAST:event_jTextFieldBookIdKeyReleased

    private void jTextFieldRMemberIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRMemberIdKeyReleased
       
       String  z="SELECT * FROM `transaction` WHERE `t_m_mid` ="+jTextFieldRMemberId.getText()+" AND `t_rdatetime` = 'Not-Returned'";
       String  SearchRQuery="SELECT * FROM `member` WHERE `m_mid` ="+jTextFieldRMemberId.getText();
       System.out.println(z);
           ResultSet rs2;
    try {   
            pst =con.prepareStatement(SearchRQuery);
            rs=pst.executeQuery();
            pst =con.prepareStatement(z);
            rs2=pst.executeQuery();
            if(rs.next()) { 
              String Rname = rs.getString("m_name");
              jTextFieldRName.setText(Rname);
            }
            else
            {jTextFieldRName.setText("No result");
            }
            try {
            pst =con.prepareStatement(z);
            rs2=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Transaction ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Member ID");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Book ID");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("User ID");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Date Borrowed");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Date Returned");
               } 
          catch (SQLException ex) 
           {
               Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                   } 
        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            jTextFieldRName.setText("Automatically filled");
        }
    }//GEN-LAST:event_jTextFieldRMemberIdKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r=jTable1.getSelectedRow();
     
        String rbid=jTable1.getValueAt(r, 2).toString();
        String  SearchQuery="SELECT * FROM `book` WHERE `b_bid` ="+rbid;

    
    try {
            pst =con.prepareStatement(SearchQuery);
            rs=pst.executeQuery();
            if(rs.next()) { 
                
              String rbid1 = rs.getString("b_bid");
              jTextFieldRBookId.setText(rbid1);  
              String risbn = rs.getString("b_isbn");
              jTextFieldRIsbn.setText(risbn);
              String rtitle = rs.getString("b_title");
              jTextFieldRTitle.setText(rtitle);

            }
                        else
            {//jTextFieldTitle.setText("No result");
            //jTextFieldIsbnNo.setText("No result");
            }

        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            jTextFieldRIsbn.setText("Automatically filled");
            jTextFieldRTitle.setText("Automatically filled");
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBBorrow;
    private javax.swing.JButton jButtonRReturn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelIsbnNo;
    private javax.swing.JLabel jLabelIsbnNo1;
    private javax.swing.JLabel jLabelRBookId;
    private javax.swing.JLabel jLabelRIsbm;
    private javax.swing.JLabel jLabelRMemberid;
    private javax.swing.JLabel jLabelRName;
    private javax.swing.JLabel jLabelRTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBookId;
    private javax.swing.JTextField jTextFieldIsbnNo;
    private javax.swing.JTextField jTextFieldMemberId;
    private javax.swing.JTextField jTextFieldNIC;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRBookId;
    private javax.swing.JTextField jTextFieldRIsbn;
    private javax.swing.JTextField jTextFieldRMemberId;
    private javax.swing.JTextField jTextFieldRName;
    private javax.swing.JTextField jTextFieldRTitle;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
