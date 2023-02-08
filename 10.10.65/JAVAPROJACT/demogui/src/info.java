import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class info {
    JFrame window = new JFrame("information");
    JLabel textinfo = new JLabel("THAWITCHAI");
    JButton btnClose = new JButton("Close");
    JLabel textinfo2 = new JLabel("OK");

    public void info(){
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setLayout(new GridLayout(2, 1));
        window.setSize(200, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(textinfo);
        window.add(btnClose);
        // window.setLayout(new FlowLayout());
        btnClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // System.out.println("fuck fuck");
                window.dispose();
            }
            
        });
    }
}
