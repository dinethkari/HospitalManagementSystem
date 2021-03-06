/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dineth Kariyawasam
 */
public class LabTests extends javax.swing.JFrame {

    /**
     * Creates new form LabTests
     */
    int requestid=0;
    
    public LabTests() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void getIDs(String DoctorID,String PatientID,String Requestid){
        txtdoctorid.setText(DoctorID);
        txtpatientid.setText(PatientID);
        requestid=Integer.parseInt(Requestid);
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
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdoctorid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpatientid = new javax.swing.JTextField();
        txtsetdate = new javax.swing.JTextField();
        txtdob = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        txtlabtechnicianid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlabtechniciancomment = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdoctorcomment = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btngenerate = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laboratory Report");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Laboratory Test Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setText("Laboratory Test Report");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date Issued");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 77, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Doctor ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, 100, -1));

        txtdoctorid.setEditable(false);
        jPanel2.add(txtdoctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 47, 100, -1));

        txtpatientid.setEditable(false);
        jPanel2.add(txtpatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, -1));

        txtsetdate.setEditable(false);
        jPanel2.add(txtsetdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, -1));

        txtdob.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    try {
        txtdob.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    txtdob.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            txtdobOnCommit(evt);
        }
    });
    jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 25, -1));

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel7.setText("LabTechnician ID");
    jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 107, 110, -1));
    jPanel2.add(txtlabtechnicianid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 70, -1));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, 140));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtlabtechniciancomment.setBackground(new java.awt.Color(255, 255, 255));
    txtlabtechniciancomment.setColumns(20);
    txtlabtechniciancomment.setRows(5);
    jScrollPane1.setViewportView(txtlabtechniciancomment);

    jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, -1));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setText("Lab Technician's Comments");
    jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

    txtdoctorcomment.setBackground(new java.awt.Color(255, 255, 255));
    txtdoctorcomment.setColumns(20);
    txtdoctorcomment.setRows(5);
    jScrollPane2.setViewportView(txtdoctorcomment);

    jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 340, -1));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel3.setText("Doctor's Comments");
    jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 380, 260));

    btngenerate.setBackground(new java.awt.Color(242, 241, 240));
    btngenerate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    btngenerate.setText("Generate");
    btngenerate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btngenerateActionPerformed(evt);
        }
    });
    jPanel1.add(btngenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

    btncancel.setBackground(new java.awt.Color(242, 241, 240));
    btncancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    btncancel.setText("Cancel");
    jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/reportframe.jpg"))); // NOI18N
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdobOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_txtdobOnCommit
        // TODO add your handling code here:
        txtsetdate.setText(txtdob.getText());
    }//GEN-LAST:event_txtdobOnCommit

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        try {
            // TODO add your handling code here:
            Statement s=Database.getStatement();
            s.executeUpdate("INSERT INTO labtests(DoctorID,PatientID,DateIssued,LabTechnicianID,LabTechnicianComment,DoctorComment) VALUES('"+txtdoctorid.getText()+"','"+txtpatientid.getText()+"','"+txtsetdate.getText()+"','"+txtlabtechnicianid.getText()+"','"+txtlabtechniciancomment.getText()+"','"+txtdoctorcomment.getText()+"')");
            JOptionPane.showMessageDialog(rootPane,"Successfully Submitted!","",JOptionPane.INFORMATION_MESSAGE);
            txtdoctorid.setText("");
            txtpatientid.setText("");
            txtpatientid.setText("");
            txtsetdate.setText("");
            txtlabtechnicianid.setText("");
            txtlabtechniciancomment.setText("");
            txtdoctorcomment.setText("");
            Statement s1=Database.getStatement();
            s1.executeUpdate("DELETE FROM requestreport WHERE RequestID='"+requestid+"'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btngenerateActionPerformed

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
            java.util.logging.Logger.getLogger(LabTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabTests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btngenerate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private datechooser.beans.DateChooserCombo txtdob;
    private javax.swing.JTextArea txtdoctorcomment;
    private javax.swing.JTextField txtdoctorid;
    private javax.swing.JTextArea txtlabtechniciancomment;
    private javax.swing.JTextField txtlabtechnicianid;
    private javax.swing.JTextField txtpatientid;
    private javax.swing.JTextField txtsetdate;
    // End of variables declaration//GEN-END:variables
}
