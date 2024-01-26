package upei.cities;

import java.util.ArrayList;

import upei.variables.Variables;


public class Tokyo extends City {
    /**
     * The constructor for Tokyo.
     * @param infectionLevel
     *     the default infection level of this city.
     */
    public Tokyo(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "TOKYO";
        this.colour = "Red";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.seoul);

            this.neighbors.add(Variables.osaka);

        }
    }
}
