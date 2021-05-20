package Main_Session;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yenuka
 */
public class manage_session extends javax.swing.JFrame {

    /**
     * Creates new form manage_session
     */
    public manage_session() {
        initComponents();
        Connect();
        LoadSession();
        
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(manage_session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(manage_session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void LoadSession()
    {
        int c;
        try {
            pst = con.prepareStatement("select * from session");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++)
                {
                    v2.add(rs.getString("session_id"));
                    v2.add(rs.getString("lecture1"));
                    v2.add(rs.getString("lecture2"));
                    v2.add(rs.getString("subcode"));
                    v2.add(rs.getString("subname"));
                    v2.add(rs.getString("groupid"));
                    v2.add(rs.getString("tagname"));
                }
                
                d.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(manage_session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(String str){
        
        d = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(d);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ManageTag = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ManageGroup = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ManageSubjectName = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ManageSubjectCode = new javax.swing.JComboBox<>();
        ManageNoOfStudent = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ManageDuration = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ManageLecture2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jText_Search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ManageLecture1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 191, 185));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE SESSION");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Select Lecturer 2  ");

        jLabel4.setText("Select Tag");

        ManageTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTagActionPerformed(evt);
            }
        });

        jLabel6.setText("Select Group");

        ManageGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGroupActionPerformed(evt);
            }
        });

        jLabel7.setText("Select Subject Name");

        ManageSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSubjectNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Select Subject Code");

        jLabel9.setText("No of Students");

        ManageSubjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSubjectCodeActionPerformed(evt);
            }
        });

        ManageNoOfStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNoOfStudentActionPerformed(evt);
            }
        });

        jLabel10.setText("Duration (Hrs)");

        ManageDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDurationActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer 1", "Lecturer 2", "Subject Code", "Subject Name", "Group ID", "Tag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ManageLecture2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageLecture2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("VIEW ALL DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jText_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_SearchKeyReleased(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("ADD SESSION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("REFRESH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Details : ");

        jLabel5.setText("Select Lecturer 1 ");

        ManageLecture1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageLecture1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ManageGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(330, 330, 330)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ManageSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ManageLecture1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(33, 33, 33)
                                        .addComponent(ManageSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ManageLecture2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(ManageTag, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(83, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(65, 65, 65)
                                .addComponent(jButton3)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(247, 247, 247)
                                            .addComponent(ManageDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(437, 437, 437)
                                            .addComponent(jLabel9)
                                            .addGap(25, 25, 25)
                                            .addComponent(ManageNoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton4)
                        .addGap(79, 79, 79)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageLecture2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageLecture1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageTag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ManageSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ManageSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageNoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ManageDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addGap(285, 285, 285)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTagActionPerformed

        

        // TODO add your handling code here:
    }//GEN-LAST:event_ManageTagActionPerformed

    private void ManageSubjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSubjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageSubjectCodeActionPerformed

    private void ManageNoOfStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNoOfStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageNoOfStudentActionPerformed

    private void ManageDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageDurationActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        d = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        String session_id = d.getValueAt(selectIndex, 0).toString();
        ManageLecture1.setSelectedItem(d.getValueAt(selectIndex, 1).toString());
        ManageLecture2.setSelectedItem(d.getValueAt(selectIndex, 2).toString());
        ManageSubjectCode.setSelectedItem(d.getValueAt(selectIndex, 3).toString());
        ManageSubjectName.setSelectedItem(d.getValueAt(selectIndex, 4).toString());
        ManageGroup.setSelectedItem(d.getValueAt(selectIndex, 5).toString());
        ManageTag.setSelectedItem(d.getValueAt(selectIndex, 6).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void ManageLecture2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageLecture2ActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageLecture2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select groupid from student_group");

            while(rs.next()){
                String groupid = rs.getString("groupid");
                ManageGroup.addItem(groupid);
            }
        }catch(Exception e){

        }
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select name from subject");

            while(rs.next()){
                String name = rs.getString("name");
                ManageSubjectName.addItem(name);
            }
        }catch(Exception e){

        }
        
          try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select code from subject");

            while(rs.next()){
                String code = rs.getString("code");
                ManageSubjectCode.addItem(code);
            }
        }catch(Exception e){

        }

          try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select name from lecturer");

            while(rs.next()){
                String name = rs.getString("name");
                ManageLecture1.addItem(name);
            }
        }catch(Exception e){

        }
          try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select name from lecturer");

            while(rs.next()){
                String name = rs.getString("name");
                ManageLecture2.addItem(name);
            }
        }catch(Exception e){

        }
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select relatedtag from subject_tags");

            while(rs.next()){
                String relatedtag = rs.getString("relatedtag");
                ManageTag.addItem(relatedtag);
            }
        }catch(Exception e){

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
        try {
            
             d = (DefaultTableModel)jTable1.getModel();
             int selectIndex = jTable1.getSelectedRow();
        
            String session_id = d.getValueAt(selectIndex, 0).toString();
        
            String lecture1 = ManageLecture1.getSelectedItem().toString();
            String lecture2 = ManageLecture2.getSelectedItem().toString();
            String subcode = ManageSubjectCode.getSelectedItem().toString();
            String subname = ManageSubjectName.getSelectedItem().toString();
            String groupid = ManageGroup.getSelectedItem().toString();
            String tagname = ManageTag.getSelectedItem().toString();
            
            pst= con.prepareStatement("update session set lecture1=?, lecture2=?, subcode=?, subname=?, groupid=?, tagname=? where session_id=?");
            pst.setString(1, lecture1);
            pst.setString(2, lecture2);
            pst.setString(3, subcode);
            pst.setString(4, subname);
            pst.setString(5, groupid);
            pst.setString(6, tagname);
            pst.setString(7, session_id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated");
            
            ManageLecture1.setSelectedIndex(-1);
            ManageLecture2.setSelectedIndex(-1);
            ManageSubjectCode.setSelectedIndex(-1);
            ManageSubjectName.setSelectedIndex(-1);
            ManageGroup.setSelectedIndex(-1);
            ManageGroup.setSelectedIndex(-1);
            ManageLecture1.requestFocus();
            LoadSession();
                
            
        } catch (SQLException ex) {
            Logger.getLogger(manage_session.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            
             d = (DefaultTableModel)jTable1.getModel();
             int selectIndex = jTable1.getSelectedRow();
        
            String session_id = d.getValueAt(selectIndex, 0).toString();
        
            
            pst= con.prepareStatement("delete from session where session_id=?");
       
            pst.setString(1, session_id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            
            ManageLecture1.setSelectedIndex(-1);
            ManageLecture2.setSelectedIndex(-1);
            ManageSubjectCode.setSelectedIndex(-1);
            ManageSubjectName.setSelectedIndex(-1);
            ManageGroup.setSelectedIndex(-1);
            ManageGroup.setSelectedIndex(-1);
            ManageLecture1.requestFocus();
            LoadSession();
                
            
        } catch (SQLException ex) {
            Logger.getLogger(manage_session.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jText_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_SearchKeyReleased

        String searchString = jText_Search.getText();
        search(searchString);

        // TODO add your handling code here:
    }//GEN-LAST:event_jText_SearchKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        select_lecturer sellec = new select_lecturer();
        sellec.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        manage_session magse = new manage_session();
        magse.show();
        
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ManageGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageGroupActionPerformed

    private void ManageSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSubjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageSubjectNameActionPerformed

    private void ManageLecture1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageLecture1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageLecture1ActionPerformed

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
            java.util.logging.Logger.getLogger(manage_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_session().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ManageDuration;
    private javax.swing.JComboBox<String> ManageGroup;
    private javax.swing.JComboBox<String> ManageLecture1;
    private javax.swing.JComboBox<String> ManageLecture2;
    private javax.swing.JTextField ManageNoOfStudent;
    private javax.swing.JComboBox<String> ManageSubjectCode;
    private javax.swing.JComboBox<String> ManageSubjectName;
    private javax.swing.JComboBox<String> ManageTag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText_Search;
    // End of variables declaration//GEN-END:variables
}