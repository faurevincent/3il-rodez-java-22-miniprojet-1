package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

/**
 * Enum décrivant le niveau d'hydrometrie
 */
public enum HydrometrieAffichee {

    SEC, MOYEN, HUMIDE;

    /**
     * Determine le niveau d'hydrometrie
     * @param hydrometrie
     * @return le niveau d'hydrometrie
     */
    public static HydrometrieAffichee determinerHydrometrieAffichee(double hydrometrie){
        if(hydrometrie < 0.33){
            return SEC;
        }
        if(hydrometrie < 0.66){
            return MOYEN;
        }
        return HUMIDE;
    }
}
