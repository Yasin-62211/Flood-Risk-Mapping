package floodrisk;

public class FloodArea {

    String areaName;
    double rainfall;
    double elevation;
    double riverDistance;
    double drainage;
    int population;

    public FloodArea(String areaName, double rainfall, double elevation,
                     double riverDistance, double drainage, int population) {

        this.areaName = areaName;
        this.rainfall = rainfall;
        this.elevation = elevation;
        this.riverDistance = riverDistance;
        this.drainage = drainage;
        this.population = population;
    }
}