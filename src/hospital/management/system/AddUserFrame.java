/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

/**
 *
 * @author Dineth Kariyawasam
 */
public class AddUserFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddUserFrame
     */
    int usertype=0;
    
    public AddUserFrame() {
        initComponents();
        setLocationRelativeTo(null);
        btnaddnewreceptionist.setEnabled(false);
        btnaddnewdoctor.setEnabled(false);
        btnaddnewpatient.setEnabled(false);
        btnaddnewlabtechnician.setEnabled(false);
    }
    
    public void returnUserType(int i){
        //Set label text as user login type
        switch (i) {
            case 0:
                lbluser.setText("You are logged in as an Administrator");
                break;
            case 1:
                lbluser.setText("You are logged in as a Receptionist");
                break;
            case 2:
                lbluser.setText("You are logged in as a Doctor");
                break;
            case 3:
                lbluser.setText("You are logged in as a Lab Technician");
                break;
            default:
                break;
        }
    }
    
    public void setActiveButtons(int i){
        //Enable buttons for each user type
        switch (i) {
            case 0:
                btnaddnewreceptionist.setEnabled(true);
                btnaddnewdoctor.setEnabled(true);
                btnaddnewpatient.setEnabled(true);
                btnaddnewlabtechnician.setEnabled(true);
                break;
            case 1:
                btnaddnewpatient.setEnabled(true);
                break;
            case 2:
                btnaddnewlabtechnician.setEnabled(true);
                break;
            default:
                break;
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
        btnaddnewreceptionist = new javax.swing.JButton();
        btnaddnewdoctor = new javax.swing.JButton();
        btnaddnewpatient = new javax.swing.JButton();
        btnaddnewlabtechnician = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        lbluser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New User");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaddnewreceptionist.setBackground(new java.awt.Color(242, 241, 240));
        btnaddnewreceptionist.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        btnaddnewreceptionist.setText("Add New Receptionist");
        btnaddnewreceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewreceptionistActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddnewreceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 110, 340, 50));

        btnaddnewdoctor.setBackground(new java.awt.Color(242, 241, 240));
        btnaddnewdoctor.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        btnaddnewdoctor.setText("Add New Doctor");
        btnaddnewdoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewdoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddnewdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 170, 340, 50));

        btnaddnewpatient.setBackground(new java.awt.Color(242, 241, 240));
        btnaddnewpatient.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        btnaddnewpatient.setText("Add New Patient");
        btnaddnewpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewpatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddnewpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 230, 340, 50));

        btnaddnewlabtechnician.setBackground(new java.awt.Color(242, 241, 240));
        btnaddnewlabtechnician.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        btnaddnewlabtechnician.setText("Add New Lab Technician");
        btnaddnewlabtechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewlabtechnicianActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddnewlabtechnician, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 290, 340, 50));

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 425, -1, -1));

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbluser.setText("You are logged in as a");
        jPanel1.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setText("Adding New Users");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel1.setText("Adding New Users");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 52, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/AddNewUserForm.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        LoginForm backtologin=new LoginForm();
        backtologin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnaddnewreceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewreceptionistActionPerformed
        // TODO add your handling code here:
        AddReceptionist frame1=new AddReceptionist();
        frame1.setVisible(true);
        frame1.usertype=usertype;
        dispose();
    }//GEN-LAST:event_btnaddnewreceptionistActionPerformed

    private void btnaddnewdoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewdoctorActionPerformed
        // TODO add your handling code here:
        AddDoctor frame2=new AddDoctor();
        frame2.setVisible(true);
        frame2.usertype=usertype;
        dispose();
    }//GEN-LAST:event_btnaddnewdoctorActionPerformed

    private void btnaddnewpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewpatientActionPerformed
        // TODO add your handling code here:
        AddPatient frame3=new AddPatient();
        frame3.setVisible(true);
        frame3.usertype=usertype;
        dispose();
    }//GEN-LAST:event_btnaddnewpatientActionPerformed

    private void btnaddnewlabtechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewlabtechnicianActionPerformed
        // TODO add your handling code here:
        AddLabTechnician frame4=new AddLabTechnician();
        frame4.setVisible(true);
        frame4.usertype=usertype;
        dispose();
    }//GEN-LAST:event_btnaddnewlabtechnicianActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnewdoctor;
    private javax.swing.JButton btnaddnewlabtechnician;
    private javax.swing.JButton btnaddnewpatient;
    private javax.swing.JButton btnaddnewreceptionist;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}
