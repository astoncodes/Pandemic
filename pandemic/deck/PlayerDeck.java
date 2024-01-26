package upei.deck;

import java.util.ArrayList;
import upei.cities.*;

/**
 * The PlayerDeck class represents the player deck in the Pandemic board game, which includes city cards and epidemic cards.
 */
public class PlayerDeck {

    // ArrayList to store the main player pile containing city and epidemic cards
    public ArrayList<Object> PlayerPile = new ArrayList<>();

    // ArrayList to store the discarded cards from the player deck
    public ArrayList<Object> PlayerDiscardPile = new ArrayList<>();

    // Flag indicating whether the next card drawn is an epidemic card
    public boolean isEpidemic = true;

    /**
     * Constructor for the PlayerDeck class. Initializes the PlayerPile with instances of various City classes and epidemic cards.
     */
    public PlayerDeck(){

        // Adding cities to the PlayerPile
        PlayerPile.add(new Madrid(0, 0, 0, 0, 0));
        PlayerPile.add(new London(0, 0, 0, 0, 0));
        PlayerPile.add(new Paris(0, 0, 0, 0, 0));
        PlayerPile.add(new Essen(0, 0, 0, 0, 0));
        PlayerPile.add(new Milan(0, 0, 0, 0, 0));

        // Adding an epidemic card
        PlayerPile.add(isEpidemic);

        PlayerPile.add(new Bogota(0, 0, 0, 0, 0));
        PlayerPile.add(new BuenosAires(0, 0, 0, 0, 0));
        PlayerPile.add(new SaoPaulo(0, 0, 0, 0, 0));
        PlayerPile.add(new Lagos(0, 0, 0, 0, 0));

        PlayerPile.add(new Algiers(0, 0, 0, 0, 0));
        PlayerPile.add(new Istanbul(0, 0, 0, 0, 0));
        PlayerPile.add(new Cairo(0, 0, 0, 0, 0));
        PlayerPile.add(new Moscow(0, 0, 0, 0, 0));
        PlayerPile.add(new Baghdad(0, 0, 0, 0, 0));

        // Adding an epidemic card
        PlayerPile.add(isEpidemic);

        // Adding an epidemic card
        PlayerPile.add(isEpidemic);

        PlayerPile.add(new HongKong(0, 0, 0, 0, 0));
        PlayerPile.add(new Beijing(0, 0, 0, 0, 0));
        PlayerPile.add(new Seoul(0, 0, 0, 0, 0));
        PlayerPile.add(new Tokyo(0, 0, 0, 0, 0));
        PlayerPile.add(new Osaka(0, 0, 0, 0, 0));
        PlayerPile.add(new Taipei(0, 0, 0, 0, 0));

        // Adding an epidemic card
        PlayerPile.add(isEpidemic);
    }

    /**
     * Getter for the PlayerPile.
     * @return The ArrayList representing the main player pile containing city and epidemic cards.
     */
    public ArrayList<Object> getPlayerPile() {
        return PlayerPile;
    }

    /**
     * Getter for the PlayerDiscardPile.
     * @return The ArrayList representing the discarded cards from the player deck.
     */
    public ArrayList<Object> getPlayerDiscardPile() {
        return PlayerDiscardPile;
    }
}
