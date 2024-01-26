package upei.actions;

import java.util.ArrayList;
import upei.cities.City;
import upei.variables.Variables;

// 'discoverCure' class represents an action to discover a cure in the game
public class discoverCure extends Action {

    // Fields to store the current city, hand cards, and color of the disease
    private City current_city;
    private ArrayList<City> hand_cards;
    private String colorOfDisease;

    // Constructor to initialize the 'discoverCure' object
    public discoverCure(City current_city, ArrayList<City> hand_cards, String colorOfDisease) {
        this.current_city = current_city;
        this.hand_cards = hand_cards;
        this.colorOfDisease = colorOfDisease;
    }

    // Setter methods to update the current city, hand cards, and color of the disease
    public void setCurrent_city(City current_city) {this.current_city = current_city;}
    public void setHand_cards(ArrayList<City> hand_cards) {this.hand_cards = hand_cards;}
    public void setColorOfDisease(String colorOfDisease) {this.colorOfDisease = colorOfDisease;}

    // Method to check if discovering a cure is a legal move based on the game rules
    public boolean isaLegalMove(int i) {
        this.setColorOfDisease(colorOfDisease);
        this.setCurrent_city(current_city);
        this.setHand_cards(hand_cards);

        // Check if the current city has a research station
        if (Variables.CITY_WITH_RESEARCH_STATION.contains(current_city)) {
            System.out.print("sdsdssdsds adasdas asdasdasdas");

            // Count the number of cards of each color in the hand
            int red = 0;
            int black = 0;
            int yellow = 0;
            int blue = 0;

            for (City c : hand_cards) {
                String tmp = c.getName();
                if (tmp.equals("Blue"))
                    blue += 1;
                if (tmp.equals("Red"))
                    red += 1;
                if (tmp.equals("Black"))
                    black += 1;
                if (tmp.equals("Yellow"))
                    yellow += 1;
            }

            // Check if there are enough cards of the specified color to discover a cure
            switch(this.colorOfDisease) {
                case "Blue"  : return (blue >= 4 - i);
                case "Black" : return (black >= 4 - i);
                case "Yellow": return (yellow >= 4 - i);
                case "Red"   : return (red >= 4 - i);
            }
        }

        // Return false if the conditions are not met
        return false;
    }
}
