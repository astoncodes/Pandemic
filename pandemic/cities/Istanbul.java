package upei.cities;

import upei.variables.Variables;

import java.util.ArrayList;

public class Istanbul extends City {

    /**
     * The constructor for Istanbul.
     * @param infectionLevel
     *    the default infection level of this city.
     */


    /**
     * Initialize  specifically for Istanbul.
     */
    public Istanbul (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "ISTANBUL";
        this.colour = "Black";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.algiers);
            this.neighbors.add(Variables.milan);
            this.neighbors.add(Variables.moscow);
            this.neighbors.add(Variables.cairo);
        }
    }
}
