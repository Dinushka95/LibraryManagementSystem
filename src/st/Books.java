
package st;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.*;
import static st.DB_Connect.con;
import static st.MainWindow.pst;

/**
 *
 * @author dinus
 */
public class Books extends javax.swing.JInternalFrame {

 public ResultSet rs =null;
 String SearchQuery=null;   
 
    public Books() {
    initComponents();
      
    }
    
    
 
    public void loadTable()
    {
     
        if(jTextFieldSSSIsbnNo.getText().trim().isEmpty()&&jTextFieldSSSAuthor.getText().trim().isEmpty()&&jTextFieldSSSTitle.getText().trim().isEmpty())
        {SearchQuery="SELECT * FROM `book` WHERE `b_bid` ="+jTextFieldSSSBookId.getText();}
        if (jTextFieldSSSBookId.getText().trim().isEmpty()&&jTextFieldSSSAuthor.getText().trim().isEmpty()&&jTextFieldSSSTitle.getText().trim().isEmpty())
        {SearchQuery="SELECT * FROM `book` WHERE `b_isbn` ="+jTextFieldSSSIsbnNo.getText();}
        if (jTextFieldSSSBookId.getText().trim().isEmpty()&&jTextFieldSSSIsbnNo.getText().trim().isEmpty()&&jTextFieldSSSTitle.getText().trim().isEmpty())
        {SearchQuery="SELECT * FROM `book` WHERE `b_author` LIKE '"+jTextFieldSSSAuthor.getText()+"'";}
        if (jTextFieldSSSBookId.getText().trim().isEmpty()&&jTextFieldSSSIsbnNo.getText().trim().isEmpty()&&jTextFieldSSSAuthor.getText().trim().isEmpty())
        {SearchQuery="SELECT * FROM `book` WHERE `b_title` LIKE '"+jTextFieldSSSTitle.getText()+"'";}
    
    try {
            pst =con.prepareStatement(SearchQuery);
            rs=pst.executeQuery();
            if (!rs.isBeforeFirst() ) 
            {    
            JOptionPane.showMessageDialog(null, "No Matching Data Found", "ERROR: " + "Search Not Compatible", JOptionPane.ERROR_MESSAGE);
            }
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            SearchTextBoxClear();
        } 
    catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    ChangeBookTableHeader();
    }
    
    public void ChangeBookTableHeader()
    {       jTable1.getColumnModel().getColumn(0).setHeaderValue("BOOK ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("ISBN No");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Title");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Edition");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Author");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Shelf No");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Row No");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Coloum No");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Date&Time");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Availability");
    }
    

    public void SearchTextBoxClear()
    {
    jTextFieldSSSIsbnNo.setText("");
    jTextFieldSSSAuthor.setText("");
    jTextFieldSSSBookId.setText("");
    jTextFieldSSSTitle.setText("");
    }
    
        public void TextBoxClear()
    {
   
        jTextFieldBookId.setText("");
        jTextFieldIsbnNo.setText("");
        jTextFieldTitle.setText("");
        jTextFieldEdition.setText("");
        jTextFieldAuthor.setText("");
        jTextFieldShelfNo.setText("");
        jTextFieldRowNo.setText("");
        jTextFieldColoumNo.setText("");
        jTextFieldDate.setText("");
    }
    
    public void addTable()
    {
        boolean error=false;
    String x="INSERT INTO `book`(`b_isbn`, `b_title`, `b_author`, `b_edition`, `b_shelf`, `b_row`, `b_coloum`) "
                + "VALUES ("+jTextFieldIsbnNo.getText()+",'"+jTextFieldTitle.getText()+"','"+jTextFieldAuthor.getText()+"','"+jTextFieldEdition.getText()+"',"+jTextFieldShelfNo.getText()+","+jTextFieldRowNo.getText()+","+jTextFieldColoumNo.getText()+")";
        try {
            pst =con.prepareStatement(x);
            pst.execute();
        
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Couldn't add the Record", "" + "Error", JOptionPane.ERROR_MESSAGE);
             error=true;
        }
        
        
    TextBoxClear();
    if(error==false)
     JOptionPane.showMessageDialog(null, "Sucessfull Added ", "" + "", JOptionPane.OK_OPTION);
    jTextFieldBookId.setText("Automatically filled");
    jTextFieldDate.setText("Automatically filled");
    }
    
    public boolean  MutipleSelectError ()
    {
      if((jTextFieldSSSIsbnNo.getText().trim().isEmpty()&&jTextFieldSSSAuthor.getText().trim().isEmpty()&&jTextFieldSSSTitle.getText().trim().isEmpty())
         ||(jTextFieldSSSBookId.getText().trim().isEmpty()&&jTextFieldSSSAuthor.getText().trim().isEmpty()&&jTextFieldSSSTitle.getText().trim().isEmpty())
         ||(jTextFieldSSSBookId.getText().trim().isEmpty()&&jTextFieldSSSIsbnNo.getText().trim().isEmpty()&&jTextFieldSSSTitle.getText().trim().isEmpty())
         ||(jTextFieldSSSBookId.getText().trim().isEmpty()&&jTextFieldSSSIsbnNo.getText().trim().isEmpty()&&jTextFieldSSSAuthor.getText().trim().isEmpty())
         ){
       
       return false;
      }
      JOptionPane.showMessageDialog(null, "Only One  Field Can Be Search At Once", "ERROR: " + "Search Not Compatible", JOptionPane.ERROR_MESSAGE);
      SearchTextBoxClear();
       return true;   
    }
    
    public class MyCellRenderer extends javax.swing.table.DefaultTableCellRenderer {
    @Override
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        final java.awt.Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     { 
         if(jTable1.getModel().getValueAt(row,9).equals(true))
         {
          cellComponent.setForeground(Color.black);
          cellComponent.setBackground(Color.green);  
         }
         else
         {
         cellComponent.setBackground(Color.red);
         cellComponent.setForeground(Color.black);
         }    
     }
        return cellComponent;
     }
    
        }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldRowNo = new javax.swing.JTextField();
        jLabelRowNo = new javax.swing.JLabel();
        jTextFieldColoumNo = new javax.swing.JTextField();
        jLabelColoumNo = new javax.swing.JLabel();
        jTextFieldIsbnNo = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelIsbnNo = new javax.swing.JLabel();
        jTextFieldEdition = new javax.swing.JTextField();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabelEdition = new javax.swing.JLabel();
        jTextFieldShelfNo = new javax.swing.JTextField();
        jLabelShelfNo = new javax.swing.JLabel();
        jTextFieldAuthor = new javax.swing.JTextField();
        jLabelAuthor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelBookId = new javax.swing.JLabel();
        jTextFieldBookId = new javax.swing.JTextField();
        jButtonBookAdd = new javax.swing.JButton();
        jButtonBookUpdate = new javax.swing.JButton();
        jButtonBookDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonBookSearch = new javax.swing.JButton();
        jTextFieldSSSBookId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSSSAuthor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSSSIsbnNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSSSTitle = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Books  Form");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD/ Update /Delete Section"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDate.setEditable(false);
        jTextFieldDate.setText("Automatically filled");
        jTextFieldDate.setToolTipText("");
        jTextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 347, 165, -1));

        jLabelDate.setText("Date");
        jPanel2.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 347, 37, 20));
        jPanel2.add(jTextFieldRowNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 283, 165, -1));

        jLabelRowNo.setText("Row No");
        jLabelRowNo.setToolTipText("");
        jPanel2.add(jLabelRowNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 283, 51, 20));
        jPanel2.add(jTextFieldColoumNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 321, 165, -1));

        jLabelColoumNo.setText("Coloum No");
        jPanel2.add(jLabelColoumNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 321, -1, 20));

        jTextFieldIsbnNo.setToolTipText("");
        jTextFieldIsbnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIsbnNoActionPerformed(evt);
            }
        });
        jTextFieldIsbnNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIsbnNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIsbnNoKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 76, 165, -1));

        jLabelTitle.setText("Title");
        jPanel2.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 114, 51, 20));

        jLabelIsbnNo.setText("ISBN No");
        jPanel2.add(jLabelIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 76, 51, 20));

        jTextFieldEdition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEditionKeyPressed(evt);
            }
        });
        jPanel2.add(jTextFieldEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 165, 165, -1));

        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });
        jTextFieldTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTitleKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTitleKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 114, 165, -1));

        jLabelEdition.setText("Edition");
        jPanel2.add(jLabelEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 165, 51, 20));
        jPanel2.add(jTextFieldShelfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 245, 165, -1));

        jLabelShelfNo.setText("Shelf No");
        jPanel2.add(jLabelShelfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 245, 51, 20));

        jTextFieldAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAuthorKeyPressed(evt);
            }
        });
        jPanel2.add(jTextFieldAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 196, 165, -1));

        jLabelAuthor.setText("Author");
        jPanel2.add(jLabelAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 196, 51, 20));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabelBookId.setText("Book ID");
        jPanel1.add(jLabelBookId);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 38, -1, -1));

        jTextFieldBookId.setEditable(false);
        jTextFieldBookId.setText("Automatically filled");
        jPanel2.add(jTextFieldBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 38, 165, -1));

        jButtonBookAdd.setText("Add");
        jButtonBookAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookAddActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBookAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 570));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Search & Report Section"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBookSearch.setText("Search");
        jButtonBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookSearchActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 110, 60));

        jTextFieldSSSBookId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSSSBookIdKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldSSSBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, -1));

        jLabel1.setText("Book ID");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Author");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextFieldSSSAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSSSAuthorKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldSSSAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, -1));

        jLabel3.setText("ISBN No");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jTextFieldSSSIsbnNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSSSIsbnNoKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldSSSIsbnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 80, -1));

        jLabel4.setText("Title");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jTextFieldSSSTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSSSTitleKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldSSSTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 80, -1));

        jButton3.setText("View All Books");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 110, 60));

        jButton4.setText("Generate Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 120, 60));

        jButton1.setText("All Books Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 130, 60));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 830, 100));

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 840, 320));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 903, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBookAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookAddActionPerformed
 
        addTable();
               
    }//GEN-LAST:event_jButtonBookAddActionPerformed

    private void jButtonBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookSearchActionPerformed
      
      if (MutipleSelectError()==false)
      {
      loadTable();
      jTable1.setDefaultRenderer(Object.class, new MyCellRenderer());
     
      }
    }//GEN-LAST:event_jButtonBookSearchActionPerformed

    
    private void jTextFieldSSSBookIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSSSBookIdKeyPressed

    }//GEN-LAST:event_jTextFieldSSSBookIdKeyPressed

    private void jTextFieldSSSAuthorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSSSAuthorKeyPressed

    }//GEN-LAST:event_jTextFieldSSSAuthorKeyPressed

    private void jTextFieldSSSIsbnNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSSSIsbnNoKeyPressed

    }//GEN-LAST:event_jTextFieldSSSIsbnNoKeyPressed

    private void jTextFieldSSSTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSSSTitleKeyPressed

    }//GEN-LAST:event_jTextFieldSSSTitleKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
        
        int r=jTable1.getSelectedRow();
     
        jTextFieldBookId.setText(jTable1.getValueAt(r, 0).toString());
        jTextFieldIsbnNo.setText(jTable1.getValueAt(r, 1).toString());
        jTextFieldTitle.setText(jTable1.getValueAt(r, 2).toString());
        jTextFieldEdition.setText(jTable1.getValueAt(r, 3).toString());
        jTextFieldAuthor.setText(jTable1.getValueAt(r, 4).toString());
        jTextFieldShelfNo.setText(jTable1.getValueAt(r, 5).toString());
        jTextFieldRowNo.setText(jTable1.getValueAt(r, 6).toString());
        jTextFieldColoumNo.setText(jTable1.getValueAt(r, 7).toString());
        jTextFieldDate.setText(jTable1.getValueAt(r, 8).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonBookUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookUpdateActionPerformed
           
        String r="UPDATE `book`SET`b_isbn`="+jTextFieldIsbnNo.getText()+",`b_title`="+jTextFieldTitle.getText()+
                ",`b_author`="+jTextFieldAuthor.getText()+",`b_edition`="+jTextFieldEdition.getText()+
                ",`b_shelf`="+jTextFieldShelfNo.getText()+",`b_row`="+jTextFieldRowNo.getText()+
                ",`b_coloum`="+jTextFieldColoumNo.getText()+" WHERE `b_bid`="+jTextFieldBookId.getText();
        
        
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

     String z="SELECT * FROM `book` WHERE `b_bid` ="+jTextFieldBookId.getText();
     TextBoxClear();  
     jTextFieldBookId.setText("Automatically filled");
     jTextFieldDate.setText("Automatically filled");
     try {
         pst =con.prepareStatement(z);
         rs=pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         ChangeBookTableHeader();
      } catch (SQLException ex) {
        Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
       }

     }
     } 
    }//GEN-LAST:event_jButtonBookUpdateActionPerformed

    private void jButtonBookDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookDeleteActionPerformed
     String DelB="DELETE FROM `book` WHERE `b_bid`="+jTextFieldBookId.getText();
     
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
     TextBoxClear();
     jTextFieldBookId.setText("Automatically filled");
     jTextFieldDate.setText("Automatically filled");
     String z="SELECT * FROM `book` WHERE `b_bid`="+jTextFieldBookId.getText();
     try {
         pst =con.prepareStatement(z);
         rs=pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         ChangeBookTableHeader();
      } catch (SQLException ex) {
        Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
       }

     }
     } 
     
    }//GEN-LAST:event_jButtonBookDeleteActionPerformed

    private void jTextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String SearchAllQuery="SELECT * FROM `book` ";

        try {
            pst =con.prepareStatement(SearchAllQuery);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            SearchTextBoxClear();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        ChangeBookTableHeader();
        jTable1.setDefaultRenderer(Object.class, new MyCellRenderer());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
           
            String is="C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\reportBookAll.jrxml";
           
            JasperReport jr =JasperCompileManager.compileReport(is);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
           
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            
    if(jTextFieldSSSAuthor.getText().equals("")&&jTextFieldSSSIsbnNo.getText().equals("")&&jTextFieldSSSTitle.getText().equals("")&&jTextFieldSSSBookId.getText().length() >= 1)
    { 
        
            
        try {
           
            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\reportBookAll.jrxml");
            String sql="SELECT\n" +
"     book.`b_bid` AS book_b_bid,\n" +
"     book.`b_isbn` AS book_b_isbn,\n" +
"     book.`b_title` AS book_b_title,\n" +
"     book.`b_shelf` AS book_b_shelf,\n" +
"     book.`b_row` AS book_b_row,\n" +
"     book.`b_coloum` AS book_b_coloum,\n" +
"     book.`b_availability` AS book_b_availability\n" +
"FROM\n" +
"     `book` book\n" +
"WHERE\n" +
"     b_bid = "+jTextFieldSSSBookId.getText();
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);          
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
           // System.out.println("11111111111");
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
        SearchTextBoxClear();
    }//GEN-LAST:event_jButton4ActionPerformed
    else if(jTextFieldSSSBookId.getText().equals("")&&jTextFieldSSSIsbnNo.getText().equals("")&&jTextFieldSSSTitle.getText().equals("")&&jTextFieldSSSAuthor.getText().length() >= 1)
    { 
        
            //System.out.println("0000000000000000");
        try {
            //String report="‪C:/Users/dinus/Documents/NetBeansProjects/ST/src/st/test.jrxml";
            //String path = "C:\\Users\\dinus\\Desktop\\test.jrxml";
           // InputStream is = new FileInputStream(new File(path));
           // InputStream is=this.getClass().getResourceAsStream("C:\\Users\\dinus\\Desktop\\test.jrxml");
            //String is="C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\reportBookAll.jrxml";
           // System.out.println(is);
            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\reportBookAll.jrxml");
            String sql="SELECT\n" +
"     book.`b_bid` AS book_b_bid,\n" +
"     book.`b_isbn` AS book_b_isbn,\n" +
"     book.`b_title` AS book_b_title,\n" +
"     book.`b_shelf` AS book_b_shelf,\n" +
"     book.`b_row` AS book_b_row,\n" +
"     book.`b_coloum` AS book_b_coloum,\n" +
"     book.`b_availability` AS book_b_availability\n" +
"FROM\n" +
"     `book` book\n" +
"WHERE\n" +
"     b_author = "+jTextFieldSSSAuthor.getText();
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);          
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
           // System.out.println("11111111111");
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
        SearchTextBoxClear();
    }
       else if(jTextFieldSSSAuthor.getText().equals("")&&jTextFieldSSSBookId.getText().equals("")&&jTextFieldSSSTitle.getText().equals("")&&jTextFieldSSSIsbnNo.getText().length() >= 1)
    { 
        
            //System.out.println("0000000000000000");
        try {
            
            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\reportBookAll.jrxml");
            String sql="SELECT\n" +
"     book.`b_bid` AS book_b_bid,\n" +
"     book.`b_isbn` AS book_b_isbn,\n" +
"     book.`b_title` AS book_b_title,\n" +
"     book.`b_shelf` AS book_b_shelf,\n" +
"     book.`b_row` AS book_b_row,\n" +
"     book.`b_coloum` AS book_b_coloum,\n" +
"     book.`b_availability` AS book_b_availability\n" +
"FROM\n" +
"     `book` book\n" +
"WHERE\n" +
"     b_isbn = "+jTextFieldSSSIsbnNo.getText();
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);          
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
          
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
        SearchTextBoxClear();
    }
       else if(jTextFieldSSSAuthor.getText().equals("")&&jTextFieldSSSIsbnNo.getText().equals("")&&jTextFieldSSSBookId.getText().equals("")&&jTextFieldSSSTitle.getText().length() >= 1)
    { 
        
           
        try {
            
            JasperDesign jd=JRXmlLoader.load("C:\\Users\\dinus\\Documents\\NetBeansProjects\\ST\\src\\st\\reportBookAll.jrxml");
            String sql="SELECT\n" +
"     book.`b_bid` AS book_b_bid,\n" +
"     book.`b_isbn` AS book_b_isbn,\n" +
"     book.`b_title` AS book_b_title,\n" +
"     book.`b_shelf` AS book_b_shelf,\n" +
"     book.`b_row` AS book_b_row,\n" +
"     book.`b_coloum` AS book_b_coloum,\n" +
"     book.`b_availability` AS book_b_availability\n" +
"FROM\n" +
"     `book` book\n" +
"WHERE\n" +
"     b_title = "+"'"+jTextFieldSSSTitle.getText()+"'";
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);          
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(jp);
           // System.out.println("11111111111");
        }
        catch(Exception e)
        {System.out.println("222222222222222222"+e);}
        SearchTextBoxClear();
    }
    else 
    {
    JOptionPane.showMessageDialog(null, "Null Input OR Multiple fields Inputed", "ERROR: " + "Report Not Compatible", JOptionPane.ERROR_MESSAGE);
    
    }
    
    
    }
    private void jTextFieldIsbnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIsbnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIsbnNoActionPerformed

    private void jTextFieldIsbnNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIsbnNoKeyTyped

    }//GEN-LAST:event_jTextFieldIsbnNoKeyTyped

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void jTextFieldTitleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTitleKeyTyped

    }//GEN-LAST:event_jTextFieldTitleKeyTyped

    private void jTextFieldEditionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEditionKeyPressed
             
    }//GEN-LAST:event_jTextFieldEditionKeyPressed

    private void jTextFieldTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTitleKeyPressed
        if(jTextFieldTitle.getText().length()>49)
      {
          JOptionPane.showMessageDialog(null, "characters count should be less than 50", "ERROR: " + "", JOptionPane.ERROR_MESSAGE);
          jTextFieldTitle.setText("");
         
      }
    }//GEN-LAST:event_jTextFieldTitleKeyPressed

    private void jTextFieldIsbnNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIsbnNoKeyPressed
      if(jTextFieldIsbnNo.getText().length()>9)
      {
          JOptionPane.showMessageDialog(null, "characters count should be less than 11", "ERROR: " + "", JOptionPane.ERROR_MESSAGE);
          jTextFieldIsbnNo.setText("");
         
      }
    }//GEN-LAST:event_jTextFieldIsbnNoKeyPressed

    private void jTextFieldAuthorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAuthorKeyPressed
        if(jTextFieldAuthor.getText().length()>29)
      {
          JOptionPane.showMessageDialog(null, "characters count should be less than 30", "ERROR: " + "", JOptionPane.ERROR_MESSAGE);
          jTextFieldAuthor.setText("");
         
      }
    }//GEN-LAST:event_jTextFieldAuthorKeyPressed
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBookAdd;
    private javax.swing.JButton jButtonBookDelete;
    private javax.swing.JButton jButtonBookSearch;
    private javax.swing.JButton jButtonBookUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelBookId;
    private javax.swing.JLabel jLabelColoumNo;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEdition;
    private javax.swing.JLabel jLabelIsbnNo;
    private javax.swing.JLabel jLabelRowNo;
    private javax.swing.JLabel jLabelShelfNo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAuthor;
    private javax.swing.JTextField jTextFieldBookId;
    private javax.swing.JTextField jTextFieldColoumNo;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldEdition;
    private javax.swing.JTextField jTextFieldIsbnNo;
    private javax.swing.JTextField jTextFieldRowNo;
    private javax.swing.JTextField jTextFieldSSSAuthor;
    private javax.swing.JTextField jTextFieldSSSBookId;
    private javax.swing.JTextField jTextFieldSSSIsbnNo;
    private javax.swing.JTextField jTextFieldSSSTitle;
    private javax.swing.JTextField jTextFieldShelfNo;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
