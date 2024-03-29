package Session;


import Location.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thivyapranath
 */
public class Add_Session extends javax.swing.JFrame {

    /**
     * Creates new form new11
     */
    public Add_Session() {
        initComponents();
        Connect ();
        LoadRoomName();
        LoadRoomName2();
        //table_update();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    /*
     private void table_update()
    {
        int c;
         try {
            // TODO add your handling code here:

            String building_name = txtBuilding.getText();
            String capacity = txtCapacity.getText();
            String room_name = txtRoomName.getText();
            String room_type = txtRoomType.getSelectedItem().toString();

            pst = con.prepareStatement("select * from location");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("building_name"));
                    v2.add(rs.getString("capacity"));
                    v2.add(rs.getString("room_name"));
                    v2.add(rs.getString("room_type"));
                }
                
                Df.addRow(v2);
            }
            
            
/*
            pst.setString(1, building_name);
            pst.setString(2, capacity);
            pst.setString(3, room_name);
            pst.setString(4, room_type);

            int k = pst.executeUpdate();

            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Recored added");
                txtBuilding.setText("");
                txtCapacity.setText("");
                txtRoomName.setText("");
                txtRoomType.setSelectedItem("");

                txtBuilding.requestFocus();

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Recored added");
            }
*/
    /*
        } catch (SQLException ex) {
            Logger.getLogger(Add_Location.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 */   
    
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetable_management","root","");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Add_Session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Add_Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
        public void LoadRoomName()
    {
        try {
            pst = con.prepareStatement("select session_id from session");
            rs= pst.executeQuery();
            txtSession1.removeAllItems();
            txtSession2.removeAllItems();
            txtRoom.removeAllItems();
            
            while(rs.next())
            {
                txtSession1.addItem(rs.getString(1)); 
                txtSession2.addItem(rs.getString(1)); 
                txtRoom.addItem(rs.getString(1)); 
            }
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Management_Location.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
        
        
     public void LoadRoomName2()
    {
        try {
            pst = con.prepareStatement("select room_name from location");
            rs= pst.executeQuery();
            txtRoom.removeAllItems();
            
            while(rs.next())
            {
                txtRoom.addItem(rs.getString(1)); 
            }
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Management_Location.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRoom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSession2 = new javax.swing.JComboBox<>();
        txtSession1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(57, 191, 179));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Session 1");

        txtRoom.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Select Room");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Session 2");

        jButton1.setBackground(new java.awt.Color(57, 191, 179));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSession2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSession2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtSession2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSession2ActionPerformed(evt);
            }
        });

        txtSession1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSession1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtSession1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSession1ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ff");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("d");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSession2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSession1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton4)
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addGap(27, 27, 27)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSession1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSession2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Location");

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:

            String session_1 = txtSession1.getSelectedItem().toString();
            String session_2 = txtSession2.getSelectedItem().toString();
            String allocated_room = txtRoom.getSelectedItem().toString();

            pst = con.prepareStatement("insert into session_allocation(session_1,session_2,allocated_room)values(?,?,?)");

            pst.setString(1, session_1);
            pst.setString(2, session_2);
            pst.setString(3, allocated_room);

            int k = pst.executeUpdate();

            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Recored added");
                txtSession1.setSelectedItem("");
                txtSession2.setSelectedItem("");
                txtRoom.setSelectedItem("");

                

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Recored added");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Add_Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        new Home_Session().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSession2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSession2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSession2ActionPerformed

    private void txtSession1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSession1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtSession1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String pid = txtSession1.getSelectedItem().toString();
         
        try {
            // TODO add your handling code here:
            
            
            
            pst = con.prepareStatement("select * from session where session_id = ?");
            pst.setString(1, pid);
            rs = pst.executeQuery();
            
           
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Management_Location.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         String pid = txtRoom.getSelectedItem().toString();
         
        try {
            // TODO add your handling code here:
            
            
            
            pst = con.prepareStatement("select * from location where room_name = ?");
            pst.setString(1, pid);
            rs = pst.executeQuery();
            
           
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Management_Location.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String pid = txtSession2.getSelectedItem().toString();
        
                  
        try {
            // TODO add your handling code here:
            
            
            
            pst = con.prepareStatement("select * from session where session_id = ?");
            pst.setString(1, pid);
            rs = pst.executeQuery();
            
           
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Management_Location.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Session().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> txtRoom;
    private javax.swing.JComboBox<String> txtSession1;
    private javax.swing.JComboBox<String> txtSession2;
    // End of variables declaration//GEN-END:variables
}
