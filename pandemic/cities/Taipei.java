package upei.cities;

import java.util.ArrayList;

import upei.variables.Variables;


public class Taipei extends City {
    /**
     * The constructor for Taipei.
     * @param infectionLevel
     *    the default infection level of this city.
     */
    public Taipei(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "TAIPEI";
        this.colour = "Red";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.hongkong);

            this.neighbors.add(Variables.osaka);

        }
    }
}