package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

import java.util.Scanner;

/**
 * Une carte contien plusieurs terrain, elle est définie par un nom, une hauteur et une largeur
 */
public class Carte {

    /**
     * Nom de la carte
     */
    private String nom;

    /**
     * Largeur de la carte
     */
    private int largeur;

    /**
     * Hauteur de la carte
     */
    private int hauteur;

    /**
     * Les terrains de la carte
     */
    private Terrain[][] terrains;

    /**
     * Construit une carte
     * @param nom
     * @param largeur
     * @param hauteur
     * @param generateurCarte Genere les terrains de la carte
     */
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        terrains = generateurCarte.genererCarte(largeur, hauteur);
    }

    /**
     * Construit une carte à partir d'une chaine de caractere
     * @param donneesCarte
     */
    public Carte(String donneesCarte){
        Scanner scanner = new Scanner(donneesCarte);
        nom = scanner.nextLine();
        largeur = scanner.nextInt();
        hauteur = scanner.nextInt();
        terrains = new Terrain[largeur][hauteur];
        for(int indexH = 0; indexH < hauteur; indexH ++){
            for(int indexL = 0; indexL < largeur; indexL++){
                terrains[indexL][indexH] = new Terrain(Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()));
            }
        }
        scanner.close();
    }

    /**
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param x indice x du terrain
     * @param y indice y du terrain
     * @return un terain
     * @throws TerrainInexistant si le terrain est inexistant
     */
    public Terrain getTerrain(int x, int y) throws TerrainInexistant {
        if(x < 0 || x >= largeur || y < 0 || y >= hauteur){
            throw new TerrainInexistant();
        }
        return terrains[x][y];
    }

    /**
     * @return largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * @return hauteur
     */
    public int getHauteur() {
        return hauteur;
    }
}
