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
public class EditRequests extends javax.swing.JFrame {

    /**
     * Creates new form EditRequests
     */
    public EditRequests() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            // TODO add your handling code here:
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            Statement s=Database.getStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM requestreport");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("RequestID").toString(),rs.getString("DoctorID").toString(),rs.getString("PatientID").toString(),rs.getString("TestCategory").toString()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtrequestid = new javax.swing.JTextField();
        btnupdaterequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdoctorid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpatientid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbtestcategory = new javax.swing.JComboBox<>();
        btncancel = new javax.swing.JButton();
        btndeleterequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Requests");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Doctor ID", "Patient ID", "Test Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 500, 180));
        jPanel1.add(txtrequestid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, -1));

        btnupdaterequest.setBackground(new java.awt.Color(255, 255, 255));
        btnupdaterequest.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnupdaterequest.setText("Update Request");
        btnupdaterequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdaterequestActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdaterequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Request ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 296, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Doctor ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, -1));
        jPanel1.add(txtdoctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 333, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Patient ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 100, -1));
        jPanel1.add(txtpatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 373, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Test Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 100, -1));

        cmbtestcategory.setBackground(new java.awt.Color(255, 255, 255));
        cmbtestcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood", "Urine" }));
        jPanel1.add(cmbtestcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 417, 100, -1));

        btncancel.setBackground(new java.awt.Color(255, 255, 255));
        btncancel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 140, -1));

        btndeleterequest.setBackground(new java.awt.Color(255, 255, 255));
        btndeleterequest.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btndeleterequest.setText("Delete Request");
        btndeleterequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleterequestActionPerformed(evt);
            }
        });
        jPanel1.add(btndeleterequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdaterequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdaterequestActionPerformed
        try {
            Statement s = Database.getStatement();
            s.executeUpdate("UPDATE requestreport set DoctorID='" + txtdoctorid.getText() + "',PatientID='" + txtpatientid.getText() + "',TestCategory='" + cmbtestcategory.getSelectedItem() + "' where RequestID='" + txtrequestid.getText() + "'");
            JOptionPane.showMessageDialog(rootPane,"Successfull Updated!",null,JOptionPane.INFORMATION_MESSAGE);
            txtrequestid.setText("");
            txtdoctorid.setText("");
            txtpatientid.setText("");
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            model.getDataVector().removeAllElements();
            Statement s1=Database.getStatement();
            ResultSet rs=s1.executeQuery("SELECT * FROM requestreport");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("RequestID").toString(),rs.getString("DoctorID").toString(),rs.getString("PatientID").toString(),rs.getString("TestCategory").toString()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnupdaterequestActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        txtrequestid.setText("");
        txtdoctorid.setText("");
        txtpatientid.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

    private void btndeleterequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleterequestActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Statement s1=Database.getStatement();
            s1.executeUpdate("DELETE FROM requestreport WHERE RequestID='"+txtrequestid.getText()+"'");
            JOptionPane.showMessageDialog(rootPane,"Successfull Removed!",null,JOptionPane.INFORMATION_MESSAGE);
            txtrequestid.setText("");
            txtdoctorid.setText("");
            txtpatientid.setText("");
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            model.getDataVector().removeAllElements();
            Statement s=Database.getStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM requestreport");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("RequestID").toString(),rs.getString("DoctorID").toString(),rs.getString("PatientID").toString(),rs.getString("TestCategory").toString()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btndeleterequestActionPerformed

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
            java.util.logging.Logger.getLogger(EditRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndeleterequest;
    private javax.swing.JButton btnupdaterequest;
    private javax.swing.JComboBox<String> cmbtestcategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdoctorid;
    private javax.swing.JTextField txtpatientid;
    private javax.swing.JTextField txtrequestid;
    // End of variables declaration//GEN-END:variables
}