package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe RandomNoise étend la classe Noise2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {

    private Random random;

    /**
     * Constructeur BruitAléatoire
     * @param graine la graine
     * @param resolution la résolution
     */
    public BruitAleatoire(long graine, double resolution) {
        super(graine, resolution);
        random = new Random();
    }

    @Override
    public double bruit2D(double x, double y) {
        return random.nextDouble(x,y);
    }
}
