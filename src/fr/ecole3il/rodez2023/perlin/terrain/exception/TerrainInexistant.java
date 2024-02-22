package fr.ecole3il.rodez2023.perlin.terrain.exception;

/**
 * Pour lever une exception si le terrain est inexistant
 */
public class TerrainInexistant extends ArrayIndexOutOfBoundsException{

    public TerrainInexistant(){
        super();
    }
}
