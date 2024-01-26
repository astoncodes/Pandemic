package upei.actions;

import upei.cities.City;

// 'treatDisease' class represents an action to treat a disease in a city in the game
public class treatDisease extends Action {

    // Fields to store the location (city) and the color of the disease to be treated
    private City location;
    private String colour;

    // Constructor to initialize the 'treatDisease' object with a location and a color
    public treatDisease(City location, String colour) {
        this.location = location;
        this.colour = colour;
    }

    // Method to check if treating a disease is a legal move based on the game rules
    public boolean isaLegalMove() {
        this.setColour(colour);
        this.setLocation(location);

        // Check if there are cubes of the specified color in the current city
        if (location.getCubeColour(colour) > 0) {
            System.out.println("There are some cubes of that colour");
            return true;
        } else {
            System.out.println("No cubes of that colour");
            return false;
        }
    }

    // Setter method to update the location (city)
    public void setLocation(City location) {
        this.location = location;
    }

    // Getter method to retrieve the color of the disease
    public String getColour() {
        return colour;
    }

    // Setter method to update the color of the disease
    public void setColour(String colour) {
        this.colour = colour;
    }
}
