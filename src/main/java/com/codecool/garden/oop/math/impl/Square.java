package com.codecool.garden.oop.math.impl;

import com.codecool.garden.oop.math.api.Shape;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double areaInMetersSquared() {
        return side * side;
    }
}
