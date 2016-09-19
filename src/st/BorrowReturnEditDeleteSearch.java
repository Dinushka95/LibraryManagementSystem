/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import static st.DB_Connect.con;
import static st.MainWindow.pst;


/**
 *
 * @author dinus
 */
public class BorrowReturnEditDeleteSearch extends javax.swing.JInternalFrame {
ResultSet rs;
    /**
     * Creates new form BorrowReturnEditDeleteSearch
     */
    public BorrowReturnEditDeleteSearch() {
        initComponents();
        jTextFieldTransactionID.setEditable(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldDateR = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldDateB = new javax.swing.JTextField();
        jLabelColoumNo = new javax.swing.JLabel();
        jTextFieldMemberID = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelIsbnNo = new javax.swing.JLabel();
        jTextFieldUserID = new javax.swing.JTextField();
        jTextFieldBookID = new javax.swing.JTextField();
        jLabelEdition = new javax.swing.JLabel();
        jTextFieldTransactionID = new javax.swing.JTextField();
        jButtonBookUpdate = new javax.swing.JButton();
        jButtonBookDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonBookSearch = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldmid = new javax.swing.JTextField();
        jTextFieldtbid = new javax.swing.JTextField();
        jTextFieldttid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setTitle("Borrow / Return - - Edit / Delete / Search");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Update /Delete Section"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDateR.setEditable(false);
        jTextFieldDateR.setText("Automatically filled");
        jTextFieldDateR.setToolTipText("");
        jTextFieldDateR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateRActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldDateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 165, -1));

        jLabelDate.setText("Date Return");
        jPanel2.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 37, 20));
        jPanel2.add(jTextFieldDateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 165, -1));

        jLabelColoumNo.setText("Date Borrow");
        jPanel2.add(jLabelColoumNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jTextFieldMemberID.setToolTipText("");
        jPanel2.add(jTextFieldMemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 165, -1));

        jLabelTitle.setText("Book ID");
        jPanel2.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 51, 20));

        jLabelIsbnNo.setText("Member ID");
        jPanel2.add(jLabelIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 80, 51, 20));
        jPanel2.add(jTextFieldUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 160, 165, -1));
        jPanel2.add(jTextFieldBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 120, 165, -1));

        jLabelEdition.setText("User ID");
        jPanel2.add(jLabelEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 160, 51, 20));

        jTextFieldTransactionID.setEditable(false);
        jTextFieldTransactionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransactionIDActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTransactionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 165, -1));

        jButtonBookUpdate.setText("Update");
        jButtonBookUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 210, -1));

        jButtonBookDelete.setText("Delete");
        jButtonBookDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, -1));

        jLabel6.setText("Transaction ID");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, -1, -1));

        jButtonBookSearch.setText("Search");
        jButtonBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, -1));

        jButton3.setText("View All Transactions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 540));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 840, 350));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setText("Borrow / Return - - Edit / Delete / Search / Reports");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Reports"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Member ID");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Book ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setText("Transaction ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jPanel3.add(jTextFieldmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, -1));
        jPanel3.add(jTextFieldtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));
        jPanel3.add(jTextFieldttid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, -1));

        jButton1.setText("Member ID Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 150, -1));

        jButton4.setText("Book ID Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, -1));

        jButton5.setText("Transaction ID Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jButton6.setText("All Transaction ID Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 890, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDateRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateRActionPerformed

    private void jButtonBookUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookUpdateActionPerformed
              
        String r="UPDATE `transaction` SET `t_m_mid`="+jTextFieldMemberID.getText()+",`t_b_bid`="+jTextFieldBookID.getText()+",`t_u_uid`="+jTextFieldUserID.getText()+",`t_bdatetime`='"+jTextFieldDateB.getText()+"',`t_rdatetime`='"+jTextFieldDateR.getText()+"' WHERE `t_tid`="+jTextFieldTransactionID.getText()+"";
        
        System.out.println(r);
     int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure to Update", "Confirmation",JOptionPane.WARNING_MESSAGE);
     if(dialogResult == 0) {
          try {
            pst =con.prepareStatement(r);
            pst.execute();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     finally
     {

     String z="SELECT * FROM `transaction` WHERE `t_m_mid` ="+jTextFieldTransactionID.getText();
            jTextFieldTransactionID.setText("");
            jTextFieldBookID.setText("");
            jTextFieldMemberID.setText("");
            jTextFieldUserID.setText("");
            jTextFieldDateB.setText("");
            jTextFieldDateR.setText("");  

     try {
         pst =con.prepareStatement(z);
         rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Transation ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Book ID");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Member ID");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("User ID");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Borrowed Date");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Return Date");
      } catch (SQLException ex) {
        Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
       }

     }
     } 
    }//GEN-LAST:event_jButtonBookUpdateActionPerformed

    private void jButtonBookDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookDeleteActionPerformed
     String DelB="DELETE FROM `transaction` WHERE `t_tid`="+jTextFieldTransactionID.getText();
     
     int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure to delete", "Confirmation",JOptionPane.WARNING_MESSAGE);
     if(dialogResult == 0) {
          try {
            pst =con.prepareStatement(DelB);
            pst.execute();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     finally
     {
            jTextFieldTransactionID.setText("");
            jTextFieldBookID.setText("");
            jTextFieldMemberID.setText("");
            jTextFieldUserID.setText("");
            jTextFieldDateB.setText("");
            jTextFieldDateR.setText("");

     String z="SELECT * FROM `transaction` WHERE `t_tid` =1";
     try {
         pst =con.prepareStatement(z);
         rs=pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Transation ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Book ID");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Member ID");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("User ID");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Borrowed Date");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Return Date");
      } catch (SQLException ex) {
        Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
       }

     }
     } 
     
    }//GEN-LAST:event_jButtonBookDeleteActionPerformed

    private void jButtonBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookSearchActionPerformed
        
      String  SearchQuery="SELECT * FROM `transaction` WHERE `t_tid` ="+jTextFieldTransactionID.getText();

    
    try {
            pst =con.prepareStatement(SearchQuery);
            rs=pst.executeQuery();
            if (!rs.isBeforeFirst() ) 
            {    
            JOptionPane.showMessageDialog(null, "No Matching Data Found", "ERROR: " + "Search Not Compatible", JOptionPane.ERROR_MESSAGE);
            } 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTextFieldTransactionID.setText("");
            jTextFieldBookID.setText("");
            jTextFieldMemberID.setText("");
            jTextFieldUserID.setText("");
            jTextFieldDateB.setText("");
            jTextFieldDateR.setText("");
        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Transation ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Book ID");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Member ID");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("User ID");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Borrowed Date");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Return Date");
    }//GEN-LAST:event_jButtonBookSearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String SearchAllQuery="SELECT * FROM `transaction` ";

        try {
            pst =con.prepareStatement(SearchAllQuery);
             rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTextFieldTransactionID.setText("");
            jTextFieldBookID.setText("");
            jTextFieldMemberID.setText("");
           jTextFieldUserID.setText("");
           jTextFieldDateB.setText("");
           jTextFieldDateR.setText("");
          //  SearchTextBoxClear();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
       // ChangeBookTableHeader();
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Transation ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Book ID");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Member ID");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("User ID");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Borrowed Date");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Return Date");
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int r=jTable1.getSelectedRow();
     
        jTextFieldTransactionID.setText(jTable1.getValueAt(r, 0).toString());
        jTextFieldMemberID.setText(jTable1.getValueAt(r, 1).toString());
        jTextFieldBookID.setText(jTable1.getValueAt(r, 2).toString());
        jTextFieldUserID.setText(jTable1.getValueAt(r, 3).toString());
        jTextFieldDateB.setText(jTable1.getValueAt(r, 4).toString());
        jTextFieldDateR.setText(jTable1.getValueAt(r, 5).toString());
     

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextFieldTransactionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransactionIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransactionIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\ReportTransaction.jrxml");
            String sql="SELECT\n" +
            "     transaction.`t_tid` AS transaction_t_tid,\n" +
            "     transaction.`t_m_mid` AS transaction_t_m_mid,\n" +
            "     transaction.`t_b_bid` AS transaction_t_b_bid,\n" +
            "     transaction.`t_u_uid` AS transaction_t_u_uid,\n" +
            "     transaction.`t_bdatetime` AS transaction_t_bdatetime,\n" +
            "     transaction.`t_rdatetime` AS transaction_t_rdatetime\n" +
            "FROM\n" +
            "     `transaction` transaction\n" +
            "WHERE\n" +
            "     t_m_mid ="+jTextFieldmid.getText();
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
            jTextFieldmid.setText("");
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {

            String is="C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\ReportTransaction.jrxml";

            JasperReport jr =JasperCompileManager.compileReport(is);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);

        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               try {

            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\ReportTransaction.jrxml");
            String sql="SELECT\n" +
            "     transaction.`t_tid` AS transaction_t_tid,\n" +
            "     transaction.`t_m_mid` AS transaction_t_m_mid,\n" +
            "     transaction.`t_b_bid` AS transaction_t_b_bid,\n" +
            "     transaction.`t_u_uid` AS transaction_t_u_uid,\n" +
            "     transaction.`t_bdatetime` AS transaction_t_bdatetime,\n" +
            "     transaction.`t_rdatetime` AS transaction_t_rdatetime\n" +
            "FROM\n" +
            "     `transaction` transaction\n" +
            "WHERE\n" +
            "     t_b_bid ="+jTextFieldtbid.getText();
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
            jTextFieldtbid.setText("");
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\ReportTransaction.jrxml");
            String sql="SELECT\n" +
            "     transaction.`t_tid` AS transaction_t_tid,\n" +
            "     transaction.`t_m_mid` AS transaction_t_m_mid,\n" +
            "     transaction.`t_b_bid` AS transaction_t_b_bid,\n" +
            "     transaction.`t_u_uid` AS transaction_t_u_uid,\n" +
            "     transaction.`t_bdatetime` AS transaction_t_bdatetime,\n" +
            "     transaction.`t_rdatetime` AS transaction_t_rdatetime\n" +
            "FROM\n" +
            "     `transaction` transaction\n" +
            "WHERE\n" +
            "     t_tid ="+jTextFieldttid.getText();
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
            jTextFieldttid.setText("");
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonBookDelete;
    private javax.swing.JButton jButtonBookSearch;
    private javax.swing.JButton jButtonBookUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelColoumNo;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEdition;
    private javax.swing.JLabel jLabelIsbnNo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBookID;
    private javax.swing.JTextField jTextFieldDateB;
    private javax.swing.JTextField jTextFieldDateR;
    private javax.swing.JTextField jTextFieldMemberID;
    private javax.swing.JTextField jTextFieldTransactionID;
    private javax.swing.JTextField jTextFieldUserID;
    private javax.swing.JTextField jTextFieldmid;
    private javax.swing.JTextField jTextFieldtbid;
    private javax.swing.JTextField jTextFieldttid;
    // End of variables declaration//GEN-END:variables
}
