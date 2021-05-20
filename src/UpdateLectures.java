
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yenuka
 */
public class UpdateLectures extends javax.swing.JFrame {

    

    /**
     * Creates new form UpdateLectures
     */
    public UpdateLectures() {
        initComponents();
        Connect();
        LoadLecturerNo();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void LoadLecturerNo()
    {
        try {
            pst = con.prepareStatement("select id from lecturer");
            rs = pst.executeQuery();
            txtlid.removeAllItems();
            while(rs.next())
            {
                txtlid.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        updateLecturerName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lecLevel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lecRank1 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        updateLecturerFaculty = new javax.swing.JTextField();
        updateLecturerCenter = new javax.swing.JTextField();
        updateLecturerBuilding = new javax.swing.JTextField();
        updateLecturerLevel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlid = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        updateLecturerRank = new javax.swing.JComboBox<>();

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 191, 185));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW / EDIT LECTURER DETAILS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Lecturer Name");

        updateLecturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLecturerNameActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Building");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Faculty");

        lecLevel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecLevel1.setText("Level");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Center");

        lecRank1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecRank1.setText("Rank");

        jButton13.setBackground(new java.awt.Color(57, 191, 179));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("UPDATE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(57, 191, 179));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setText("DELETE");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(57, 191, 179));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        updateLecturerFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLecturerFacultyActionPerformed(evt);
            }
        });

        updateLecturerCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLecturerCenterActionPerformed(evt);
            }
        });

        updateLecturerBuilding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLecturerBuildingActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Lecturer ID");

        txtlid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlidActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(57, 191, 179));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(57, 191, 179));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        updateLecturerRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture", "Lab", "Tutorial" }));
        updateLecturerRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLecturerRankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtlid, 0, 100, Short.MAX_VALUE)
                    .addComponent(updateLecturerCenter)
                    .addComponent(updateLecturerFaculty)
                    .addComponent(updateLecturerName))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lecRank1)
                                .addComponent(lecLevel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateLecturerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(updateLecturerBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLecturerRank, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(updateLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(updateLecturerBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLecturerFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecLevel1)
                    .addComponent(updateLecturerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lecRank1)
                    .addComponent(updateLecturerCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLecturerRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
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

    private void updateLecturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLecturerNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_updateLecturerNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String name = updateLecturerName.getText();
            String faculty = updateLecturerFaculty.getText();
            String center = updateLecturerCenter.getText();
            String building = updateLecturerBuilding.getText();
            String level = updateLecturerLevel.getText();
            
            
            pst= con.prepareStatement("insert into lecturer(name,faculty,center,building,level)values(?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, faculty);
            pst.setString(3, center);
            pst.setString(4, building);
            pst.setString(5, level);
            int k = pst.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "New Record Added");
                updateLecturerName.setText("");
                updateLecturerFaculty.setText("");
                updateLecturerCenter.setText("");
                updateLecturerBuilding.setText("");
                updateLecturerLevel.setText("");
                updateLecturerName.requestFocus();
                LoadLecturerNo();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Record failed");
            }
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateLecturerFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLecturerFacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateLecturerFacultyActionPerformed

    private void updateLecturerCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLecturerCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateLecturerCenterActionPerformed

    private void updateLecturerBuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLecturerBuildingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateLecturerBuildingActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String pid = txtlid.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("select * from lecturer where id = ?");
            pst.setString(1, pid);
            rs = pst.executeQuery();
            
            if(rs.next()==true)
            {
                updateLecturerName.setText(rs.getString(2));
                updateLecturerFaculty.setText(rs.getString(3));
                updateLecturerCenter.setText(rs.getString(4));
                updateLecturerBuilding.setText(rs.getString(5));
                updateLecturerLevel.setText(rs.getString(6));       
                        
            }
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        
        
        try {
            String name = updateLecturerName.getText();
            String faculty = updateLecturerFaculty.getText();
            String center = updateLecturerCenter.getText();
            String building = updateLecturerBuilding.getText();
            String level = updateLecturerLevel.getText();
            String pid = txtlid.getSelectedItem().toString();
            
            pst= con.prepareStatement("update lecturer set name=?, faculty=?, center=?, building=?, level=? where id=?");
            pst.setString(1, name);
            pst.setString(2, faculty);
            pst.setString(3, center);
            pst.setString(4, building);
            pst.setString(5, level);
            pst.setString(6, pid);
            int k = pst.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "Record Updated");
                updateLecturerName.setText("");
                updateLecturerFaculty.setText("");
                updateLecturerCenter.setText("");
                updateLecturerBuilding.setText("");
                updateLecturerLevel.setText("");
                updateLecturerName.requestFocus();
                LoadLecturerNo();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Record failed");
            }
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

                updateLecturerName.setText("");
                updateLecturerFaculty.setText("");
                updateLecturerCenter.setText("");
                updateLecturerBuilding.setText("");
                updateLecturerLevel.setText("");
                updateLecturerName.requestFocus();
                LoadLecturerNo();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

      try {
            
            String pid = txtlid.getSelectedItem().toString();
            
            pst= con.prepareStatement("delete from lecturer where id=?");
            pst.setString(1, pid);
            int k = pst.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "Record Deleted");
                updateLecturerName.setText("");
                updateLecturerFaculty.setText("");
                updateLecturerCenter.setText("");
                updateLecturerBuilding.setText("");
                updateLecturerLevel.setText("");
                updateLecturerName.requestFocus();
                LoadLecturerNo();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Record failed");
            }
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(UpdateLectures.class.getName()).log(Level.SEVERE, null, ex);
        }
          


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txtlidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlidActionPerformed

    private void updateLecturerRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLecturerRankActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_updateLecturerRankActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateLectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateLectures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lecLevel1;
    private javax.swing.JLabel lecRank1;
    private javax.swing.JComboBox<String> txtlid;
    private javax.swing.JTextField updateLecturerBuilding;
    private javax.swing.JTextField updateLecturerCenter;
    private javax.swing.JTextField updateLecturerFaculty;
    private javax.swing.JTextField updateLecturerLevel;
    private javax.swing.JTextField updateLecturerName;
    private javax.swing.JComboBox<String> updateLecturerRank;
    // End of variables declaration//GEN-END:variables
}
