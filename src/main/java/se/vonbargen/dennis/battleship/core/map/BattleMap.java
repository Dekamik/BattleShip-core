package se.vonbargen.dennis.battleship.core.map;

import se.vonbargen.dennis.battleship.core.map.components.GameSquare;
import se.vonbargen.dennis.battleship.core.map.components.Square;
import se.vonbargen.dennis.battleship.core.ships.Ship;

/**
 * Created by Dennis on 2016-02-29.
 *
 * A representation of a players deck
 */
public final class BattleMap {

    private int rows;
    private int cols;
    private int losses;
    private Ship[] ships;
    private GameSquare[][] map;

    public BattleMap(int rows, int cols, Ship[] ships, GameSquare[][] map) {
        this.rows = rows;
        this.cols = cols;
        this.ships = ships;
        this.map = map;
        this.losses = 0;
    }

    public Square findSquare(char row, int col) {
        return null;
    }

    /**
     *
     * @return  Returns true if the square was occupied
     */
    public boolean hit(char row, int col) {
        // Destroy square
        return false;
    }

    /**
     *
     * @return
     */
    public boolean hasLost() {
        // Check if all ships are destroyed
        return false;
    }

    /**
     *
     * @return
     */
    public Square[][] getHitMap() {
        int rowLength = map.length;
        int colLength = map[0].length;
        Square[][] hitMap = new Square[rowLength][colLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                GameSquare current = map[i][j];
                // Creates a new map in order not to reveal enemys ships
                hitMap[i][j] = new Square(current.getRow(), current.getCol(), current.isHit());
            }
        }
        return map;
    }
}
