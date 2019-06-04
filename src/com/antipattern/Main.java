package com.antipattern;

public class Main {

    public static void main(String[] args) {
         
        Zoo zoo = new Zoo();
        
        zoo.saveAnimal(new Lion("Lion"));
        zoo.saveAnimal(new Cat("Cat"));
        zoo.saveAnimal(new Dog("Dog"));
        zoo.saveAnimal(new Pigeon("Pigeon"));
        
        zoo.getAnimal("Lion").speak();
        zoo.getAnimal("Lion").go();
        zoo.getAnimal("Cat").legCount();
        zoo.getAnimal("Pigeon").legCount();
        zoo.sizeAnimal(zoo.getAnimals());
        
        

    }

}
