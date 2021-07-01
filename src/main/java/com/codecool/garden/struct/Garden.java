package com.codecool.garden.struct;

import java.util.List;

public class Garden {

    public static int howManyBoxesOfGrassSeedsINeedToBuy(List<Circle> circles, List<Square> squares) {

        double grassAreaInSquareMeters = 0;
        for (Circle circle : circles) {
            grassAreaInSquareMeters += Math.PI * circle.radius * circle.radius;
        }

        for (Square square : squares) {
            grassAreaInSquareMeters += square.side * square.side;
        }

        return (int) Math.ceil(grassAreaInSquareMeters);
    }


}
