package upei.cities;

import java.util.ArrayList;

import upei.variables.Variables;

public class Paris extends City {
    /**
     * The constructor for Paris.
     * @param infectionLevel
     *    the default infection level of this city.
     */
    public Paris(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "PARIS";
        this.colour = "Blue";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.madrid);
            this.neighbors.add(Variables.london);
            this.neighbors.add(Variables.essen);
            this.neighbors.add(Variables.milan);
            this.neighbors.add(Variables.algiers);
        }
    }
}