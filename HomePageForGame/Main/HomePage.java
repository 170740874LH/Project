package Main;
import java.util.Scanner;

import javax.swing.JButton;

import java.awt.Color;

public class HomePage {
    private Scanner keyboard = new Scanner(System.in);
    private GameWindow window;
    private GamePanel panel;
    JButton gamePageButton;
    JButton LeaderBoardPageButton;

    

    public HomePage (GameWindow window, GamePanel panel) {
        this.window = window;
        this.panel = panel;
        panel.requestFocus();
        setUpButtons();
    }
    private void setUpButtons () {
        Button buttonFormat = new Button();
        //x,y,width,height,textInButton,textColour,backgroundColour,visible
        JButton gamePageButton = buttonFormat.setButton(50,250,200,200,"Games",Color.RED,Color.BLACK,true);
        JButton LeaderBoardPageButton = buttonFormat.setButton(300,250,200,200,"Leadboard",Color.RED,Color.BLACK,true);

        panel.add(gamePageButton);
        panel.add(LeaderBoardPageButton);
        panel.repaint();

    }
   
}
