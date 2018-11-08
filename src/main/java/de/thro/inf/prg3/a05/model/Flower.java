package de.thro.inf.prg3.a05.model;

import static de.thro.inf.prg3.a05.model.PlantColor.GREEN;
import static de.thro.inf.prg3.a05.model.PlantColor.RED;

public class Flower extends Plant{

    public Flower(double h, String f, String n, PlantColor c){
        super(h, f, n);
        if(!(c.equals(GREEN))){
            color = c;
        }
        else{
            color = RED;
            System.out.println("Flower cannot be green, color is now Red");
        }
    }
}
