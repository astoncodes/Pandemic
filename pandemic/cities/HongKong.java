package upei.cities;

import java.util.ArrayList;

import upei.variables.Variables;

public class HongKong extends City {

    /**
     * The constructor for
     * @param infectionLevel
     *   the default infection level of this city.
     */

    /**
     * Initialize specifically for HongKong.
     */
    public HongKong (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "HONG_KONG";
        this.colour = "Red";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();

            this.neighbors.add(Variables.taipei);

        }
    }
}
