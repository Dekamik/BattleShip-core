package se.vonbargen.dennis.battleship.core.map.components;

import se.vonbargen.dennis.battleship.core.ships.Ship;

/**
 * Created by Dennis on 2016-02-29.
 *
 * A representation of a single tile in the map
 */
public class Square {

    private char row;
    private int col;
    private boolean hit;

    public Square(char row, int col) {
        this.row = row;
        this.col = col;
        this.hit = false;
    }

    public Square(char row, int col, boolean hit) {
        this.row = row;
        this.col = col;
        this.hit = hit;
    }

    public char getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isHit() {
        return hit;
    }

    public boolean hit() {
        hit = true;
        return hit;
    }
}
