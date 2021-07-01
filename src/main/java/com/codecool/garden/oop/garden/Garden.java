package com.codecool.garden.oop.garden;

import com.codecool.garden.oop.math.api.Shape;

import java.util.List;

public class Garden {

    private final List<Shape> shapes;

    public Garden(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public int howManyBoxesOfGrassSeedsINeedToBuy() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.areaInMetersSquared();
        }
        return (int) Math.ceil(totalArea);
    }
}
