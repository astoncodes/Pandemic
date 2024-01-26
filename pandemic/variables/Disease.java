package upei.variables;

/**
 * Represents a disease in the pandemic board game.
 */
public class Disease {

    // Fields to represent disease properties
    public String colour;
    public boolean cured;
    public boolean eliminated;

    /**
     * Constructor for objects of class Disease.
     * Initializes a disease with a specified color, not cured, and not eliminated.
     */
    public Disease(String diseaseColour) {
        colour = diseaseColour;
        cured = false;
        eliminated = false;
    }

    // GET-SET METHODS

    /**
     * Gets the cure status of the disease.
     * @return true if the disease is cured, false otherwise.
     */
    public boolean getCured() {
        return cured;
    }

    /**
     * Sets the cure status of the disease.
     * @param toSet - true if the disease is cured, false otherwise.
     */
    public void setCured(boolean toSet) {
        cured = toSet;
    }

    /**
     * Sets the color of the disease.
     * @param newColour - the new color of the disease.
     */
    public void setColour(String newColour) {
        colour = newColour;
    }

    /**
     * Gets the color of the disease.
     * @return the color of the disease.
     */
    public String getColour() {
        return colour;
    }
}
