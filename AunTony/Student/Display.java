import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Display{
    JFrame window = new JFrame("Enter Data");
    JLabel lbUsername = new JLabel("Username:");
    JLabel lbPassword = new JLabel("Password:");
    JTextField fillname = new JTextField(10);
    JPasswordField filpassword = new JPasswordField(10);
    private final int height = 300;
    private final int width = 300;
    public Display(){
        window.setSize(width, height);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(lbUsername);
        window.add(lbPassword);

    }
}

class main{
    public static void main(String[] args) {
        new Display();
    }
}