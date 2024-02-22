package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.exception.MauvaiseValeurException;

import java.text.BreakIterator;

public class GenerateurPerlin extends GenerateurCarte{

    private BruitPerlin2D bruitPerlin2DHydrometrie;
    private BruitPerlin2D bruitPerlin2DTemperature;
    private BruitPerlin2D bruitPerlin2DAltitude;

    /**
     * Constructeur du générateur de carte.
     *
     * @param graine La graine utilisée pour la génération de la carte.
     */
    public GenerateurPerlin(long graine) {
        super(graine);
        bruitPerlin2DHydrometrie = new BruitPerlin2D(this.getGraine(), 1.0);
        bruitPerlin2DTemperature = new BruitPerlin2D(this.getGraine() * (long)2.0, 1.0);
        bruitPerlin2DAltitude = new BruitPerlin2D(this.getGraine() * (long) 4.0, 1.0);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        double x = (double) i / (double) largeur;
        double y = (double) j / (double) hauteur;

        double hydrometrie = Math.abs(bruitPerlin2DHydrometrie.bruit2D(x,y));
        double temperature = Math.abs(bruitPerlin2DTemperature.bruit2D(x,y));
        double altitude = bruitPerlin2DAltitude.bruit2D(x, y);

        return new Terrain(altitude, hydrometrie, temperature);
    }
}
