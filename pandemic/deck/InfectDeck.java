package upei.deck;

import java.util.ArrayList;
import upei.cities.*;

/**
 * The InfectDeck class represents the deck of cities used for the infection phase in the Pandemic board game.
 */
public class InfectDeck {

    // ArrayList to store the main Infect Pile of cities
    public ArrayList<City> InfectPile = new ArrayList<City>();

    // ArrayList to store the discarded cities during the infection phase
    public ArrayList<City> InfectDiscardPile = new ArrayList<City>();

    /**
     * Constructor for the InfectDeck class. Initializes the InfectPile with instances of various City classes.
     */
    public InfectDeck(){

        // Adding cities to the InfectPile
        InfectPile.add(new Madrid(0, 0, 0, 0, 0));
        InfectPile.add(new London(0, 0, 0, 0, 0));
        InfectPile.add(new Paris(0, 0, 0, 0, 0));
        InfectPile.add(new Essen(0, 0, 0, 0, 0));
        InfectPile.add(new Milan(0, 0, 0, 0, 0));
        InfectPile.add(new Bogota(0, 0, 0, 0, 0));
        InfectPile.add(new BuenosAires(0, 0, 0, 0, 0));
        InfectPile.add(new SaoPaulo(0, 0, 0, 0, 0));
        InfectPile.add(new Lagos(0, 0, 0, 0, 0));
        InfectPile.add(new Algiers(0, 0, 0, 0, 0));
        InfectPile.add(new Istanbul(0, 0, 0, 0, 0));
        InfectPile.add(new Cairo(0, 0, 0, 0, 0));
        InfectPile.add(new Moscow(0, 0, 0, 0, 0));
        InfectPile.add(new Baghdad(0, 0, 0, 0, 0));
        InfectPile.add(new HongKong(0, 0, 0, 0, 0));
        InfectPile.add(new Beijing(0, 0, 0, 0, 0));
        InfectPile.add(new Seoul(0, 0, 0, 0, 0));
        InfectPile.add(new Tokyo(0, 0, 0, 0, 0));
        InfectPile.add(new Osaka(0, 0, 0, 0, 0));
        InfectPile.add(new Taipei(0, 0, 0, 0, 0));

    }

    /**
     * Getter for the InfectPile.
     * @return The ArrayList representing the main Infect Pile of cities.
     */
    public ArrayList<City> getInfectPile() {
        return InfectPile;
    }

    /**
     * Getter for the InfectDiscardPile.
     * @return The ArrayList representing the discarded cities during the infection phase.
     */
    public ArrayList<City> getInfectDiscardPile() {
        return InfectDiscardPile;
    }
}
