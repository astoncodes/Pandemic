package upei.cities;

import java.util.ArrayList;
import java.math.*;

import upei.variables.*;

/*
 * Represents one of the cities on the pandemic board game world map.
 */
public class City {

    // Fields to represent city properties
    protected String name;
    protected int infectionLevel;
    protected ArrayList<City> neighbors;
    protected String colour;
    protected int redCubes;
    protected int blueCubes;
    protected int blackCubes;
    protected int yellowCubes;
    protected int distance;
    protected boolean hasOutbreak;

    // Default constructor
    public City() { }

    /**
     * Constructor for objects of class City.
     * Initializes a city with cube counts and infection level.
     */
    public City(int redCubes, int blueCubes, int blackCubes, int yellowCubes, int infectionLevel) {
        this.redCubes = redCubes;
        this.yellowCubes = yellowCubes;
        this.blueCubes = blueCubes;
        this.blackCubes = blackCubes;
        this.infectionLevel = infectionLevel;
    }

    // Getter and setter methods for various properties

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public int getInfectionLevel() { return infectionLevel; }

    public void setInfectionLevel(int infectionLevel) {
        this.infectionLevel = infectionLevel;
    }

    public int getDistance() { return distance; }

    public void setDistance(int newDistance) { distance = newDistance; }

    public ArrayList<City> getNeighbors() { return neighbors; }

    // Returns the highest count of a cube of any colour in the city
    public int getMaxCube() {
        return Math.max(Math.max(this.redCubes, this.blueCubes), Math.max(this.blackCubes, this.yellowCubes));
    }

    // Remove a cube when a player chooses to cure a disease in a specific city
    public void removeCube(String cubeColour) {
        if (cubeColour.equals("Red") && redCubes > 0) {
            redCubes = redCubes - 1;
        } else if (cubeColour.equals("Blue") && blueCubes > 0) {
            blueCubes = blueCubes - 1;
        } else if (cubeColour.equals("Yellow") && yellowCubes > 0) {
            yellowCubes = yellowCubes - 1;
        } else if (cubeColour.equals("Black") && blackCubes > 0) {
            blackCubes = blackCubes - 1;
        }
    }

    // Add one cube when an infection occurs
    // Returns true if an outbreak occurs
    public boolean addCube(String cubeColour) {
        if (cubeColour.equals("Red")) {
            redCubes = redCubes + 1;
        } else if (cubeColour.equals("Blue")) {
            blueCubes = blueCubes + 1;
        } else if (cubeColour.equals("Yellow")) {
            yellowCubes = yellowCubes + 1;
        } else if (cubeColour.equals("Black")) {
            blackCubes = blackCubes + 1;
        }
        return checkOutBreaks();
    }

    // Function for a valid outbreak, if the infection level surpasses the max limit (3 cubes), ignore it
    public boolean checkOutBreaks() {
        boolean toReturn = false;
        if (redCubes == 4) {
            toReturn = true;
            redCubes = 3;
        } else if (blueCubes == 4) {
            toReturn = true;
            blueCubes = 3;
        } else if (yellowCubes == 4) {
            toReturn = true;
            yellowCubes = 3;
        } else if (blackCubes == 4) {
            toReturn = true;
            blackCubes = 3;
        }
        return toReturn;
    }

    // Returns the count of cubes of a specific colour in the city
    public int getCubeColour(String cubeColour) {
        if (cubeColour.equals("Red")) {
            return redCubes;
        } else if (cubeColour.equals("Blue")) {
            return blueCubes;
        } else if (cubeColour.equals("Yellow")) {
            return yellowCubes;
        } else if (cubeColour.equals("Black")) {
            return blackCubes;
        }
        return 0;
    }
}
