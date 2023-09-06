import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Loginframe extends javax.swing.JFrame {
    Registrationframe registration = new Registrationframe();

    public Loginframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Leftpanel = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        Rightpanel = new javax.swing.JPanel();
        userlabel = new javax.swing.JLabel();
        usertextfeild = new javax.swing.JLabel();
        userlogintextfeild = new javax.swing.JTextField();
        userpasswordfeildlogintextfeild = new javax.swing.JPasswordField();
        Loginlabel = new javax.swing.JLabel();
        REGISTERACCOUNT = new javax.swing.JButton();
        labelidonthaveaaccount = new javax.swing.JLabel();
        Loginaccountbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setName("Loginframe"); // NOI18N
        setResizable(false);

        Leftpanel.setBackground(new java.awt.Color(37, 43, 72));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/8_1sasa11.png"))); // NOI18N

        Welcome.setFont(new java.awt.Font("Norasi", 0, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("WELCOME");

        javax.swing.GroupLayout LeftpanelLayout = new javax.swing.GroupLayout(Leftpanel);
        Leftpanel.setLayout(LeftpanelLayout);
        LeftpanelLayout.setHorizontalGroup(
            LeftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftpanelLayout.createSequentialGroup()
                .addGroup(LeftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftpanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Welcome))
                    .addGroup(LeftpanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(LOGO)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        LeftpanelLayout.setVerticalGroup(
            LeftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftpanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rightpanel.setBackground(new java.awt.Color(68, 80, 105));
        Rightpanel.setPreferredSize(new java.awt.Dimension(800, 800));

        userlabel.setFont(new java.awt.Font("Norasi", 0, 20)); // NOI18N
        userlabel.setForeground(new java.awt.Color(255, 255, 255));
        userlabel.setText("Please Enter Your Name");

        usertextfeild.setFont(new java.awt.Font("Norasi", 0, 20)); // NOI18N
        usertextfeild.setForeground(new java.awt.Color(255, 255, 255));
        usertextfeild.setText("Please Enter Your Passcode");

        userlogintextfeild.setBackground(new java.awt.Color(37, 43, 72));
        userlogintextfeild.setFont(new java.awt.Font("Norasi", 0, 21)); // NOI18N
        userlogintextfeild.setForeground(new java.awt.Color(255, 255, 255));
        userlogintextfeild.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        userlogintextfeild.setCaretColor(new java.awt.Color(255, 255, 255));
        userlogintextfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userlogintextfeildActionPerformed(evt);
            }
        });

        userpasswordfeildlogintextfeild.setBackground(new java.awt.Color(37, 43, 72));
        userpasswordfeildlogintextfeild.setFont(new java.awt.Font("Norasi", 0, 21)); // NOI18N
        userpasswordfeildlogintextfeild.setForeground(new java.awt.Color(255, 255, 255));
        userpasswordfeildlogintextfeild.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        userpasswordfeildlogintextfeild.setCaretColor(new java.awt.Color(255, 255, 255));

        Loginlabel.setFont(new java.awt.Font("Norasi", 1, 24)); // NOI18N
        Loginlabel.setForeground(new java.awt.Color(255, 255, 255));
        Loginlabel.setText("LOG IN");

        REGISTERACCOUNT.setBackground(new java.awt.Color(91, 154, 139));
        REGISTERACCOUNT.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        REGISTERACCOUNT.setForeground(new java.awt.Color(255, 255, 255));
        REGISTERACCOUNT.setText("REGISTER ME");
        REGISTERACCOUNT.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        REGISTERACCOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTERACCOUNTActionPerformed(evt);
            }
        });

        labelidonthaveaaccount.setBackground(new java.awt.Color(255, 255, 255));
        labelidonthaveaaccount.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        labelidonthaveaaccount.setForeground(new java.awt.Color(255, 255, 255));
        labelidonthaveaaccount.setText("I don't have a account");

        Loginaccountbutton.setBackground(new java.awt.Color(91, 154, 139));
        Loginaccountbutton.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        Loginaccountbutton.setForeground(new java.awt.Color(255, 255, 255));
        Loginaccountbutton.setText("LOG IN");
        Loginaccountbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Loginaccountbutton.setBorderPainted(false);
        Loginaccountbutton.setDefaultCapable(false);
        Loginaccountbutton.setFocusPainted(false);
        Loginaccountbutton.setFocusable(false);
        Loginaccountbutton.setRequestFocusEnabled(false);
        Loginaccountbutton.setRolloverEnabled(false);
        Loginaccountbutton.setVerifyInputWhenFocusTarget(false);
        Loginaccountbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginaccountbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightpanelLayout = new javax.swing.GroupLayout(Rightpanel);
        Rightpanel.setLayout(RightpanelLayout);
        RightpanelLayout.setHorizontalGroup(
            RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Loginaccountbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlabel)
                    .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(userpasswordfeildlogintextfeild, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userlogintextfeild, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usertextfeild, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Loginlabel)
                    .addComponent(REGISTERACCOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelidonthaveaaccount))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        RightpanelLayout.setVerticalGroup(
            RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightpanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(Loginlabel)
                .addGap(18, 18, 18)
                .addComponent(userlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userlogintextfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usertextfeild)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userpasswordfeildlogintextfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Loginaccountbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelidonthaveaaccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGISTERACCOUNT)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userlogintextfeildActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_userlogintextfeildActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_userlogintextfeildActionPerformed

    private void REGISTERACCOUNTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REGISTERACCOUNTActionPerformed
        registration.setVisible(true);
        dispose();
    }// GEN-LAST:event_REGISTERACCOUNTActionPerformed

    private void LoginaccountbuttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LoginaccountbuttonActionPerformed
        String username = userlogintextfeild.getText();
        char[] passwordchar = userpasswordfeildlogintextfeild.getPassword();
        String password = new String(passwordchar);
        System.out.println("username is " + username);
        System.out.println("password is " + password);
    
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields. None of the fields can be empty.");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Passwordinfodatabase", "root", "Password123#@!!"); // Replace your database passcode with this password123#@!@ and connectioin path
                System.out.println("Connection completed");
                String query = "SELECT * FROM Passwordinfodatabase.logininfo WHERE username = ? AND password = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                if (resultSet.next()) {
                    // Login successful, perform any actions you need here
                    System.out.println("Login successful!");
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    Mainmenu mainmenu = new Mainmenu();
                    mainmenu.setVisible(true);
                    dispose();
                    // Add code for successful login here
                } else {
                    // Login failed, show an error message
                    JOptionPane.showMessageDialog(null, "Login failed. Please check your credentials.");
                }
                
                // Close resources (PreparedStatement, ResultSet, and Connection)
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel Leftpanel;
    private javax.swing.JButton Loginaccountbutton;
    private javax.swing.JLabel Loginlabel;
    private javax.swing.JButton REGISTERACCOUNT;
    private javax.swing.JPanel Rightpanel;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel labelidonthaveaaccount;
    private javax.swing.JLabel userlabel;
    private javax.swing.JTextField userlogintextfeild;
    private javax.swing.JPasswordField userpasswordfeildlogintextfeild;
    private javax.swing.JLabel usertextfeild;
    // End of variables declaration//GEN-END:variables
}
