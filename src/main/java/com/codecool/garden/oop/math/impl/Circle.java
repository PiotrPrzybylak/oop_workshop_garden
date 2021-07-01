package com.codecool.garden.oop.math.impl;

import com.codecool.garden.oop.math.api.Shape;

public class Circle implements Shape {


    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaInMetersSquared() {
        return Math.PI * Math.pow(radius, 2);
    }

}
