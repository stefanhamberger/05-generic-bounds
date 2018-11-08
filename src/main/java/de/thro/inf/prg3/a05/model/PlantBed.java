package de.thro.inf.prg3.a05.model;

import de.thro.inf.prg3.a05.collections.SimpleFilter;
import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.collections.SimpleListImpl;

import java.util.Iterator;

public class PlantBed<T extends Plant> {

    private SimpleList<T> plants;

    public PlantBed(){
        plants = new SimpleListImpl<T>();
    }

    public void add(T plant){
        plants.add(plant);
    }

    public int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        SimpleList<T> ret = plants.filter(item -> {
            if (item.getColor().equals(color))
                return true;
            else
                return false;
        });

        return ret;
    }
}





