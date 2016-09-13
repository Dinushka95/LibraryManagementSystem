/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st;

/**
 *
 * @author dinus
 */
public class BorrowReturnEditDeleteSearch extends javax.swing.JInternalFrame {

    /**
     * Creates new form BorrowReturnEditDeleteSearch
     */
    public BorrowReturnEditDeleteSearch() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldColoumNo = new javax.swing.JTextField();
        jLabelColoumNo = new javax.swing.JLabel();
        jTextFieldIsbnNo = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelIsbnNo = new javax.swing.JLabel();
        jTextFieldEdition = new javax.swing.JTextField();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabelEdition = new javax.swing.JLabel();
        jTextFieldBookId = new javax.swing.JTextField();
        jButtonBookUpdate = new javax.swing.JButton();
        jButtonBookDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonBookSearch = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Borrow / Return - - Edit / Delete / Search");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Update /Delete Section"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDate.setEditable(false);
        jTextFieldDate.setText("Automatically filled");
        jTextFieldDate.setToolTipText("");
        jTextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 360, 165, -1));

        jLabelDate.setText("Date Return");
        jPanel2.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 360, 37, 20));
        jPanel2.add(jTextFieldColoumNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 320, 165, -1));

        jLabelColoumNo.setText("Date Borrow");
        jPanel2.add(jLabelColoumNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 320, -1, 20));

        jTextFieldIsbnNo.setToolTipText("");
        jPanel2.add(jTextFieldIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 165, -1));

        jLabelTitle.setText("Book ID");
        jPanel2.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 51, 20));

        jLabelIsbnNo.setText("Member ID");
        jPanel2.add(jLabelIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 80, 51, 20));
        jPanel2.add(jTextFieldEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 160, 165, -1));
        jPanel2.add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 120, 165, -1));

        jLabelEdition.setText("User ID");
        jPanel2.add(jLabelEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 160, 51, 20));

        jTextFieldBookId.setEditable(false);
        jTextFieldBookId.setText("Automatically filled");
        jPanel2.add(jTextFieldBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 165, -1));

        jButtonBookUpdate.setText("Update");
        jButtonBookUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jButtonBookDelete.setText("Delete");
        jButtonBookDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel6.setText("Transaction ID");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, -1, -1));

        jButtonBookSearch.setText("Search");
        jButtonBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 110, 60));

        jButton3.setText("View All Transactions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 110, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 540));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 840, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateActionPerformed

    private void jButtonBookUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookUpdateActionPerformed

    }//GEN-LAST:event_jButtonBookUpdateActionPerformed

    private void jButtonBookDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookDeleteActionPerformed
       
    }//GEN-LAST:event_jButtonBookDeleteActionPerformed

    private void jButtonBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookSearchActionPerformed

    }//GEN-LAST:event_jButtonBookSearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBookDelete;
    private javax.swing.JButton jButtonBookSearch;
    private javax.swing.JButton jButtonBookUpdate;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelColoumNo;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEdition;
    private javax.swing.JLabel jLabelIsbnNo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBookId;
    private javax.swing.JTextField jTextFieldColoumNo;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldEdition;
    private javax.swing.JTextField jTextFieldIsbnNo;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
