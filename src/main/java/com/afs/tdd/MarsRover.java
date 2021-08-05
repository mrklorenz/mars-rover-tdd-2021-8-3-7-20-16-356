package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        }
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
