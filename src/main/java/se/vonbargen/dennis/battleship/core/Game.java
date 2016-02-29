package se.vonbargen.dennis.battleship.core;

import se.vonbargen.dennis.battleship.core.map.components.Square;

/**
 * Created by Dennis on 2016-02-29.
 *
 * This class represents a game of Battleship.
 * Acts as an interface for a basic implementation of the game.
 */
public final class Game {

    private Player currentPlayer;
    private Player currentEnemy;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.currentEnemy = player2;
    }

    public Square[][] getAvailableMoves() {
        // Return enemy's hitmap
        return null;
    }

    public boolean fire(char row, int col) {
        // hit enemy at position
        return false;
    }

    public void switchTurn() {
        // Switch turns
    }
}
