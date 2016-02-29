package se.vonbargen.dennis.battleship.core.ships;

import se.vonbargen.dennis.battleship.core.map.components.Square;

/**
 * Created by Dennis on 2016-02-29.
 */
public abstract class Ship {

    private String name;
    private Square[] position;
    private boolean destroyed;

    public Ship(Square[] position) {

    }

    public Ship(Square[] position, String name) {

    }

    public boolean isDestroyed() {
        if (!destroyed) {
            // Calculate if destroyed
        }
        return destroyed;
    }
}
