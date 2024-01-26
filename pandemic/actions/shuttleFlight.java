package upei.actions;

import upei.cities.*;
import upei.variables.Variables;

// 'shuttleFlight' class represents an action to move from one city to another using a research station
public class shuttleFlight extends Action {

    // Fields to store the destination city ('moveTo') and the current city ('moveFrom')
    private City moveTo;
    private City moveFrom;

    // Constructor to initialize the 'shuttleFlight' object with source and destination cities
    public shuttleFlight(City moveFrom, City moveTo) {
        this.moveFrom = moveFrom;
        this.moveTo = moveTo;
    }

    // Method to check if the move to the destination city is a legal move based on the game rules
    public boolean isaLegalMove() {
        this.setMoveFrom(moveFrom);
        this.setMoveTo(moveTo);

        // Check if both the source and destination cities have research stations
        return Variables.CITY_WITH_RESEARCH_STATION.contains(moveFrom) && Variables.CITY_WITH_RESEARCH_STATION.contains(moveTo);
    }

    // Setter method to update the destination city
    public void setMoveTo(City moveTo) {
        this.moveTo = moveTo;
    }

    // Setter method to update the current city
    public void setMoveFrom(City moveFrom) {
        this.moveFrom = moveFrom;
    }
}
