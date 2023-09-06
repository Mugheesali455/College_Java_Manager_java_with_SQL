// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         performRegistration();
//     }

//     public static void performRegistration() {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter username: ");
//         String username = scanner.nextLine();

//         System.out.print("Enter password: ");
//         String password = scanner.nextLine();

//         System.out.print("Confirm password: ");
//         String confirmPassword = scanner.nextLine();

//         scanner.close();

//         // Validate input
//         if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
//             System.out.println("Username, password, and confirm password cannot be empty.");
//             return;
//         }

//         if (!password.equals(confirmPassword)) {
//             System.out.println("Passwords do not match.");
//             return;
//         }

//         // Database connection and registration
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passwordinfodatabase",
//                     "root", "Password123#@!!");
//             System.out.println(connection + " successfully connected");

//             String insertQuery = "INSERT INTO logininfo (username, password) VALUES (?, ?)";
//             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//             preparedStatement.setString(1, username);
//             preparedStatement.setString(2, password);

//             int rowsAffected = preparedStatement.executeUpdate();
//             if (rowsAffected > 0) {
//                 System.out.println("Registration successful!");
//             } else {
//                 System.out.println("Registration failed.");
//             }

//             connection.close(); // Close the connection when done
//         } catch (ClassNotFoundException e) {
//             e.printStackTrace();
//             System.out.println("Error: MySQL JDBC Driver not found.");
//         } catch (SQLException e) {
//             e.printStackTrace();
//             System.out.println("Error: Registration failed.");
//         }
//     }
// }
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import javax.swing.JOptionPane;

// public class Main {
//     public static void main(String[] args) {
//         performRegistration();
//     }

//     public static void performRegistration() {
//         Registrationframe registrationframe = new Registrationframe();
//         String username = registrationframe.usertextfeild1registration.getText();
//         char[] passwordchar = registrationframe.passwordfeildregistration.getPassword();
//         String password = new String(passwordchar);
//         char[] passwordagain = registrationframe.passwordfeild1registration.getPassword();
//         String confirmPassword = new String(passwordagain);

//         if (username == null || password == null || confirmPassword == null) {
//             JOptionPane.showMessageDialog(null, "Username, password, and confirm password cannot be empty.");
//             return;
//         }

        // if (password.equals(confirmPassword)) {
        // try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // try (Connection connection =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/Passwordinfodatabase",
        // "root", "Password123#@!!")) {
        // System.out.println(connection + " successfully connected");

        // String insertQuery = "INSERT INTO logininfo (username, password) VALUES (?,
        // ?)";
        // PreparedStatement preparedStatement =
        // connection.prepareStatement(insertQuery);
        // preparedStatement.setString(1, username);
        // preparedStatement.setString(2, password);
        // int rowsAffected = preparedStatement.executeUpdate();

        // if (rowsAffected > 0) {
        // JOptionPane.showMessageDialog(null, "Registration successful!");
        // } else {
        // JOptionPane.showMessageDialog(null, "Registration failed.");
        // }
        // }
        // } catch (ClassNotFoundException e) {
        // JOptionPane.showMessageDialog(null, "Error: MySQL JDBC Driver not found.");
        // } catch (SQLException e) {
        // JOptionPane.showMessageDialog(null, "Error: Registration failed.");
        // }
        // } else {
        // JOptionPane.showMessageDialog(null, "Passwords do not match.");
        // System.out.println("not working");
        // }
        // }
//         if (password.equals(confirmPassword)) {
//             try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passwordinfodatabase",
//                     "root", "Password123#@!!")) {
//                 System.out.println(connection + " successfully connected");

//                 String insertQuery = "INSERT INTO logininfo (username, password) VALUES (?, ?)";
//                 PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//                 preparedStatement.setString(1, username);
//                 preparedStatement.setString(2, password);
//                 int rowsAffected = preparedStatement.executeUpdate();

//                 if (rowsAffected > 0) {
//                     JOptionPane.showMessageDialog(null, "Registration successful!");
//                 } else {
//                     JOptionPane.showMessageDialog(null, "Registration failed.");
//                 }
//             } catch (SQLException e) {
//                 JOptionPane.showMessageDialog(null, "Error: Registration failed.");
//             }
//         } else {
//             JOptionPane.showMessageDialog(null, "Passwords do not match.");
//             System.out.println("not working");
//         }
//     }
// }
public class Main{
    public static void main(String[] args) {
        
    }
}