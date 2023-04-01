package it.unibo.game;

import it.unibo.game.app.api.AppController;
import it.unibo.game.app.controller.ControllerImpl;

/**
 * class that starts the application.
 */
public final class LaunchApp {
  private LaunchApp() {
  }

  /**
   * Runs the application.
   *
   * @param args ignored
   * @throws ClassNotFoundException    if the fetches class does not exist
   * @throws NoSuchMethodException     if the 0-ary constructor do not exist
   * @throws InvocationTargetException if the constructor throws exceptions
   * @throws InstantiationException    if the constructor throws exceptions
   * @throws IllegalAccessException    in case of reflection issues
   * @throws IllegalArgumentException  in case of reflection issues
   */
  public static void main(final String... args) {
    final AppController app = new ControllerImpl();
    app.setModel();
    app.setView();
    app.setGameEngine();
  }
}
