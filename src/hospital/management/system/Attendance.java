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
public class Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
    public Attendance() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttimecheckedin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnmark = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        txtsetdate = new javax.swing.JTextField();
        txtdob = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Attendance");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Attendance");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("UserID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel1.add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 95, 70, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Time Checked In");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel1.add(txttimecheckedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 135, 100, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btnmark.setBackground(new java.awt.Color(242, 241, 240));
        btnmark.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnmark.setText("Mark");
        btnmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmarkActionPerformed(evt);
            }
        });
        jPanel1.add(btnmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 80, 40));

        btncancel.setBackground(new java.awt.Color(242, 241, 240));
        btncancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, 40));

        txtsetdate.setEditable(false);
        txtsetdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsetdateActionPerformed(evt);
            }
        });
        jPanel1.add(txtsetdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 175, 130, -1));

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
    jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 175, 25, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdobOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_txtdobOnCommit
        // TODO add your handling code here:
        txtsetdate.setText(txtdob.getText());
    }//GEN-LAST:event_txtdobOnCommit

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        txttimecheckedin.setText("");
        txtsetdate.setText("");
        txtuserid.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmarkActionPerformed
        try {
            // TODO add your handling code here:
            Statement s=Database.getStatement();
            s.executeUpdate("INSERT INTO attendance(UserID,TimeCheckedIn,DateCheckedIn) values('"+txtuserid.getText()+"','"+txttimecheckedin.getText()+"','"+txtsetdate.getText()+"')");
            JOptionPane.showMessageDialog(rootPane,"Successfull Marked!",null,JOptionPane.INFORMATION_MESSAGE);
            txttimecheckedin.setText("");
            txtsetdate.setText("");
            txtuserid.setText("");

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnmarkActionPerformed

    private void txtsetdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsetdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsetdateActionPerformed

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnmark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private datechooser.beans.DateChooserCombo txtdob;
    private javax.swing.JTextField txtsetdate;
    private javax.swing.JTextField txttimecheckedin;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables
}
