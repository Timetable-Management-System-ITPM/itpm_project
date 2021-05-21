/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentGroups;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shero
 */
public class AddStudentGroup extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudentGroup
     */
    public AddStudentGroup() {
        initComponents();
        txtgid.setEditable(false);
        txtsgid.setEditable(false);
    }
        private void Clear(){
         txtcmbyrseme.setSelectedIndex(0);
         txtcmbprog.setSelectedIndex(0);
         jSpinnergno.setValue(0);
         jSpinnersubgno.setValue(0);
         txtgid.setText("");
         txtsgid.setText("");      
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnaddstugrp = new javax.swing.JButton();
        btnclearstugrp = new javax.swing.JButton();
        btngenid = new javax.swing.JButton();
        txtsgid = new javax.swing.JTextField();
        jSpinnergno = new javax.swing.JSpinner();
        jSpinnersubgno = new javax.swing.JSpinner();
        txtcmbyrseme = new javax.swing.JComboBox<>();
        txtcmbprog = new javax.swing.JComboBox<>();
        txtgid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnmenusg1 = new javax.swing.JButton();
        btnmenusg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 191, 179));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 528));

        jPanel2.setPreferredSize(new java.awt.Dimension(760, 461));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Academic Year Semester");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Group Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Group ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Sub Group ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Programme");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Sub Group Number");

        btnaddstugrp.setBackground(new java.awt.Color(0, 153, 153));
        btnaddstugrp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnaddstugrp.setText("ADD");
        btnaddstugrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstugrpActionPerformed(evt);
            }
        });

        btnclearstugrp.setBackground(new java.awt.Color(0, 153, 153));
        btnclearstugrp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnclearstugrp.setText("CLEAR");
        btnclearstugrp.setPreferredSize(new java.awt.Dimension(71, 23));
        btnclearstugrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearstugrpActionPerformed(evt);
            }
        });

        btngenid.setBackground(new java.awt.Color(0, 153, 153));
        btngenid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btngenid.setText("GENERATE ID");
        btngenid.setMaximumSize(new java.awt.Dimension(77, 23));
        btngenid.setMinimumSize(new java.awt.Dimension(77, 23));
        btngenid.setPreferredSize(new java.awt.Dimension(71, 23));
        btngenid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenidActionPerformed(evt);
            }
        });

        txtsgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsgidActionPerformed(evt);
            }
        });

        txtcmbyrseme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y1S1", "Y1S2", "Y2S1", "Y2S2", "Y3S1", "Y3S2", "Y4S1", "Y4S2" }));
        txtcmbyrseme.setMinimumSize(new java.awt.Dimension(63, 20));
        txtcmbyrseme.setPreferredSize(new java.awt.Dimension(763, 20));

        txtcmbprog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "CSE", "IM", "CSNE", "ISE", "DS", "SE", " " }));
        txtcmbprog.setMinimumSize(new java.awt.Dimension(63, 20));
        txtcmbprog.setPreferredSize(new java.awt.Dimension(763, 20));

        txtgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtsgid, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btngenid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnaddstugrp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnclearstugrp, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtcmbyrseme, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(jLabel6)
                                            .addGap(14, 14, 14))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jSpinnergno, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jSpinnersubgno, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcmbprog, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtgid, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcmbyrseme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtcmbprog, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnergno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnersubgno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtgid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btngenid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnaddstugrp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsgid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btnclearstugrp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADD STUDENT GROUPS");

        btnmenusg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmenusg1.setText("BACK");
        btnmenusg1.setToolTipText("");
        btnmenusg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenusg1ActionPerformed(evt);
            }
        });

        btnmenusg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmenusg2.setText("HOME");
        btnmenusg2.setToolTipText("");
        btnmenusg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenusg2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnmenusg1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmenusg2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnmenusg1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmenusg2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsgidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsgidActionPerformed

    private void txtgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgidActionPerformed

    private void btngenidActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String yearseme = txtcmbyrseme.getSelectedItem().toString();
        String programme = txtcmbprog.getSelectedItem().toString();
        String groupno = jSpinnergno.getValue().toString();
        String subgrpno = jSpinnersubgno.getValue().toString();
        String val = jSpinnergno.getValue().toString();
        String val1 = jSpinnersubgno.getValue().toString();
        String GroupID = yearseme+"."+programme+"."+val;
        txtgid.setText(String.valueOf(GroupID));
        
        String SubGroupID = GroupID+"."+val1;
        txtsgid.setText(String.valueOf(SubGroupID));
                                            
    }                                        

    private void btnmenusg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenusg1ActionPerformed
        // TODO add your handling code here:
        new StugrpMain().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnmenusg1ActionPerformed

    private void btnmenusg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenusg2ActionPerformed
        // TODO add your handling code here:
        new Main.MainHomePg().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnmenusg2ActionPerformed

    private void btnaddstugrpActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String yearseme = txtcmbyrseme.getSelectedItem().toString();
        String programme = txtcmbprog.getSelectedItem().toString();
        String groupno = jSpinnergno.getValue().toString();
        String subgrpno = jSpinnersubgno.getValue().toString();
        String val = txtgid.getText();
        String val1 = txtsgid.getText();
        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
           java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagement","root","");
           
            PreparedStatement insert;
            insert = con1.prepareStatement("insert into student_group (yearseme,programme,groupno,subgrpno,groupid,subgrpid)values(?,?,?,?,?,?)");
            insert.setString(1, yearseme);
            insert.setString(2, programme);
            insert.setString(3, groupno);
            insert.setString(4, subgrpno);
            insert.setString(5, val);
            insert.setString(6, val1);
            int Ra = insert.executeUpdate();
            
            if(yearseme.isEmpty() || programme.isEmpty() || groupno.isEmpty() || subgrpno.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"please fill all the details!!!");
            }
          else  {
           
            JOptionPane.showMessageDialog(this,"Record Added");
            
            
            }
            
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudentGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
          catch (SQLException ex) {
            Logger.getLogger(AddStudentGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                                            
        
        
                                            

    }                                            

    private void btnclearstugrpActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
       Clear();
        
                                            
    }                                              

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddstugrp;
    private javax.swing.JButton btnclearstugrp;
    private javax.swing.JButton btngenid;
    private javax.swing.JButton btnmenusg1;
    private javax.swing.JButton btnmenusg2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinnergno;
    private javax.swing.JSpinner jSpinnersubgno;
    private javax.swing.JComboBox<String> txtcmbprog;
    private javax.swing.JComboBox<String> txtcmbyrseme;
    private javax.swing.JTextField txtgid;
    private javax.swing.JTextField txtsgid;
    // End of variables declaration//GEN-END:variables
}
