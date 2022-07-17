package ISP;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class New_User_ID_Password extends javax.swing.JFrame {
    int OTP;
    
    public New_User_ID_Password() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewUser_ID = new javax.swing.JLabel();
        lblnewuserPassword = new javax.swing.JLabel();
        lblnewuserID_Password = new javax.swing.JLabel();
        txtnewUserID = new javax.swing.JTextField();
        pswField1 = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        lblConfigrationPassword = new javax.swing.JLabel();
        pswField2 = new javax.swing.JPasswordField();
        lblcyber = new javax.swing.JLabel();
        lblseason_Id_Pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New user Details");
        setResizable(false);

        lblNewUser_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNewUser_ID.setText("Enter User ID:");

        lblnewuserPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblnewuserPassword.setText("Enter Password:");

        lblnewuserID_Password.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblnewuserID_Password.setForeground(new java.awt.Color(255, 0, 255));
        lblnewuserID_Password.setText("New User ID & Password");

        txtnewUserID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pswField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pswField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswField1ActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblConfigrationPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConfigrationPassword.setText("Enter password again for configration:");

        pswField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblcyber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcyber.setForeground(new java.awt.Color(255, 0, 0));
        lblcyber.setText("ISP037 Cyber Security");

        lblseason_Id_Pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblseason_Id_Pass.setForeground(new java.awt.Color(255, 0, 0));
        lblseason_Id_Pass.setText("Summer 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewUser_ID)
                            .addComponent(lblnewuserPassword)
                            .addComponent(lblConfigrationPassword)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnSubmit)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnewUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pswField1)
                            .addComponent(pswField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblnewuserID_Password)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblcyber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblseason_Id_Pass))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblnewuserID_Password)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewUser_ID)
                    .addComponent(txtnewUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnewuserPassword)
                    .addComponent(pswField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfigrationPassword)
                    .addComponent(pswField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcyber)
                    .addComponent(lblseason_Id_Pass)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pswField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswField1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            String userId = txtnewUserID.getText();
            FileWriter writer = new FileWriter("C:\\Users\\Lenovo\\Documents\\New_User_ID_Password.txt",true);
            Scanner sc1 = new Scanner(System.in);
            boolean flag = false;
            Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\Lenovo\\Documents\\New_User_ID_Password.txt"));
            //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Documents\\New_User_ID_Password.txt"));
            if(txtnewUserID.getText().contains(" ") || pswField1.getText().contains(" ") || pswField2.getText().contains(" ")){
                JOptionPane.showMessageDialog(New_User_ID_Password.this, "Please don't get put space in userId and password.");
                dispose();
            }
            else if(txtnewUserID.getText().equals("") || pswField1.getText().equals("") || pswField2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter all the details perfectly.");
                dispose();
            }
            while(sc2.hasNextLine()){
                String line = sc2.nextLine();
                if(line.indexOf(userId) != -1){
                    flag = true;
                }
            }  
            if(flag){
                JOptionPane.showMessageDialog(null, "Please use other UserId because it is used.");
                
            }
            else{
                writer.write(txtnewUserID.getText() + " ");
                if(pswField1.getText().equals(pswField2.getText())){
                    writer.write(pswField1.getText() + "\n");
                    //JOptionPane.showMessageDialog(New_User_ID_Password.this, "Registration completed now login using this id and password.");
                    new User_registration_completed().setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(New_User_ID_Password.this, "Both password are not same so please write it same.");
                    dispose();
                }
                writer.flush();
                writer.close();
            }
        } 
        catch (IOException ex) {
            Logger.getLogger(New_User_ID_Password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(New_User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_User_ID_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblConfigrationPassword;
    private javax.swing.JLabel lblNewUser_ID;
    private javax.swing.JLabel lblcyber;
    private javax.swing.JLabel lblnewuserID_Password;
    private javax.swing.JLabel lblnewuserPassword;
    private javax.swing.JLabel lblseason_Id_Pass;
    private javax.swing.JPasswordField pswField1;
    private javax.swing.JPasswordField pswField2;
    private javax.swing.JTextField txtnewUserID;
    // End of variables declaration//GEN-END:variables
}
