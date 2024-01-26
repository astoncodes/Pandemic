package upei.cities;


import java.util.ArrayList;

import upei.variables.Variables;


public class Bogota extends City {


    /**
     * The constructor for Bogota.
     * @param infectionLevel
     *      the default infection level of this city.
     */

    /**
     * Initialize specifically for Bogota.
     */
    public Bogota(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "BOGOTA";
        this.colour = "Blue";

    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.saopaulo);
            this.neighbors.add(Variables.buenosaires);

        }
    }
}
