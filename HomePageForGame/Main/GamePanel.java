package Main;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Inputs.KeyboardInputs;

import java.awt.Graphics;


public class GamePanel extends JPanel{
    Login loginPage;
    public GamePanel (Login game) {
        this.loginPage = loginPage;
        setLayout(null);
        addKeyListener(new KeyboardInputs(loginPage));
    }
   
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
     
        
    }
}
