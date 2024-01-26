package upei.actions;

import java.util.ArrayList;
import upei.cities.City;

/**
 * The directFlight class represents the action of performing a direct flight in the Pandemic board game.
 * Extends the Action class.
 */
public class directFlight extends Action {

    // City to which the direct flight is performed
    private City moveTo;

    // List of city cards in the player's hand
    private ArrayList<City> hand_cards;

    /**
     * Constructor for the directFlight class.
     * @param moveTo The city to which the direct flight is performed.
     * @param hand_cards The list of city cards in the player's hand.
     */
    public directFlight(City moveTo, ArrayList<City> hand_cards) {
        this.moveTo = moveTo;
        this.hand_cards = hand_cards;
    }

    /**
     * Setter for the city to which the direct flight is performed.
     * @param moveTo The city to which the direct flight is performed.
     */
    public void setMoveTo(City moveTo) {
        this.moveTo = moveTo;
    }

    /**
     * Setter for the list of city cards in the player's hand.
     * @param hand_cards The list of city cards in the player's hand.
     */
    public void setHand_cards(ArrayList<City> hand_cards) {
        this.hand_cards = hand_cards;
    }

    /**
     * Checks if performing a direct flight is a legal move.
     * @return True if the move is legal, false otherwise.
     */
    public boolean isaLegalMove() {
        this.setHand_cards(hand_cards);
        this.setMoveTo(moveTo);

        // Iterate through the player's hand cards to check if the city to which the direct flight is performed is present
        for (City c : hand_cards) {
            if (c.getName().equals(moveTo.getName()))
                return true;
        }

        return false;
    }
}
