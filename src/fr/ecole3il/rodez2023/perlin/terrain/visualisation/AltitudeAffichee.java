package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

/**
 * Enum décrivant le niveau d'altitude
 */
public enum AltitudeAffichee {

    BASSE, MOYENNE, ELEVE, FOND_MARRIN;

    /**
     * Determine le niveau d'altitude à partir de l'altitude
     * @param altitude
     * @return Le niveau d'altitude
     */
    public static AltitudeAffichee determinerAltitudeAffichee(double altitude){
        if(altitude < 0.0){
            return FOND_MARRIN;
        }
        if(altitude < 0.33){
            return BASSE;
        }
        if(altitude < 0.66){
            return MOYENNE;
        }
        return ELEVE;
    }
}
