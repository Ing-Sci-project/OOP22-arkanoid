package it.unibo.game.app.view.jswing.implementation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Implements the panel for GameOver view.
 */
public class GameOver extends AbstractView {

  /**
   * Constructor of the class.
   * 
   * @param uiCtrl is the controller that will change the views
   */
  public GameOver(final UIControllerImpl uiCtrl) {
    super(uiCtrl, "GAME OVER", new CustomBtn(30, "Save"), new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent arg0) {
        new SaveScore(uiCtrl);
      }
    });
  }
}
