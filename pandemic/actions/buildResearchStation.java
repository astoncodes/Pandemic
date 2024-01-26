package upei.actions;

import upei.variables.Variables;
import java.util.ArrayList;
import upei.cities.*;

/**
 * The buildResearchStation class represents the action of building a research station in the Pandemic board game.
 * Extends the Action class.
 */
public class buildResearchStation extends Action {

    // City where the research station is to be built
    private City cityToResearchStation;

    // List of city cards in the player's hand
    private ArrayList<City> hand_cards;

    /**
     * Constructor for the buildResearchStation class.
     * @param location The city where the research station is to be built.
     * @param hand_cards The list of city cards in the player's hand.
     */
    public buildResearchStation(City location, ArrayList<City> hand_cards) {
        this.cityToResearchStation = location;
        this.hand_cards = hand_cards;
    }

    /**
     * Checks if building a research station is a legal move.
     * @return True if the move is legal, false otherwise.
     */
    public boolean isaLegalMove() {
        this.setCityToResearchStation(cityToResearchStation);
        this.setHand_cards(hand_cards);

        // Iterate through the player's hand cards to check if the specified city is present and doesn't already have a research station
        for (City c : hand_cards) {
            if (c.getName().equals(cityToResearchStation.getName()) && !Variables.CITY_WITH_RESEARCH_STATION.contains(c))
                return true;
        }

        return false;
    }

    /**
     * Setter for the city where the research station is to be built.
     * @param cityToResearchStation The city where the research station is to be built.
     */
    public void setCityToResearchStation(City cityToResearchStation) {
        this.cityToResearchStation = cityToResearchStation;
    }

    /**
     * Setter for the list of city cards in the player's hand.
     * @param hand_cards The list of city cards in the player's hand.
     */
    public void setHand_cards(ArrayList<City> hand_cards) {
        this.hand_cards = hand_cards;
    }
}
