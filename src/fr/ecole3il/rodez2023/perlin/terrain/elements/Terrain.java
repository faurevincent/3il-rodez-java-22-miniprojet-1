package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.terrain.exception.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

/**
 * Un terrain est défini par une altitude, une hydrometrie et une temperature
 */
public class Terrain {

    /**
     * Altitude du terrain
     */
    private double altitude;

    /**
     * Hydrometrie du terrain
     */
    private double hydrometrie;

    /**
     * Temperature du terrain
     */
    private double temperature;


    /**
     * Construit un terrain
     * @param altitude
     * @param hydrometrie
     * @param temperature
     */
    public Terrain(double altitude, double hydrometrie, double temperature) throws MauvaiseValeurException {
        if(hydrometrie > 1.0 || hydrometrie < 0.0 || temperature > 1.0
                || temperature < 0.0 || altitude < -1.0 || altitude > 1){
            throw new MauvaiseValeurException();
        }

        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
    }

    /**
     * @param dt Permet de determiner le type de terrain
     * @return le type du terrain
     */
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt){
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }

    /**
     * @return altitude
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * @return hydrometrie
     */
    public double getHydrometrie() {
        return hydrometrie;
    }

    /**
     * @return temperature
     */
    public double getTemperature() {
        return temperature;
    }
}
