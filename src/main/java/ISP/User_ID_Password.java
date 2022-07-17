package ISP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class User_ID_Password extends javax.swing.JFrame {
    int attempt = 0;
    public static String num;
    
    public static String generatedOTP(int otplength)
    {
        SplittableRandom splittableRandom = new SplittableRandom();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<otplength ; i++)
        {
            sb.append(splittableRandom.nextInt(0, 10));
        }
        return sb.toString();
    }
    
    public User_ID_Password() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbllogin_page = new javax.swing.JLabel();
        lbluserid_loginpage = new javax.swing.JLabel();
        lblpassword_loginpage = new javax.swing.JLabel();
        txtuserid_loginpage1 = new javax.swing.JTextField();
        pswf_password_loginpage = new javax.swing.JPasswordField();
        lblemailID_loginpage = new javax.swing.JLabel();
        txtmailId = new javax.swing.JTextField();
        btnSubmit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBackground(new java.awt.Color(0, 0, 153));
        setResizable(false);

        lbllogin_page.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllogin_page.setForeground(new java.awt.Color(204, 0, 0));
        lbllogin_page.setText("User Login");

        lbluserid_loginpage.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbluserid_loginpage.setText("User ID");

        lblpassword_loginpage.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblpassword_loginpage.setText("Password");

        txtuserid_loginpage1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtuserid_loginpage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserid_loginpage1ActionPerformed(evt);
            }
        });

        pswf_password_loginpage.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pswf_password_loginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswf_password_loginpageActionPerformed(evt);
            }
        });

        lblemailID_loginpage.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblemailID_loginpage.setText("Enter Email ID");

        txtmailId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        btnSubmit1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ISP037 Cyber Security");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Summer 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbluserid_loginpage)
                    .addComponent(lblpassword_loginpage)
                    .addComponent(lblemailID_loginpage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtuserid_loginpage1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(pswf_password_loginpage)
                    .addComponent(txtmailId))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lbllogin_page)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogin_page)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuserid_loginpage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluserid_loginpage))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpassword_loginpage)
                    .addComponent(pswf_password_loginpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemailID_loginpage)
                    .addComponent(txtmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnSubmit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserid_loginpage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserid_loginpage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserid_loginpage1ActionPerformed

    private void pswf_password_loginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswf_password_loginpageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswf_password_loginpageActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        try 
        {
            File reader = new File("C:\\Users\\Lenovo\\Documents\\New_User_ID_Password.txt");       
            String Id = txtuserid_loginpage1.getText();
            String password = pswf_password_loginpage.getText();
            Scanner sc = new Scanner(new File("C:\\Users\\Lenovo\\Documents\\New_User_ID_Password.txt"));
            boolean isAuth = false;
            while(sc.hasNextLine()) {           //while loop for check UserId and Password from first user name to end of the file
                String s = sc.nextLine();
                String[] sArray = s.split(" ");
                if(Id.equals(sArray[0]) && password.equals(sArray[1]))      //check UserId & Password are same or not through boolean type variable
                {
                    System.out.println("I am in if loop..");
                    isAuth = true;
                }
            }
            
            if(!isAuth)
            {
                System.out.println("printing_here_1");
                JOptionPane.showMessageDialog(null, "If you are new user, then first sign up and after that login. \n                          OR \nIf you are already sign up, then check your Id and password again.");
                dispose();
            }
                     
            else{
                num = User_ID_Password.generatedOTP(6);
                // Recipient's email ID needs to be mentioned.
                String to = txtmailId.getText();                        //String to value is taken by user

                // Sender's email ID needs to be mentioned
                String from = "patelparv822@gmail.com";

                // Assuming you are sending email from localhost
                String host = "smtp.gmail.com";

                // Get system properties
                Properties properties = System.getProperties();

                // Setup mail server
                properties.put("mail.smtp.host", host);
                properties.put("mail.smtp.port", "465");
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.auth", "true");

                // Get the Session object.// and pass username and password
                Session session = Session.getInstance(properties, new javax.mail.Authenticator() 
                {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("patelparv822@gmail.com", "nlikfrqlaalnqhon");
                    }
                });

                // Used to debug SMTP issues
                session.setDebug(true);

                try {
                    // Create a default MimeMessage object.
                    MimeMessage message = new MimeMessage(session);

                    // Set From: header field of the header.
                    message.setFrom(new InternetAddress(from));

                    // Set To: header field of the header.
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                    // Set Subject: header field
                    message.setSubject("Secure file transmission One Time Password" );

                    // Now set the actual message
                    message.setText("Your One Time Password is : " + num + ".\nPlease don't share it with others.");

                    System.out.println("sending...");
                    // Send message
                    Transport.send(message);
                    System.out.println("Sent message successfully....");

                    new OTP().setVisible(true);
                    dispose();
                } 
                catch (MessagingException mex) 
                {
                    System.out.println("Error : " + mex);
                }
            }
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(User_ID_Password.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_ID_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new User_ID_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblemailID_loginpage;
    private javax.swing.JLabel lbllogin_page;
    private javax.swing.JLabel lblpassword_loginpage;
    private javax.swing.JLabel lbluserid_loginpage;
    private javax.swing.JPasswordField pswf_password_loginpage;
    private javax.swing.JTextField txtmailId;
    private javax.swing.JTextField txtuserid_loginpage1;
    // End of variables declaration//GEN-END:variables
}
