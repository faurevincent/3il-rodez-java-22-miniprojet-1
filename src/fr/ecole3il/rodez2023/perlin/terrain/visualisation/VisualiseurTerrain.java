package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

/**
 * Permet de récuperer les données pour visualiser un terrain de la carte
 */
public class VisualiseurTerrain {

    /**
     * Pour determiner le type de terrain
     */
    private DetermineurTerrain determineurTerrain;

    /**
     * Carte sur laquelle se trouve le terrain à visualiser
     */
    private Carte carte;

    /**
     * Constructeur du Visualiseur
     * @param determineurTerrain
     * @param carte
     */
    public VisualiseurTerrain(DetermineurTerrain determineurTerrain, Carte carte) {
        this.carte = carte;
        this.determineurTerrain = determineurTerrain;
    }

    /**
     * Determine le type de terrain
     * @param x indice x du terrain dans la carte
     * @param y indice y du terrain dans la cate
     * @return le type du terrain
     */
    public TypeTerrain getTypeTerrain(int x, int y){
        Terrain terrain = carte.getTerrain(x, y);
        return terrain.getTypeTerrain(determineurTerrain);
    }

    /**
     * Recupere le niveau de temperature du terrain
     * @param x indice x du terrain dans la carte
     * @param y indice y du terrain dans la cate
     * @return le niveau de temperature
     */
    public TempératureAffichee getTemperature(int x, int y){
        return TempératureAffichee.determinerTemperatureAffichee(carte.getTerrain(x, y).getTemperature());
    }

    /**
     * Determine le niveau d'altitude du terrain
     * @param x indice x du terrain dans la carte
     * @param y indice y du terrain dans la cate
     * @return le niveau d'altitude
     */
    public AltitudeAffichee getAltitude(int x, int y){
        return AltitudeAffichee.determinerAltitudeAffichee(carte.getTerrain(x, y).getAltitude());
    }

    /**
     * Determine le niveau d'hydrometrie du terrain
     * @param x indice x du terrain dans la carte
     * @param y indice y du terrain dans la cate
     * @return le niveau d'hydrometrie
     */
    public HydrometrieAffichee getHydrometrie(int x, int y){
        return HydrometrieAffichee.determinerHydrometrieAffichee(carte.getTerrain(x,y).getHydrometrie());
    }
}
