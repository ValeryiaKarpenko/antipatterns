package com.antipattern;

import java.util.List;

public abstract class Animal implements IBasicMethod, ICounter {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Boolean isEmpty(List<Animal> animals) {
        return animals.isEmpty();
    }
    
    public abstract Object getPhoto(Animal animal);
    
    public Integer sizeAnimal(List<Animal> animals) {
        return null;
    }
}
