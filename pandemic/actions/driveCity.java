package upei.actions;

import upei.cities.*;

// 'driveCity' class represents an action to move from one city to another in the game
public class driveCity extends Action {

    // Fields to store the destination city ('moveTo') and the current city ('moveFrom')
    private City moveTo;
    private City moveFrom;

    // Constructor to initialize the 'driveCity' object with source and destination cities
    public driveCity(City moveFrom, City moveTo) {
        this.moveFrom = moveFrom;
        this.moveTo = moveTo;
    }

    // Setter method to update the destination city
    public void setMoveTo(City moveTo) {
        this.moveTo = moveTo;
    }

    // Setter method to update the current city
    public void setMoveFrom(City moveFrom) {
        this.moveFrom = moveFrom;
    }

    // Method to check if the move to the destination city is a legal move based on the game rules
    public boolean isaLegalMove() {
        this.setMoveTo(moveTo);
        this.setMoveFrom(moveFrom);

        // Get the number of connections (neighbors) of the current city
        int numberConnections = moveFrom.getNeighbors().size();

        // Check if the destination city is one of the neighbors of the current city
        for (int i = 0; i < numberConnections; i++) {
            if (moveTo == (moveFrom.getNeighbors().get(i))) {
                // Return true if the destination city is a neighbor of the current city
                return true;
            }
        }

        // Return false if the destination city is not a neighbor of the current city
        return false;
    }
}
