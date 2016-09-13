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
public class BorrowReturn extends javax.swing.JInternalFrame {

    /**
     * Creates new form BorrowReturn
     */
    public BorrowReturn() {
        initComponents();
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
        jLabelAuthor = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonBBorrow = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelRMemberid = new javax.swing.JLabel();
        jLabelRName = new javax.swing.JLabel();
        jTextFieldRName = new javax.swing.JTextField();
        jTextFieldRMemberId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldRMemberId1 = new javax.swing.JTextField();
        jLabelRBookId = new javax.swing.JLabel();
        jLabelRTitle = new javax.swing.JLabel();
        jTextFieldRTitle = new javax.swing.JTextField();
        jLabelRIsbm = new javax.swing.JLabel();
        jTextFieldRIsbn = new javax.swing.JTextField();
        jLabelRTransationId = new javax.swing.JLabel();
        jTextFieldRTransationId = new javax.swing.JTextField();
        jButtonRReturn = new javax.swing.JButton();

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
        jTextFieldMemberId.setText("Automatically filled");
        jPanel5.add(jTextFieldMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 165, -1));

        jTextFieldName.setToolTipText("");
        jPanel5.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 165, -1));
        jPanel5.add(jTextFieldNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 120, 165, -1));

        jLabel7.setText("Book ID");
        jLabel7.setToolTipText("");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jTextFieldBookId.setEditable(false);
        jTextFieldBookId.setText("Automatically filled");
        jPanel5.add(jTextFieldBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 165, -1));

        jLabelIsbnNo1.setText("ISBN No");
        jPanel5.add(jLabelIsbnNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 51, 20));

        jTextFieldIsbnNo.setToolTipText("");
        jPanel5.add(jTextFieldIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 165, -1));

        jLabelTitle1.setText("Title");
        jPanel5.add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 51, 20));
        jPanel5.add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 165, -1));

        jLabelAuthor.setText("Transaction ID");
        jPanel5.add(jLabelAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 40, 100, 20));
        jPanel5.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 165, -1));

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

        jTextFieldRName.setToolTipText("");
        jPanel1.add(jTextFieldRName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 165, -1));

        jTextFieldMemberId.setEditable(false);
        jTextFieldRMemberId.setText("Automatically filled");
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 600, 240));

        jTextFieldMemberId.setEditable(false);
        jTextFieldRMemberId1.setText("Automatically filled");
        jPanel1.add(jTextFieldRMemberId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 165, -1));

        jLabelRBookId.setText("Book ID");
        jLabelRBookId.setToolTipText("");
        jPanel1.add(jLabelRBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelRTitle.setText("Title");
        jPanel1.add(jLabelRTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 51, 20));

        jTextFieldRTitle.setToolTipText("");
        jPanel1.add(jTextFieldRTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 165, -1));

        jLabelRIsbm.setText("ISBN No");
        jPanel1.add(jLabelRIsbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 51, 20));

        jTextFieldRIsbn.setToolTipText("");
        jPanel1.add(jTextFieldRIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 165, -1));

        jLabelRTransationId.setText("Transaction ID");
        jPanel1.add(jLabelRTransationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 100, 20));

        jTextFieldRTransationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRTransationIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldRTransationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 70, 80, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBBorrowActionPerformed

    }//GEN-LAST:event_jButtonBBorrowActionPerformed

    private void jTextFieldRTransationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRTransationIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRTransationIdActionPerformed

    private void jButtonRReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBBorrow;
    private javax.swing.JButton jButtonRReturn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelIsbnNo;
    private javax.swing.JLabel jLabelIsbnNo1;
    private javax.swing.JLabel jLabelRBookId;
    private javax.swing.JLabel jLabelRIsbm;
    private javax.swing.JLabel jLabelRMemberid;
    private javax.swing.JLabel jLabelRName;
    private javax.swing.JLabel jLabelRTitle;
    private javax.swing.JLabel jLabelRTransationId;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBookId;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIsbnNo;
    private javax.swing.JTextField jTextFieldMemberId;
    private javax.swing.JTextField jTextFieldNIC;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRIsbn;
    private javax.swing.JTextField jTextFieldRMemberId;
    private javax.swing.JTextField jTextFieldRMemberId1;
    private javax.swing.JTextField jTextFieldRName;
    private javax.swing.JTextField jTextFieldRTitle;
    private javax.swing.JTextField jTextFieldRTransationId;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
