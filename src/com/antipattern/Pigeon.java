package com.antipattern;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pigeon extends Animal {

    public Pigeon(String name) {
        setName(name);
    }

    @Override
    public void speak() {
        System.out.println("im pigeon");
    }

    @Override
    public void go() {
        System.out.println("im going and use " + 2 + " legs");
    }

    @Override
    public void eat() {
    }

    @Override
    public void fly() {
        System.out.println("im flying");
    }

    @Override
    public Integer legCount() {
        System.out.println(2);
        return 2;
    }

    @Override
    public Image getPhoto(Animal animal) {
        File sourceimage = new File("c:\\pigeon.jpg");
        try {
            return ImageIO.read(sourceimage);
        } catch (IOException e) {
        }
        return null;
    }

}
