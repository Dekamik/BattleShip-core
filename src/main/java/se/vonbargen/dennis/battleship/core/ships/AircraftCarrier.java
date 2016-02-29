package se.vonbargen.dennis.battleship.core.ships;

import se.vonbargen.dennis.battleship.core.map.components.Square;

/**
 * Created by Dennis on 2016-02-29.
 */
public class AircraftCarrier extends Ship {
    public AircraftCarrier(Square[] position) {
        super(position);
    }

    public AircraftCarrier(Square[] position, String name) {
        super(position, name);
    }
}
