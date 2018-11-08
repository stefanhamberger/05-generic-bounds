package de.thro.inf.prg3.a05.model;

import static de.thro.inf.prg3.a05.model.PlantColor.GREEN;

public class Shrub extends Plant {

    public Shrub(double h, String f, String n){
        super(h, f, n);
        color = GREEN;
    }
}
