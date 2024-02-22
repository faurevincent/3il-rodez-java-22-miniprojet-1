package fr.ecole3il.rodez2023.test;

import fr.ecole3il.rodez2023.perlin.Utils;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Nested
    class MinTest{

        @Test
        void min_widthIsMin(){
            assertEquals(1, Utils.min(1,3));
        }

        @Test
        void min_heaightIsMin(){
            assertEquals(1, Utils.min(3,1));
        }
    }
}