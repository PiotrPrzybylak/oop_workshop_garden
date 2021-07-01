package com.codecool.garden;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> radiusesInMeters = List.of(1., 1.);

        double grassAreaInSquareMeters = 0;

        for (Double radius : radiusesInMeters) {
            grassAreaInSquareMeters += Math.PI * radius * radius;
        }

        System.out.println("Your grass area is: " + grassAreaInSquareMeters + " m^2.");
        int boxes = (int) Math.ceil(grassAreaInSquareMeters);
        System.out.println("You need to buy " + boxes + " boxes of grass seeds.");
    }
}
