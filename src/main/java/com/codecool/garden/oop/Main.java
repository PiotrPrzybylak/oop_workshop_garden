package com.codecool.garden.oop;

import com.codecool.garden.oop.garden.Garden;
import com.codecool.garden.oop.math.api.Shape;
import com.codecool.garden.oop.math.impl.Circle;
import com.codecool.garden.oop.math.impl.Square;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10.0);
        Circle circle2 = new Circle(20.0);
        Circle circle3 = new Circle(.5);

        Square square1 = new Square(10);
        Square square2 = new Square(20);

        List<Shape> shapes = List.of(circle1, circle2, circle3, square1, square2);
        Garden garden = new Garden(shapes);
        System.out.println(garden.howManyBoxesOfGrassSeedsINeedToBuy());

    }
}
