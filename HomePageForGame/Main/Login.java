package Main; 

import javax.swing.JLabel;
import java.awt.Color;
public class Login {
    private static GameWindow gameWindow;
    private static GamePanel gamePanel;

    private static JLabel userNameLabel;
    private static JLabel passwordLabel;



    public static boolean loginStage;
    private static String userName = "";
    private static String password = "";
        //true = username
        //false = password
        private static boolean loginProgress = true;

    private static String currentLogin = "";
    Login () {
        loginStage = true;
        gamePanel = new GamePanel(this);
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();

        Lable labelFormat = new Lable();
        //x, y, width, height, sizeOfText, text
        userNameLabel = new JLabel();
        passwordLabel = new JLabel();

            userNameLabel = labelFormat.setLable(50, 250, 250, 50, 28,"UserName = ");
            passwordLabel = labelFormat.setLable(400, 250, 250, 50, 28,"Password = ");
        
        gamePanel.add(userNameLabel);
        gamePanel.add(passwordLabel);

        gamePanel.repaint();
    }
    public static void displayCurrentLoginOnScreen () {

        
            if (loginProgress) {
                userNameLabel.setText("UserName = " + currentLogin);
            }
            else {
                passwordLabel.setText("Password = " + currentLogin);
            }

        gamePanel.repaint();

    }
    public static void validateLogin () {
        //checks login with database
        boolean validLogin;
        if (userName.equals("moo") && password.equals("baa")) {
            System.out.println("user " + userName + " password " + password);

            validLogin = true;
        }
        else {
            validLogin = false;
            System.out.println("user " + userName + " password " + password);

        }
        if (validLogin) {
            loginStage = false;
            gamePanel.remove(userNameLabel);
            gamePanel.remove(passwordLabel);
            gamePanel.repaint();
            HomePage game = new HomePage(gameWindow,gamePanel); 
        }
        else {
            userNameLabel.setText("UserName = ");
            passwordLabel.setText("Password = ");
            gamePanel.repaint();
            gamePanel.setBackground(Color.RED);

            loginProgress = true;
            
        }
    }

    public static void giveLoginCharacter(char key) {
        gamePanel.setBackground(null);
        //10 = enter
        if ((int) key == 10 ) {
            if (loginProgress) {
                userName = currentLogin;

                currentLogin = "";


                loginProgress = false;
            }
            else {
                password = currentLogin;
                currentLogin = "";
                validateLogin();
            }
        }
        else {
            currentLogin = currentLogin + key;
            displayCurrentLoginOnScreen();

        }
    }
}
