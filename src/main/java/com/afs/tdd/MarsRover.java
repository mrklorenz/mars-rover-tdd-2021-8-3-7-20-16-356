package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void move() {
        int newLocationX = roverStatus.getLocationX();
        int newLocationY = roverStatus.getLocationY();

        if (roverStatus.getDirection().equals("N")) newLocationY += 1;
        if (roverStatus.getDirection().equals("S")) newLocationY -= 1;
        if (roverStatus.getDirection().equals("E")) newLocationX += 1;
        if (roverStatus.getDirection().equals("W")) newLocationX -= 1;

        this.roverStatus = new RoverStatus(newLocationX, newLocationY, roverStatus.getDirection());
    }

    public void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        String newDirection = "";

        if (roverStatus.getDirection().equals("N")) newDirection = "E";
        if (roverStatus.getDirection().equals("S")) newDirection = "W";
        if (roverStatus.getDirection().equals("E")) newDirection = "S";
        if (roverStatus.getDirection().equals("W")) newDirection = "N";

        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        String newDirection = "";

        if (roverStatus.getDirection().equals("N")) newDirection = "W";
        if (roverStatus.getDirection().equals("S")) newDirection = "E";
        if (roverStatus.getDirection().equals("E")) newDirection = "N";
        if (roverStatus.getDirection().equals("W")) newDirection = "S";

        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public RoverStatus getRoverStatus() {
        return this.roverStatus;
    }
}
