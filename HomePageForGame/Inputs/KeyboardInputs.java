package Inputs;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import Main.Login;

/**
 * KeyboardInputs
 */
public class KeyboardInputs implements KeyListener{

    private Login loginPage;

    public KeyboardInputs (Login loginPage) {
        this.loginPage = loginPage;
    }
    @Override
    public void keyPressed(KeyEvent e) {

              
        int keyCode = e.getKeyCode();
        if ((keyCode+32) >= 97 && (keyCode+32) <= 122 ) {
            keyCode += 32;
        }


        if (Login.loginStage) {
            
            Login.giveLoginCharacter(((char) keyCode));
        }
       
    
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    
}