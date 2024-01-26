package upei.cities;


import java.util.ArrayList;

import upei.variables.Variables;


public class Baghdad extends City {


    /**
     * The constructor for Baghdad.
     * @param infectionLevel
     *      the default infection level of this city.
     */

    /**
     * Initialize specifically for Baghdad.
     */
    public Baghdad (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.colour = "Black";
        this.name = "BAGHDAD";
    }

    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(0,Variables.cairo);
            this.neighbors.add(1,Variables.istanbul);

        }
    }
}
