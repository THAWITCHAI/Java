import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login implements ActionListener {
    JFrame window = new JFrame("Login");
    final JLabel lbUsername = new JLabel("Username:");
    final JLabel lbPassword = new JLabel("Password:");
    JButton btnLogin = new JButton("Login");
    JButton btnClose = new JButton("Close");
    JTextField txtUsername = new JTextField(10);
    JPasswordField txtPassword = new JPasswordField(10);
    public login(){
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(250, 300);
        window.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //-- Username --
        gbc.gridy = 1;
        gbc.gridx = 1;
        window.add(lbUsername,gbc);
        gbc.gridy = 1;
        gbc.gridx = 2;
        window.add(txtUsername,gbc);
        //-- Password --
        gbc.gridy = 2;
        gbc.gridx = 1;
        window.add(lbPassword,gbc);
        gbc.gridy = 2;
        gbc.gridx = 2;
        window.add(txtPassword,gbc);
        //-- Button --
        gbc.gridy = 3;
        gbc.gridx = 1;
        window.add(btnLogin,gbc);
        gbc.gridy = 3;
        gbc.gridx = 2;
        window.add(btnClose,gbc);
        btnLogin.addActionListener(this);
        btnClose.addActionListener(this);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==btnLogin){
            System.out.println("Login");
            window.dispose();
            System.out.println("USER NAME >>> "+txtUsername.getText());
            System.out.print("PASSWORD >>> ");
            System.out.println(txtPassword.getPassword());
        }else if(e.getSource()==btnClose){
            System.out.println("Clsoe");
            window.dispose();
        }
    }
    
}
