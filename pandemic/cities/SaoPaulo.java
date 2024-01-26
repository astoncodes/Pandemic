package upei.cities;

import java.util.ArrayList;

import upei.variables.Variables;


public class SaoPaulo extends City {
    /**
     * The constructor for SaoPaulo.
     * @param infectionLevel
     *     the default infection level of this city.
     */
    public SaoPaulo(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
        super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
        this.name = "SAO_PAULO";
        this.colour = "Yellow";
    }
    public void setNeighbors(boolean action) {
        if (action) {
            // build the geographical neighbors
            this.neighbors = new ArrayList<City>();
            this.neighbors.add(Variables.buenosaires);
            this.neighbors.add(Variables.bogota);
            this.neighbors.add(Variables.madrid);
            this.neighbors.add(Variables.lagos);
        }
    }
}