package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Keno on 12/18/2016.
 */
public class Register extends JFrame{
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JButton registerButton;
    private JPanel labelPanel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPanel jTextPanel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JLabel confirmPasswordLabel;
    private JPasswordField confirmpasswordField;


    public Register() {
        JFrame registerFrame = new JFrame("Register");
        registerFrame.setContentPane(mainPanel);
        registerFrame.pack();
        registerFrame.setResizable(false);
        registerFrame.setVisible(true);


        /**
         * If key pressed is Enter in the confirmpasswordField then
         * call the registration checks..
         */
        confirmpasswordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // FIXME: 12/18/2016
                }
            }
        });

        /**
         * Do the checks...
         */
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
