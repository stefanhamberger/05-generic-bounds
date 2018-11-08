package de.thro.inf.prg3.a05.tests.models;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.model.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static de.thro.inf.prg3.a05.model.PlantColor.*;
import static org.junit.jupiter.api.Assertions.*;


public class PlantTest {

    Plant p;




    @Test
    public void testFlowernotGreen(){
        p = new Flower(0.5, "Rosen","GrüneRose", GREEN);
        assertNotEquals(GREEN, p.getColor());
    }

    @Test
    public void testShrub(){
        p = new Shrub(1.1, "Unkraut", "Wasweißich");
        assertEquals(GREEN, p.getColor());
    }

    @Test void testPlatBed(){
        PlantBed<Flower> pBed = new PlantBed();

        pBed.add(new Flower(0.5, "a", "b", BLUE));
        pBed.add(new Flower(0.5, "a", "b", RED));
        pBed.add(new Flower(0.5, "a", "b", RED));
        pBed.add(new Flower(0.5, "a", "b", ORANGE));
        pBed.add(new Flower(0.5, "a", "b", ORANGE));
        pBed.add(new Flower(0.5, "a", "b", ORANGE));

        SimpleList<Flower> test = pBed.getPlantsByColor(ORANGE);

        for(Flower i : test){
            assertEquals(ORANGE, i.getColor());
        }

    }

}