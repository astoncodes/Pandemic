package upei.cities;

import java.util.ArrayList;

import upei.variables.Variables;

public class Madrid extends City {
    /**
     * The constructor for  Madrid.
     * @param infectionLevel
     *      the default infection level of this city.
     */
    public Madrid(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "MADRID";
        this.colour = "Blue";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.saopaulo);

            this.neighbors.add(Variables.london);
            this.neighbors.add(Variables.paris);
            this.neighbors.add(Variables.algiers);
        }
    }
}
