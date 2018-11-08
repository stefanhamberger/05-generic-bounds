package de.thro.inf.prg3.a05.model;

public abstract class Plant implements Comparable<Plant> {

    private double height;
    private String family;
    private String name;
    protected PlantColor color;

    public Plant(double h, String f, String n){
        height = h;
        name = n;
        family = f;
    }

    public Plant(){

    }


    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public PlantColor getColor() {
        return color;
    }

    public int compareTo(Plant other) {
        if (this.height < other.height)
            return -1;
        else if(this.height > other.height)
            return 1;
        else
            return 0;
    }
}
