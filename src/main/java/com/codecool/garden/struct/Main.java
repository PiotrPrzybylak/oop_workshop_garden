package com.codecool.garden.struct;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10.0);
        Circle circle2 = new Circle(20.0);
        Circle circle3 = new Circle(.5);

        Square square1 = new Square(10);
        Square square2 = new Square(20);

        int area = Garden.howManyBoxesOfGrassSeedsINeedToBuy(List.of(circle1, circle2, circle3), List.of(square1, square2));
        System.out.println(area);
    }

}
