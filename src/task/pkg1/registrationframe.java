/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/**
 *
 * @author kreshantha
 */
public class registrationframe extends javax.swing.JFrame {

    /**
     * Creates new form registrationframe
     */
    public registrationframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textusername = new javax.swing.JTextField();
        textpassword = new javax.swing.JTextField();
        textfirstname = new javax.swing.JTextField();
        textlastname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Registration form");

        textusername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textusername.setName("textusername"); // NOI18N

        textpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textfirstname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textlastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Clear");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("First name");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Last name");

        LabelMessage.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(textlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(60, 60, 60)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addComponent(LabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addComponent(textfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addComponent(textlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    

        
        /*System.out.println("");
        String textFieldValue = textusername.getText();
        int usernameLength = textFieldValue.length();
        String textFieldValues = textpassword.getText();
        int checkPasswordComplexity = textFieldValue.length();
        loginframe viewSelectedRow = new loginframe();
        viewSelectedRow.setVisible(true);
        //prevent the frame from closing the parent frame
        viewSelectedRow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);*/

        try {
            registerUser();
        } catch (Exception e) {
            System.out.println(e);
        }       
    
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // My methods.
    private Boolean checkPasswordComplexity()
    {
        try {
                Boolean ContainsCaps = false;
                Boolean inValidLength = false;
                Boolean ContainsSpecial = false;
                Boolean ContainsNumber = false;
                                
                String textFieldValue = textpassword.getText();
                
                if (textFieldValue.length() < 8)
                {       
                     inValidLength = true;   
                }
                                        
                for(int i=0;i<textFieldValue.length();i++)
                {
                    if(Character.isUpperCase(textFieldValue.charAt(i)))
                    {
                        ContainsCaps = true;
                    }              
                }
                
                // Checks for special character.
                Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher(textFieldValue);
                ContainsSpecial = m.find();
                
                // Check for number.
                ContainsNumber = textFieldValue.matches(".*[0-9].*");               
                
                if(inValidLength && ContainsCaps && ContainsSpecial && ContainsNumber)
                {
                    return true;
                }
                
                return false;
            
        } catch (Exception e) {
             System.out.println(e);
             return false;
        }       
    }
    
     private Boolean checkUserName() 
    {
        try {
                String textFieldValue = textusername.getText();
                
                if (textFieldValue.length() <= 5 && textFieldValue.contains("_"))
                {       
                     return true;   
                }
            
                return false;
            
        } catch (Exception e) {
             System.out.println(e);
             return false;
        }       
    }
    
     
     private void registerUser()
     {
         try {
             Boolean UsernameResult = checkUserName();
             Boolean PasswordResult = checkPasswordComplexity();
             
             
             if (!UsernameResult) {
                 LabelMessage.setText("Username is not correctly formatted please ensure that your username contains an underscore and is no more than 5 characters in length .");                
                 return;
             }
             
                if (!PasswordResult) {
                 LabelMessage.setText("??? At least eight characters long. \n" +
                                      "??? Contain a capital letter\n" +
                                      "??? Contain a number\n" +
                                      "??? Contain a special character");
                 
                 return;
                }
                        
                // Set globals.
                UseOfGlobal.username = textusername.getText();
                UseOfGlobal.password = textpassword.getText();
                
                // if all is good.
               loginframe viewSelectedRow = new loginframe(); // Pass data through
               viewSelectedRow.setVisible(true);
         } catch (Exception e) {
              System.out.println(e);
         }
     }
     
    
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
            java.util.logging.Logger.getLogger(registrationframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textfirstname;
    private javax.swing.JTextField textlastname;
    private javax.swing.JTextField textpassword;
    private javax.swing.JTextField textusername;
    // End of variables declaration//GEN-END:variables
}
