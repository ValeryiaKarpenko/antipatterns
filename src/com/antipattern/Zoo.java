package com.antipattern;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ICounter{
    
    private List<Animal> animals = new ArrayList<Animal>();
    
    public List<Animal> getAnimals() {
        return animals;
    }

    public void saveAnimal(Animal animal) {
        this.animals.add(animal);
    }
    
    public Animal getAnimal(String name) {
        for (Animal an : animals) {
            if (an.getName().contentEquals(name)){
                return an;
            }
        }
        return null;
    }

    @Override
    public Integer legCount() {
        return null;
    }

    @Override
    public Integer sizeAnimal(List<Animal> animals) {
        System.out.println(animals.size());
        return animals.size();
    }
}
