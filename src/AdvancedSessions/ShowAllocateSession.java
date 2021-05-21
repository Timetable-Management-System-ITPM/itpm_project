/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedSessions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shero
 */
public class ShowAllocateSession extends javax.swing.JFrame {

    /**
     * Creates new form ViewConsecutiveSession
     */
    Connection con;
     
    public ShowAllocateSession() {
        initComponents();
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
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtable_consecutive1 = new javax.swing.JTable();
        btnsavecon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtable_parallel1 = new javax.swing.JTable();
        btnsavepar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtable_nonoverlap1 = new javax.swing.JTable();
        btnsavenon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnbacksessionadd = new javax.swing.JButton();
        btnmenusession = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 191, 179));

        jtable_consecutive1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecture 1", "Lecture 2", "Subject Code", "Subject Name", "Group ID", "Tag", "No of Students", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jtable_consecutive1);

        btnsavecon.setBackground(new java.awt.Color(0, 153, 153));
        btnsavecon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsavecon.setText("SAVE SESSION");
        btnsavecon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btnsavecon, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnsavecon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Consecutive", jPanel2);

        jtable_parallel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecture 1", "Lecture 2", "Subject Code", "Subject Name", "Group ID", "Tag", "No of Students", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jtable_parallel1);

        btnsavepar.setBackground(new java.awt.Color(0, 153, 153));
        btnsavepar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsavepar.setText("SAVE SESSION");
        btnsavepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(btnsavepar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsavepar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Parallel", jPanel3);

        jtable_nonoverlap1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecture 1", "Lecture 2", "Subject Code", "Subject Name", "Group ID", "Tag", "No of Students", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jtable_nonoverlap1);

        btnsavenon.setBackground(new java.awt.Color(0, 153, 153));
        btnsavenon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsavenon.setText("SAVE SESSION");
        btnsavenon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavenonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnsavenon, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnsavenon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jScrollPane4.setViewportView(jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Non-Overlapping", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SESSION ALLOCATIONS");

        btnbacksessionadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbacksessionadd.setText("BACK");
        btnbacksessionadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacksessionaddActionPerformed(evt);
            }
        });

        btnmenusession.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmenusession.setText("MENU");
        btnmenusession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenusessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbacksessionadd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmenusession, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbacksessionadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnmenusession, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4)
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

    private void btnsaveconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveconActionPerformed
        // TODO add your handling code here:
       
        DefaultTableModel tblmodel = (DefaultTableModel) jtable_consecutive1.getModel();
        
        if(tblmodel.getRowCount()==0){
        
                //if table is empty then show message
                JOptionPane.showMessageDialog(this, "This is empty");
        } else{
                     
                     //if table is not empty then perform insertion 
                     //open and get db connection mysql
                     
                    String sid, lect1, lect2, subCode, subName, gID, tName, nOStudents, dura;
                     try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagement", "root", "");
                        
                        for(int i=0;i<tblmodel.getRowCount();i++){
                     
                            sid = tblmodel.getValueAt(i, 0).toString();
                            lect1 = tblmodel.getValueAt(i, 1).toString();
                            lect2 = tblmodel.getValueAt(i, 2).toString();                     
                            subCode = tblmodel.getValueAt(i, 3).toString();                    
                            subName = tblmodel.getValueAt(i, 4).toString();                    
                            gID = tblmodel.getValueAt(i, 5).toString();                     
                            tName = tblmodel.getValueAt(i, 6).toString();                    
                            nOStudents = tblmodel.getValueAt(i, 7).toString();                     
                            dura = tblmodel.getValueAt(i, 8).toString();
                                     
                     
                     //new insert query string
                     String query = "insert into consecutive_session(session_id, lecture1, lecture2, subcode, subname, groupid, tagname, no_of_student, duration)values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                     
                     //in above query subject is table name
                     //preparedStatement insertion
                    PreparedStatement  pst = con.prepareStatement(query);
                      
                      pst.setString(1,sid);
                      pst.setString(2,lect1);
                      pst.setString(3,lect2);
                      pst.setString(4,subCode);
                      pst.setString(5,subName);
                      pst.setString(6,gID); 
                      pst.setString(7,tName);
                      pst.setString(8,nOStudents);
                      pst.setString(9,dura);
                     
                     pst.execute();
                  
                   }

                     JOptionPane.showMessageDialog(this, "Data inserted successfully in C_Session DB");
                     
                    //success message
                     //clear jtable
                     tblmodel.setRowCount(0);
                     
                     } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        
    
    }//GEN-LAST:event_btnsaveconActionPerformed
    }
    private void btnsaveparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveparActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblmodel = (DefaultTableModel) jtable_parallel1.getModel();
        
        if(tblmodel.getRowCount()==0){
        
                //if table is empty then show message
                JOptionPane.showMessageDialog(this, "This is empty");
        } else{
                     
                     //if table is not empty then perform insertion 
                     //open and get db connection mysql
                     
                    String sid, lect1, lect2, subCode, subName, gID, tName, nOStudents, dura;
                     try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagement", "root", "");
                        
                        for(int i=0;i<tblmodel.getRowCount();i++){
                     
                            sid = tblmodel.getValueAt(i, 0).toString();
                            lect1 = tblmodel.getValueAt(i, 1).toString();
                            lect2 = tblmodel.getValueAt(i, 2).toString();                     
                            subCode = tblmodel.getValueAt(i, 3).toString();                    
                            subName = tblmodel.getValueAt(i, 4).toString();                    
                            gID = tblmodel.getValueAt(i, 5).toString();                     
                            tName = tblmodel.getValueAt(i, 6).toString();                    
                            nOStudents = tblmodel.getValueAt(i, 7).toString();                     
                            dura = tblmodel.getValueAt(i, 8).toString();
                                     
                     
                     //new insert query string
                     String query = "insert into parallel_session(session_id, lecture1, lecture2, subcode, subname, groupid, tagname, no_of_student, duration)values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                     
                     //in above query subject is table name
                     //preparedStatement insertion
                    PreparedStatement  pst = con.prepareStatement(query);
                      
                      pst.setString(1,sid);
                      pst.setString(2,lect1);
                      pst.setString(3,lect2);
                      pst.setString(4,subCode);
                      pst.setString(5,subName);
                      pst.setString(6,gID); 
                      pst.setString(7,tName);
                      pst.setString(8,nOStudents);
                      pst.setString(9,dura);
                     
                     pst.execute();
                  
                   }

                     JOptionPane.showMessageDialog(this, "Data inserted successfully in P_Session DB");
                     
                    //success message
                     //clear jtable
                     tblmodel.setRowCount(0);
                     
                     } catch (ClassNotFoundException ex) { 
                java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_btnsaveparActionPerformed

    private void btnsavenonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavenonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblmodel = (DefaultTableModel) jtable_nonoverlap1.getModel();
        
        if(tblmodel.getRowCount()==0){
        
                //if table is empty then show message
                JOptionPane.showMessageDialog(this, "This is empty");
        } else{
                     
                     //if table is not empty then perform insertion 
                     //open and get db connection mysql
                     
                    String sid, lect1, lect2, subCode, subName, gID, tName, nOStudents, dura;
                     try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagement", "root", "");
                        
                        for(int i=0;i<tblmodel.getRowCount();i++){
                     
                            sid = tblmodel.getValueAt(i, 0).toString();
                            lect1 = tblmodel.getValueAt(i, 1).toString();
                            lect2 = tblmodel.getValueAt(i, 2).toString();                     
                            subCode = tblmodel.getValueAt(i, 3).toString();                    
                            subName = tblmodel.getValueAt(i, 4).toString();                    
                            gID = tblmodel.getValueAt(i, 5).toString();                     
                            tName = tblmodel.getValueAt(i, 6).toString();                    
                            nOStudents = tblmodel.getValueAt(i, 7).toString();                     
                            dura = tblmodel.getValueAt(i, 8).toString();
                                     
                     
                     //new insert query string
                     String query = "insert into nonavailable_session(session_id, lecture1, lecture2, subcode, subname, groupid, tagname, no_of_student, duration)values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                     
                     //in above query subject is table name
                     //preparedStatement insertion
                    PreparedStatement  pst = con.prepareStatement(query);
                      
                      pst.setString(1,sid);
                      pst.setString(2,lect1);
                      pst.setString(3,lect2);
                      pst.setString(4,subCode);
                      pst.setString(5,subName);
                      pst.setString(6,gID); 
                      pst.setString(7,tName);
                      pst.setString(8,nOStudents);
                      pst.setString(9,dura);
                     
                     pst.execute();
                  
                   }

                     JOptionPane.showMessageDialog(this, "Data inserted successfully in N_Session DB");
                     
                    //success message
                     //clear jtable
                     tblmodel.setRowCount(0);
                     
                     } catch (ClassNotFoundException ex) { 
                java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_btnsavenonActionPerformed

    private void btnbacksessionaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacksessionaddActionPerformed
        // TODO add your handling code here:
        new AdvancedSessions.AddAllocateSession().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbacksessionaddActionPerformed

    private void btnmenusessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenusessionActionPerformed
        // TODO add your handling code here:
        new Main_Session.SessionMainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnmenusessionActionPerformed

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
            java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllocateSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ShowAllocateSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbacksessionadd;
    private javax.swing.JButton btnmenusession;
    private javax.swing.JButton btnsavecon;
    private javax.swing.JButton btnsavenon;
    private javax.swing.JButton btnsavepar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane4;
    public javax.swing.JTable jtable_consecutive1;
    public javax.swing.JTable jtable_nonoverlap1;
    public javax.swing.JTable jtable_parallel1;
    // End of variables declaration//GEN-END:variables

}