package it.unibo.game.app.view.jswing.impleentation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameOver extends JPanel{
    
    private UIControllerImpl uiControllerImpl;

    public GameOver(UIControllerImpl uiCtrl) {
        this.uiControllerImpl = uiCtrl;
        JLabel gameOver = new JLabel("GAME OVER");
        JButton tryAgain = new CustomBtn(30,"Try Again");
        JButton quit = new CustomBtn(30,"Quit");
        JButton menu = new CustomBtn(30,"Start Menù");
        JPanel title = new JPanel();
        JPanel buttons = new JPanel();

        this.setLayout(new BorderLayout());
        buttons.setLayout(new GridLayout(3,1,0,1));
        gameOver.setFont(new Font("Serif",  Font.BOLD, 60));
        gameOver.setForeground(Color.WHITE);

        title.add(gameOver);
        buttons.add(tryAgain);
        buttons.add(menu);
        buttons.add(quit);
        title.setBackground(Color.BLACK);
        buttons.setBackground(Color.BLACK);
        this.setBackground(Color.BLACK);

        this.add(title, BorderLayout.NORTH);
        this.add(buttons, BorderLayout.SOUTH);

        tryAgain.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        menu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        quit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });

    }
}