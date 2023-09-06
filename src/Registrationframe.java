import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class Registrationframe extends javax.swing.JFrame {

    public Registrationframe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Leftpanelregistration = new javax.swing.JPanel();
        LOGOREGISTRATION = new javax.swing.JLabel();
        Welcomeregistrtation = new javax.swing.JLabel();
        RightpanelRegistration = new javax.swing.JPanel();
        userlabelregistration = new javax.swing.JLabel();
        usertextfeildregistration = new javax.swing.JLabel();
        usernameinputfeild = new javax.swing.JTextField();
        passwordfeildregistration = new javax.swing.JPasswordField();
        Loginlabelregistration = new javax.swing.JLabel();
        registrationaccountbutton = new javax.swing.JButton();
        Loginaccount = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        usertextfeild1registration = new javax.swing.JLabel();
        passwordfeildregistrationagain = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setResizable(false);

        Leftpanelregistration.setBackground(new java.awt.Color(37, 43, 72));

        LOGOREGISTRATION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/8_1sasa11.png"))); // NOI18N

        Welcomeregistrtation.setFont(new java.awt.Font("Norasi", 0, 24)); // NOI18N
        Welcomeregistrtation.setForeground(new java.awt.Color(255, 255, 255));
        Welcomeregistrtation.setText("WELCOME");

        javax.swing.GroupLayout LeftpanelregistrationLayout = new javax.swing.GroupLayout(Leftpanelregistration);
        Leftpanelregistration.setLayout(LeftpanelregistrationLayout);
        LeftpanelregistrationLayout.setHorizontalGroup(
            LeftpanelregistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftpanelregistrationLayout.createSequentialGroup()
                .addGroup(LeftpanelregistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftpanelregistrationLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Welcomeregistrtation))
                    .addGroup(LeftpanelregistrationLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(LOGOREGISTRATION)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        LeftpanelregistrationLayout.setVerticalGroup(
            LeftpanelregistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftpanelregistrationLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(LOGOREGISTRATION, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcomeregistrtation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RightpanelRegistration.setBackground(new java.awt.Color(68, 80, 105));
        RightpanelRegistration.setPreferredSize(new java.awt.Dimension(800, 800));

        userlabelregistration.setFont(new java.awt.Font("Norasi", 0, 20)); // NOI18N
        userlabelregistration.setForeground(new java.awt.Color(255, 255, 255));
        userlabelregistration.setText("Please Enter Your Name");

        usertextfeildregistration.setFont(new java.awt.Font("Norasi", 0, 20)); // NOI18N
        usertextfeildregistration.setForeground(new java.awt.Color(255, 255, 255));
        usertextfeildregistration.setText("Please Enter Your Passcode");

        usernameinputfeild.setBackground(new java.awt.Color(37, 43, 72));
        usernameinputfeild.setFont(new java.awt.Font("Norasi", 0, 21)); // NOI18N
        usernameinputfeild.setForeground(new java.awt.Color(255, 255, 255));
        usernameinputfeild.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        usernameinputfeild.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameinputfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameinputfeildActionPerformed(evt);
            }
        });

        passwordfeildregistration.setBackground(new java.awt.Color(37, 43, 72));
        passwordfeildregistration.setFont(new java.awt.Font("Norasi", 0, 21)); // NOI18N
        passwordfeildregistration.setForeground(new java.awt.Color(255, 255, 255));
        passwordfeildregistration.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        passwordfeildregistration.setCaretColor(new java.awt.Color(255, 255, 255));

        Loginlabelregistration.setFont(new java.awt.Font("Norasi", 1, 24)); // NOI18N
        Loginlabelregistration.setForeground(new java.awt.Color(255, 255, 255));
        Loginlabelregistration.setText("Registration");

        registrationaccountbutton.setBackground(new java.awt.Color(91, 154, 139));
        registrationaccountbutton.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        registrationaccountbutton.setForeground(new java.awt.Color(255, 255, 255));
        registrationaccountbutton.setText("REGISTER");
        registrationaccountbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        registrationaccountbutton.setBorderPainted(false);
        registrationaccountbutton.setDefaultCapable(false);
        registrationaccountbutton.setFocusPainted(false);
        registrationaccountbutton.setFocusable(false);
        registrationaccountbutton.setRequestFocusEnabled(false);
        registrationaccountbutton.setRolloverEnabled(false);
        registrationaccountbutton.setVerifyInputWhenFocusTarget(false);
        registrationaccountbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationaccountbuttonActionPerformed(evt);
            }
        });

        Loginaccount.setBackground(new java.awt.Color(91, 154, 139));
        Loginaccount.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        Loginaccount.setForeground(new java.awt.Color(255, 255, 255));
        Loginaccount.setText("LOGIN");
        Loginaccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Loginaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginaccountActionPerformed(evt);
            }
        });

        heading.setBackground(new java.awt.Color(255, 255, 255));
        heading.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("I already have a account");

        usertextfeild1registration.setFont(new java.awt.Font("Norasi", 0, 20)); // NOI18N
        usertextfeild1registration.setForeground(new java.awt.Color(255, 255, 255));
        usertextfeild1registration.setText("Please Re-enter Your Passcode");

        passwordfeildregistrationagain.setBackground(new java.awt.Color(37, 43, 72));
        passwordfeildregistrationagain.setFont(new java.awt.Font("Norasi", 0, 21)); // NOI18N
        passwordfeildregistrationagain.setForeground(new java.awt.Color(255, 255, 255));
        passwordfeildregistrationagain.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        passwordfeildregistrationagain.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout RightpanelRegistrationLayout = new javax.swing.GroupLayout(RightpanelRegistration);
        RightpanelRegistration.setLayout(RightpanelRegistrationLayout);
        RightpanelRegistrationLayout.setHorizontalGroup(
            RightpanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelRegistrationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(RightpanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrationaccountbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlabelregistration)
                    .addGroup(RightpanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordfeildregistration, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameinputfeild, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usertextfeildregistration, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usertextfeild1registration, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordfeildregistrationagain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Loginlabelregistration)
                    .addComponent(Loginaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heading))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        RightpanelRegistrationLayout.setVerticalGroup(
            RightpanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelRegistrationLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Loginlabelregistration)
                .addGap(18, 18, 18)
                .addComponent(userlabelregistration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameinputfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usertextfeildregistration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordfeildregistration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usertextfeild1registration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordfeildregistrationagain, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrationaccountbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Loginaccount)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Leftpanelregistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(RightpanelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Leftpanelregistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RightpanelRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameinputfeildActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameinputfeildActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_usernameinputfeildActionPerformed

    private void LoginaccountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LoginaccountActionPerformed
        Loginframe login = new Loginframe();
        login.setVisible(true);
        dispose();
    }// GEN-LAST:event_LoginaccountActionPerformed

    public void registrationaccountbuttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registrationaccountbuttonActionPerformed
        String username = usernameinputfeild.getText();
        char[] passwordchar = passwordfeildregistration.getPassword();
        String password = new String(passwordchar);
        char[] passwordcharagain = passwordfeildregistrationagain.getPassword();
        String passwordagain = new String(passwordcharagain);
        System.out.println("Username is " + username);
        System.out.println("Password is " + password);
        System.out.println("Password again is " + passwordagain);

        if (username.isEmpty() || password.isEmpty() || passwordagain.isEmpty()) {
            JOptionPane.showMessageDialog(null, "None of the fields can be empty");
        } else {
            if (password.equals(passwordagain)) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passwordinfodatabase",
                            "root", "Password123#@!!");// Replace your database passcode with this password123#@!@ and connectioin path
                    System.out.println("Connected to database");
                    
                    String insertQuery = "INSERT INTO logininfo (username, password) VALUES (?, ?)";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, password);
                        int rowsAffected = preparedStatement.executeUpdate();
                        
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Your account has been registered successfully");
                        } else {
                            JOptionPane.showMessageDialog(null, "Registration Failed. Unknown error.");
                        }
                    }
                    
                    connection.close(); // Close the connection when done
                } 
                catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "An error occurred during registration.");
                    } 
            } else {
                JOptionPane.showMessageDialog(null, "Passwords don't match. Please make sure that the passwords match.");
                System.out.println("Passwords don't match");
            }
        }
    }
        // GEN-LAST:event_registrationaccountbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrationframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGOREGISTRATION;
    private javax.swing.JPanel Leftpanelregistration;
    private javax.swing.JButton Loginaccount;
    private javax.swing.JLabel Loginlabelregistration;
    private javax.swing.JPanel RightpanelRegistration;
    private javax.swing.JLabel Welcomeregistrtation;
    private javax.swing.JLabel heading;
    private javax.swing.JPasswordField passwordfeildregistration;
    private javax.swing.JPasswordField passwordfeildregistrationagain;
    private javax.swing.JButton registrationaccountbutton;
    private javax.swing.JLabel userlabelregistration;
    private javax.swing.JTextField usernameinputfeild;
    private javax.swing.JLabel usertextfeild1registration;
    private javax.swing.JLabel usertextfeildregistration;
    // End of variables declaration//GEN-END:variables
}
