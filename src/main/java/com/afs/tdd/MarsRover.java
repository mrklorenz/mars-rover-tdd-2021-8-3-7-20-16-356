package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) move();
        if (command.equals("L")) turnLeft();
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = "N";

        if (direction.endsWith("N")) newDirection = "W";


        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        this.roverStatus = new RoverStatus(locationX, locationY + 1, direction);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
