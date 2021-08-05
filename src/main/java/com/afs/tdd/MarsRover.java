package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) move();
        if (command.equals("L")) turnLeft();
        if (command.equals("R")) turnRight();
    }

    public void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        int newLocationY = 0;

        if(direction.equals("N")) newLocationY = locationY + 1;
        if(direction.equals("S")) newLocationY = locationY - 1;

        this.roverStatus = new RoverStatus(locationX, newLocationY, direction);
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = "N";

        if (direction.equals("N")) newDirection = "E";


        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = "N";

        if (direction.equals("N")) newDirection = "W";


        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
