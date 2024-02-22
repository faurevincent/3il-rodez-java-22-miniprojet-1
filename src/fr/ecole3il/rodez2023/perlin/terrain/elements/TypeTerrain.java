package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

/**
 * TypeTerrain est enum contenant tous les types de terrain ainsi que leurs chemins d'acces
 */
public enum TypeTerrain {
    PLAINE("plain.png", "Plaine"),
    FORET_FEUILLUS("deciduous_forest.png", "Forêt de feuillus"),
    TOUNDRA("tundra.png", "Toundra"),
    FORET_CONIFÈRES("coniferous_forest.png", "Forêt de conifères"),
    MONTAGNE("mountain.png", "Montagne"),
    DESERT("desert.png", "Désert"),
    COLLINES("hills.png", "Collines"),
    MARAIS("marsh.png", "Marais"),
    OCEAN("ocean.png", "Océan");

    /**
     * Chemin du type de terrain
     */
    private String path;

    /**
     * Nom du type de terrain
     */
    private String name;

    /**
     * Construit un type de terrain
     * @param path
     * @param name
     */
    TypeTerrain(String path, String name) {
        this.path = path;
        this.name = name;
    }

    /**
     * @return L'image du type de terrain
     */
    public BufferedImage getImage() {
        return Utils.chargerTuile(path);
    }

    @Override
    public String toString(){
        return name;
    }
}
