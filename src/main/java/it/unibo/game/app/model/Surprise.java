package it.unibo.game.app.model;

import java.util.HashMap;
import java.util.Map;

import java.util.Random;

import it.unibo.game.app.api.Level;

public class Surprise {

    private final static int NUM_TOT_SURSPRISE = 12;
    private final static int EXTRA_LIFE = 1;
    private final static int EXPLOSIVE_BOMB = 2;
    private final static int DELETE_RANDOM_BRICKS = 3;
    private final static int REDUCE_SIZE_PAD = 4;
    private final static int ENLARGE_SIZE_PAD = 5;
    private final static int INCREASE_BALL_SPEED = 6;
    private final static int DECREASE_BALL_SPEED = 7;
    private final static int CHANGE_OBSTACLES = 8;
    private final static int INCREASE_SCORE = 9;
    private final static int ADD_BALLS = 10;
    private final static int CHANGE_ROW = 11;
    private final static int CHANGE_HARD = 12;

    private Map<Integer,Void> mappa;
    private Random random = new Random();
    private Level level;

    public Surprise(Level level) {
        this.level = level;
        mappa = new HashMap<>(Map.ofEntries(
            Map.entry(EXTRA_LIFE, this.extraLife()),
            Map.entry(EXPLOSIVE_BOMB, this.explosiveBomb()),
            Map.entry(DELETE_RANDOM_BRICKS, this.deleteRandomBricks()),
            Map.entry(REDUCE_SIZE_PAD, this.reduceSizePad()),
            Map.entry(ENLARGE_SIZE_PAD, this.enlargeSizePad()),
            Map.entry(INCREASE_BALL_SPEED, this.increaseBallSpeed()),
            Map.entry(DECREASE_BALL_SPEED, this.decreaseBallSpeed()),
            Map.entry(CHANGE_OBSTACLES, this.changeObstacles()),
            Map.entry(INCREASE_SCORE, this.increaseScore()),
            Map.entry(ADD_BALLS, this.addBalls()),
            Map.entry(CHANGE_ROW, this.changeRow()),
            Map.entry(CHANGE_HARD, this.changeHard())
            )
        );
    }

    //simone
    private Void extraLife() {
        return null;        
    }

    //simone
    private Void explosiveBomb() {
        return null;
    }

    //edoardo
    private Void deleteRandomBricks() {
        return null;
    }

    //edoardo
    private Void reduceSizePad() {
        return null;
    }

    //edoardo
    private Void enlargeSizePad() {
        return null;
    }

    //virginia
    private Void increaseBallSpeed() {
        return null;
    }

    //virginia
    private Void decreaseBallSpeed() {
        return null;
    }

    //virginia
    private Void changeObstacles() {
        return null;
    }

    //margherita
    private Void increaseScore() {
        return null;
    }

    //margherita
    private Void addBalls() {
        return null;
    }

    //chiara
    private Void changeRow() {
        return null;
    }

    //chiara
    private Void changeHard() {
        return null;
    }

    //simone
    public void chooseSurprise() {
        final int method = random.nextInt(NUM_TOT_SURSPRISE) + 1;
        this.mappa.get(method);
    }
    
}