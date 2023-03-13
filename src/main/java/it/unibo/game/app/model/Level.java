package it.unibo.game.app.model;

import it.unibo.game.Pair;

/*Questa classe astratta dichiara variabili e definisce metodi in comune ai vari livelli */

public abstract class Level {

    private final static int INITIAL_LIVES=3;
    protected int lives = INITIAL_LIVES;

    /*Definire delle costanti per ogni livello che definiscno queste variabili */
    protected int normalBricksFirstRound;
    protected int surpriseBricksFirstRound;

    protected int normalBricksSecondRound;
    protected int surpriseBricksSecondRound;

    protected int normalBricksThirdRound;
    protected int surpriseBricksThirdRound;

    protected AbstractRound currentRound;
    protected SizeCalculation sizeCalc;

    protected Pair<Integer,Integer> frameSize;
    protected int numRoundPassed;

    /*Posizionano gli oggetti (pad,pallina e blocchi) all'interno di ciascun round*/
    protected abstract void setFirstRound();
    protected abstract void setSecondRound();
    protected abstract void setThirdRound();

    public Level (int numRoundP) {
        this.numRoundPassed = numRoundP;
    }
    protected int increaseLife() {
        return this.lives++;
    }
    protected int decreaseLife() {
        return this.lives--;
    }
    protected boolean isAlive() {
        return this.lives > 0 ? true : false;
    }
    
    public AbstractRound getRound() {
        return this.currentRound;
    }
    public int getNumRoundPassed() {
        return this.numRoundPassed;
    }
}
