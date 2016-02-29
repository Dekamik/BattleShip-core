package se.vonbargen.dennis.battleship.core.map.components;

import se.vonbargen.dennis.battleship.core.ships.Ship;

/**
 * Created by Dennis on 2016-02-29.
 */
public final class GameSquare extends Square {

    private Ship ship;

    public GameSquare(char row, int col, Ship ship) {
        super(row, col);
        this.ship = ship;
    }

    /**
     *
     * @return  Returns true if the square was occupied
     */
    @Override
    public boolean hit() {
        return false;
    }

    /**
     *
     * @return  Returns the ship that occupies this square, null if unoccupied.
     */
    public Ship occupiedBy() {
        return ship;
    }
}
