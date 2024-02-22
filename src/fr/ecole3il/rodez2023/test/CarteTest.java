package fr.ecole3il.rodez2023.test;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.exception.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurAleatoire;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {

    @Nested
    class GetTerrainTest{

        private static Carte carte;

        @BeforeAll
        static void beforeAll() {
            carte = new Carte("Nom", 12, 12, new GenerateurAleatoire(1));
        }

        @Test
        void getTerrain_terrainInexistant() {
            assertThrows(TerrainInexistant.class,() -> {carte.getTerrain(14,13);});
        }

        @Test
        void getTerrain_nominalCase(){
            assertInstanceOf(Terrain.class, carte.getTerrain(11,9));
        }
    }

}