/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dineth Kariyawasam
 */
public class DiagnosisReport extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosisReport
     */
    public DiagnosisReport() {
        initComponents();
        setLocationRelativeTo(null);
        btnsubmit.setEnabled(false);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtdoctorid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtwardid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtreportid = new javax.swing.JTextField();
        txtpatientid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttreatments = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdrugsgiven = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Diagnosis Report");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("Diagnosis Report");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Diagnosis Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 12, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Doctor ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, -1));
        jPanel2.add(txtdoctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 100, -1));

        txtwardid.setEditable(false);
        jPanel2.add(txtwardid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ward ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Report ID");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, -1));

        txtreportid.setEditable(false);
        jPanel2.add(txtreportid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));
        jPanel2.add(txtpatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, -1));

        btnsearch.setBackground(new java.awt.Color(242, 241, 240));
        btnsearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnsearch.setText("Get Ward ID");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttreatments.setBackground(new java.awt.Color(255, 255, 255));
        txttreatments.setColumns(20);
        txttreatments.setRows(5);
        jScrollPane1.setViewportView(txttreatments);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 240, 110));

        txtdrugsgiven.setBackground(new java.awt.Color(255, 255, 255));
        txtdrugsgiven.setColumns(20);
        txtdrugsgiven.setRows(5);
        jScrollPane2.setViewportView(txtdrugsgiven);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Drugs Given");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Treatments");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 380, 260));

        btncancel.setBackground(new java.awt.Color(242, 241, 240));
        btncancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        btnsubmit.setBackground(new java.awt.Color(242, 241, 240));
        btnsubmit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnsubmit.setText("Generate");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/reportframe.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try {
            // TODO add your handling code here:
            Statement s1=Database.getStatement();
            s1.executeUpdate("INSERT INTO diagnosisreports(DoctorID,PatientID,WardID,Treatments,DrugsGiven) Values('"+txtdoctorid.getText()+"','"+txtpatientid.getText()+"','"+txtwardid.getText()+"','"+txttreatments.getText()+"','"+txtdrugsgiven.getText()+"')");
            JOptionPane.showMessageDialog(rootPane,"Successfully Submitted!","",JOptionPane.INFORMATION_MESSAGE);
            Statement s2=Database.getStatement();
            ResultSet rs=s2.executeQuery("SELECT ReportID FROM diagnosisreport WHERE PatientID='"+txtpatientid.getText()+"'");
            while(rs.next()){
                txtreportid.setText(rs.getString("ReportID"));
            }
            txtreportid.setText("");
            txtdoctorid.setText("");
            txtpatientid.setText("");
            txtwardid.setText("");
            txttreatments.setText("");
            txtdrugsgiven.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        try{
            btnsubmit.setEnabled(true);
            Statement s=Database.getStatement();
            ResultSet rs=s.executeQuery("SELECT AdmittedWard FROM patientdetails WHERE PatientID='"+txtpatientid.getText()+"'");
            while(rs.next()){
                txtwardid.setText(rs.getString("AdmittedWard"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        txtreportid.setText("");
        txtdoctorid.setText("");
        txtpatientid.setText("");
        txtwardid.setText("");
        txttreatments.setText("");
        txtdrugsgiven.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(DiagnosisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosisReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtdoctorid;
    private javax.swing.JTextArea txtdrugsgiven;
    private javax.swing.JTextField txtpatientid;
    private javax.swing.JTextField txtreportid;
    private javax.swing.JTextArea txttreatments;
    private javax.swing.JTextField txtwardid;
    // End of variables declaration//GEN-END:variables
}
