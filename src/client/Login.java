package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Keno on 12/18/2016.
 */

public class Login extends  JFrame {
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private JPanel jTextPanel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JButton registerButton;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JTextField passwordtextField;


    public Login() {
        super("Login");

        /**
         * Login Button...
         */
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // FIXME: 12/18/2016
            }
        });


        loginButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("testing");
                    // Enter was pressed. Your code goes here.
                }
            }
        });


        /***
         * Call the register frame
         */
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Register();
            }
        });


        /**
         * If key pressed is Enter in the passwordtextField then
         * call the login checks..
         */
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // FIXME: 12/18/2016
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setContentPane(new Login().mainPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        loginFrame.setResizable(false);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
}
