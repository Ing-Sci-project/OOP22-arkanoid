package it.unibo.game.app.api;

import it.unibo.game.app.api.Side;

/**
 * Interface that manages the change of direction of MovingObject.
 */
public interface Physics {
  /**
   * 
   * @param side side of collision.
   */
  void changeDirection(Side side);

  /**
   * 
   * @return MovingObject direction.
   */
  Direction getDir();

}
