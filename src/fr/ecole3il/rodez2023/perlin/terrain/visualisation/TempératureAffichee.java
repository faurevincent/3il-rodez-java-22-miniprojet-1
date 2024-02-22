package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

/**
 * Enum decrivant le niveau de temperature
 */
public enum TempératureAffichee {

    FROID, TEMPERE, CHAUD;

    /**
     * Determine le niveau d'hydrometrie
     * @param temperature
     * @return le niveau d'hydrometrie
     */
    public static TempératureAffichee determinerTemperatureAffichee(double temperature){
        if(temperature < 0.33){
            return FROID;
        }
        if(temperature < 0.66){
            return TEMPERE;
        }
        return CHAUD;
    }
}
