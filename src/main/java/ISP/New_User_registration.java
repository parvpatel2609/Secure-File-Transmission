
package ISP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Scanner;

public class New_User_registration extends javax.swing.JFrame {

    public New_User_registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblMailId = new javax.swing.JLabel();
        lblmob_number = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtMobile_number = new javax.swing.JTextField();
        txtMailID = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        lblNew_User_Registration = new javax.swing.JLabel();
        lblcyber_new_user_regi = new javax.swing.JLabel();
        lblseason = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Summer 2022");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New User Details");
        setBackground(new java.awt.Color(0, 102, 255));
        setResizable(false);

        lblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblName.setText("Enter your first Name:");

        lblMailId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMailId.setText("Enter your Mail Id:");

        lblmob_number.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblmob_number.setText("Enter your Mobile Number:");

        txtFirstname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });

        txtMobile_number.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMobile_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobile_numberActionPerformed(evt);
            }
        });

        txtMailID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailIDActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblNew_User_Registration.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNew_User_Registration.setForeground(new java.awt.Color(204, 0, 204));
        lblNew_User_Registration.setText("Personal Details of New User");

        lblcyber_new_user_regi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcyber_new_user_regi.setForeground(new java.awt.Color(255, 0, 0));
        lblcyber_new_user_regi.setText("ISP037 Cyber Security");

        lblseason.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblseason.setForeground(new java.awt.Color(255, 0, 0));
        lblseason.setText("Summer 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMailId)
                    .addComponent(lblName)
                    .addComponent(lblmob_number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMailID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile_number, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblNew_User_Registration)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblcyber_new_user_regi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblseason))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNew_User_Registration)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMailId)
                    .addComponent(txtMailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmob_number)
                    .addComponent(txtMobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcyber_new_user_regi)
                    .addComponent(lblseason)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void txtMobile_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobile_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobile_numberActionPerformed

    private void txtMailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailIDActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Lenovo\\Documents\\New_User_Registration.txt",true);
            String userFirstname = txtFirstname.getText();
            Scanner sc1 = new Scanner(System.in);
            boolean flag = false;
            Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\Lenovo\\Documents\\New_User_Registration.txt"));
            //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Documents\\New_User_Registration.txt"));
            if(txtFirstname.getText().contains(" ") || txtMailID.getText().contains(" ")){
                JOptionPane.showMessageDialog(New_User_registration.this, "Space is not allowed in firstname and email-id.");
                dispose();
            }
            else if(txtFirstname.getText().equals("") || txtMailID.getText().equals("") || txtMobile_number.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter all the details.");
                dispose();
            }
            
//                if(userFirstname.equals(reader.readLine())){
//                    JOptionPane.showMessageDialog(null, "Please use another name because it is used...");
//                }
//                else{
//                    writer.write(txtFirstname.getText() + " " + txtMailID.getText() + " " + txtMobile_number.getText() + "\n");
//                    writer.flush();
//                    writer.close();
//                    new New_User_ID_Password().setVisible(true);
//                    dispose();
//                }
            while(sc2.hasNextLine()){
                String line = sc2.nextLine();
                if(line.indexOf(userFirstname) != -1){
                    flag = true;
                }
            }  
            if(flag){
                JOptionPane.showMessageDialog(null, "Please use other Username because it is used.");
                dispose();
            }
            else{
                writer.write(txtFirstname.getText() + " " + txtMailID.getText() + " " + txtMobile_number.getText() + "\n");
                writer.flush();
                writer.close();
                new New_User_ID_Password().setVisible(true);
                dispose();
            }
            
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(New_User_registration.this, "Your data is not stored in our software so please close it than restart the software...");
            Logger.getLogger(New_User_registration.class.getName()).log(Level.SEVERE, null, ex);
            dispose();
        }
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(New_User_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_User_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_User_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_User_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_User_registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMailId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNew_User_Registration;
    private javax.swing.JLabel lblcyber_new_user_regi;
    private javax.swing.JLabel lblmob_number;
    private javax.swing.JLabel lblseason;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtMailID;
    private javax.swing.JTextField txtMobile_number;
    // End of variables declaration//GEN-END:variables
}