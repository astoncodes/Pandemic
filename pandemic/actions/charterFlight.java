package upei.actions;

import java.util.ArrayList;
import upei.cities.City;

/**
 * The charterFlight class represents the action of performing a charter flight in the Pandemic board game.
 * Extends the Action class.
 */
public class charterFlight extends Action {

    // City from which the charter flight is performed
    private City moveFrom;

    // List of city cards in the player's hand
    private ArrayList<City> hand_cards;

    /**
     * Constructor for the charterFlight class.
     * @param moveFrom The city from which the charter flight is performed.
     * @param hand_cards The list of city cards in the player's hand.
     */
    public charterFlight(City moveFrom, ArrayList<City> hand_cards) {
        this.moveFrom = moveFrom;
        this.hand_cards = hand_cards;
    }

    /**
     * Setter for the city from which the charter flight is performed.
     * @param moveFrom The city from which the charter flight is performed.
     */
    public void setMoveFrom(City moveFrom) {
        this.moveFrom = moveFrom;
    }

    /**
     * Setter for the list of city cards in the player's hand.
     * @param hand_cards The list of city cards in the player's hand.
     */
    public void setHand_cards(ArrayList<City> hand_cards) {
        this.hand_cards = hand_cards;
    }

    /**
     * Checks if performing a charter flight is a legal move.
     * @return True if the move is legal, false otherwise.
     */
    public boolean isaLegalMove() {
        this.setHand_cards(hand_cards);
        this.setMoveFrom(moveFrom);

        // Iterate through the player's hand cards to check if the city from which the charter flight is performed is present
        for (City c : hand_cards) {
            if (c.getName().equals(moveFrom.getName()))
                return true;
        }

        return false;
    }
}
