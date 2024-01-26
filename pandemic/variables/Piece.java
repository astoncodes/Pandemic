package upei.variables;

import java.util.ArrayList;

import upei.GameBoard.GameBoard;
import upei.cities.*;
import upei.player.Player;

/**
 * Represents a game piece on the pandemic board.
 */
public class Piece {

    // Fields to represent piece properties
    public Player owner;
    public GameBoard gameBoard;
    public City location;

    /**
     * Constructor for objects of class Piece.
     * Initializes a piece with a specified owner, game board, and initial location.
     */
    public Piece(Player newOwner, GameBoard pieceBoard, City curLocation) {
        owner = newOwner;
        gameBoard = pieceBoard;
        location = curLocation;
    }

    /**
     * Sets the location of the piece.
     * @param newLocation - the new location of the piece.
     */
    public void setLocation(City newLocation) {
        location = newLocation;
    }

    /**
     * Gets the current location of the piece.
     * @return the current location of the piece.
     */
    public City getLocation() {
        return location;
    }

    /**
     * Gets the neighboring connections of the current location.
     * @return an ArrayList of neighboring cities.
     */
    public ArrayList<City> getLocationConnections() {
        return location.getNeighbors();
    }
}
