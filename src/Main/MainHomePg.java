/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Location.Home_Location;
import Session.Home_Session;

/**
 *
 * @author shero
 */
public class MainHomePg extends javax.swing.JFrame {

    /**
     * Creates new form MianHomePg
     */
    public MainHomePg() {
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
        jPanel2 = new javax.swing.JPanel();
        btnstgrpmain = new javax.swing.JButton();
        btnsubtagpmain = new javax.swing.JButton();
        btnlecmain = new javax.swing.JButton();
        btnsubmain = new javax.swing.JButton();
        btnworkdayhrmain = new javax.swing.JButton();
        btnlocamain = new javax.swing.JButton();
        btnsessionalocatemain = new javax.swing.JButton();
        btnroomsessionmain = new javax.swing.JButton();
        btnviewstatmain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(57, 191, 179));

        btnstgrpmain.setBackground(new java.awt.Color(0, 153, 153));
        btnstgrpmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnstgrpmain.setText("STUDENT GROUPS MANAGEMENT");
        btnstgrpmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstgrpmainActionPerformed(evt);
            }
        });

        btnsubtagpmain.setBackground(new java.awt.Color(0, 153, 153));
        btnsubtagpmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsubtagpmain.setText("SUBJECT TAG MANAGEMENT");
        btnsubtagpmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubtagpmainActionPerformed(evt);
            }
        });

        btnlecmain.setBackground(new java.awt.Color(0, 153, 153));
        btnlecmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlecmain.setText("LECTURERS DETAILS MANAGEMENT");
        btnlecmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlecmainActionPerformed(evt);
            }
        });

        btnsubmain.setBackground(new java.awt.Color(0, 153, 153));
        btnsubmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsubmain.setText("SUBJECTS DETAILS MANAGEMENT");
        btnsubmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmainActionPerformed(evt);
            }
        });

        btnworkdayhrmain.setBackground(new java.awt.Color(0, 153, 153));
        btnworkdayhrmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnworkdayhrmain.setText("WORKING DAYS & HOURS MANAGEMENT");
        btnworkdayhrmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnworkdayhrmainActionPerformed(evt);
            }
        });

        btnlocamain.setBackground(new java.awt.Color(0, 153, 153));
        btnlocamain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlocamain.setText("LOCATION MANAGEMENT");
        btnlocamain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocamainActionPerformed(evt);
            }
        });

        btnsessionalocatemain.setBackground(new java.awt.Color(0, 153, 153));
        btnsessionalocatemain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsessionalocatemain.setText("SESSION ALLOCATION MANAGEMENT");
        btnsessionalocatemain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsessionalocatemainActionPerformed(evt);
            }
        });

        btnroomsessionmain.setBackground(new java.awt.Color(0, 153, 153));
        btnroomsessionmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnroomsessionmain.setText(" ROOMS AND SESSION MANAGEMENT");
        btnroomsessionmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnroomsessionmainActionPerformed(evt);
            }
        });

        btnviewstatmain.setBackground(new java.awt.Color(0, 153, 153));
        btnviewstatmain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnviewstatmain.setText("VIEW STATISTICS");
        btnviewstatmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewstatmainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnviewstatmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnroomsessionmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsessionalocatemain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlocamain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnworkdayhrmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlecmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubtagpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstgrpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(btnstgrpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsubtagpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlecmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsubmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnworkdayhrmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlocamain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsessionalocatemain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnroomsessionmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnviewstatmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 31)); // NOI18N
        jLabel1.setText("TIMETABLE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnstgrpmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstgrpmainActionPerformed
         
        new StudentGroups.StugrpMain().setVisible(true);
        this.setVisible(false);
                                             
    }//GEN-LAST:event_btnstgrpmainActionPerformed

    private void btnsubtagpmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubtagpmainActionPerformed
        
        new tags.TagMain().setVisible(true);
        this.setVisible(false);
                                     
    }//GEN-LAST:event_btnsubtagpmainActionPerformed

    private void btnlecmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlecmainActionPerformed
        // TODO add your handling code here:
        new Lecture.UpdateLectures().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnlecmainActionPerformed

    private void btnsubmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmainActionPerformed
        // TODO add your handling code here:
        new Student.UpdateSubject().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsubmainActionPerformed

    private void btnworkdayhrmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnworkdayhrmainActionPerformed
        // TODO add your handling code here:
        new WorkdayAndHour.WorkingDaysAndHours().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnworkdayhrmainActionPerformed

    private void btnlocamainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocamainActionPerformed
        // TODO add your handling code here:
        new Home_Location().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnlocamainActionPerformed

    private void btnsessionalocatemainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsessionalocatemainActionPerformed
        // TODO add your handling code here:
        new Main_Session.SessionMainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsessionalocatemainActionPerformed

    private void btnroomsessionmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnroomsessionmainActionPerformed
        // TODO add your handling code here:
        new Room_Session.Home_Session().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnroomsessionmainActionPerformed

    private void btnviewstatmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewstatmainActionPerformed
        // TODO add your handling code here:
        new Statistics.Statistics().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnviewstatmainActionPerformed

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
            java.util.logging.Logger.getLogger(MainHomePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHomePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHomePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHomePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHomePg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlecmain;
    private javax.swing.JButton btnlocamain;
    private javax.swing.JButton btnroomsessionmain;
    private javax.swing.JButton btnsessionalocatemain;
    private javax.swing.JButton btnstgrpmain;
    private javax.swing.JButton btnsubmain;
    private javax.swing.JButton btnsubtagpmain;
    private javax.swing.JButton btnviewstatmain;
    private javax.swing.JButton btnworkdayhrmain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
