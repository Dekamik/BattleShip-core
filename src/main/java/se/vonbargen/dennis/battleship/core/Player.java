package se.vonbargen.dennis.battleship.core;

import se.vonbargen.dennis.battleship.core.map.BattleMap;
import se.vonbargen.dennis.battleship.core.map.components.Square;

/**
 * Created by Dennis on 2016-02-29.
 */
public final class Player {

    private final String name;
    private int score;
    private BattleMap map;

    public Player(String name, BattleMap map) {
        this.name = name;
        this.map = map;
        this.score = 0;
    }

    public Square[][] getHitMap() {
        // return hitmap
        return null;
    }

    public boolean hit(char row, int col) {
        // Hit player at position
        return false;
    }

    public boolean hasLost() {
        // Check if player has lost
        return false;
    }

    public void incrementScore() {
        // Increment score
    }

    public int getScore() {
        return score;
    }
}
