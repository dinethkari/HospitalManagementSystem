/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dineth Kariyawasam
 */
public class ViewPatients extends javax.swing.JFrame {

    /**
     * Creates new form ViewPatients
     */
    public ViewPatients() {
        initComponents();
        setLocationRelativeTo(null);
        try{
            Statement s=Database.getStatement();
            ResultSet rs=s.executeQuery("SELECT WardID FROM warddetails");
            while(rs.next()){
                cmbwardid.addItem(rs.getString("WardID"));
                cmbwardid1.addItem(rs.getString("WardID"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
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
        jLabel13 = new javax.swing.JLabel();
        cmbwardid = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnclear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        cmbwardid1 = new javax.swing.JComboBox<>();
        btnsearch1 = new javax.swing.JButton();
        btnclear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filter Patients");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Ward ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        cmbwardid.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmbwardid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 80, -1));

        btnsearch.setBackground(new java.awt.Color(242, 241, 240));
        btnsearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnsearch.setText("Search by Ward");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 19, 130, 30));

        jTable1.setBorder(null);
        jTable1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor ID", "Assigned Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 630, 160));

        btnclear.setBackground(new java.awt.Color(242, 241, 240));
        btnclear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 19, 90, 30));

        jTable2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Treatments", "Drugs Given"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 630, 160));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Ward ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        cmbwardid1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmbwardid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 263, 80, -1));

        btnsearch1.setBackground(new java.awt.Color(242, 241, 240));
        btnsearch1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnsearch1.setText("Search by Ward");
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, 30));

        btnclear1.setBackground(new java.awt.Color(242, 241, 240));
        btnclear1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnclear1.setText("Clear");
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            Statement s=Database.getStatement();
            ResultSet rs=s.executeQuery("SELECT patientdetails.PatientID,patientdetails.PatientName,doctordetails.DoctorID,doctordetails.DoctorName FROM patientdetails,doctordetails WHERE patientdetails.Admittedward='"+cmbwardid.getSelectedItem()+"' AND patientdetails.AssignedDoctorID=doctordetails.DoctorID");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("PatientID").toString(),rs.getString("PatientName").toString(),rs.getString("DoctorID").toString(),rs.getString("DoctorName").toString()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        
        while(model.getRowCount()>0){
            for(int i=0;i<model.getRowCount();i++){
                model.removeRow(i);
            }
        }
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
            Statement s=Database.getStatement();
            ResultSet rs=s.executeQuery("SELECT patientdetails.PatientID,patientdetails.PatientName,diagnosisreports.Treatments,diagnosisreports.DrugsGiven FROM patientdetails,diagnosisreports WHERE patientdetails.AdmittedWard='"+cmbwardid1.getSelectedItem()+"' AND patientdetails.PatientID=diagnosisreports.PatientID AND patientdetails.AdmittedWard=diagnosisreports.WardID");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("PatientID").toString(),rs.getString("PatientName").toString(),rs.getString("Treatments").toString(),rs.getString("DrugsGiven").toString()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
        
        while(model.getRowCount()>0){
            for(int i=0;i<model.getRowCount();i++){
                model.removeRow(i);
            }
        }
    }//GEN-LAST:event_btnclear1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsearch1;
    private javax.swing.JComboBox<String> cmbwardid;
    private javax.swing.JComboBox<String> cmbwardid1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}