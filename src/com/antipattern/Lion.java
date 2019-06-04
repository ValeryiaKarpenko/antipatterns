package com.antipattern;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Lion extends Animal {

    public Lion(String name) {
        setName(name);
    }

    @Override
    public void speak() {
        System.out.println("im lion");
    }

    @Override
    public void go() {
        System.out.println("im runnig and use " + LEGS + " legs");
    }

    @Override
    public void eat() {
    }

    @Override
    public void fly() {
    }

    @Override
    public Integer legCount() {
        System.out.println(LEGS);
        return LEGS;
    }

    @Override
    public Image getPhoto(Animal animal) {
        File sourceimage = new File("c:\\lion.jpg");
        try {
            return ImageIO.read(sourceimage);
        } catch (IOException e) {
        }
        return null;
    }

}
