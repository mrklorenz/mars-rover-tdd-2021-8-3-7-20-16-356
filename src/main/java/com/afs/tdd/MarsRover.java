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
        int newLocationX = 0;
        int newLocationY = 0;

        if(direction.equals("N")) newLocationY = locationY + 1;
        if(direction.equals("S")) newLocationY = locationY - 1;
        if(direction.equals("E")) newLocationX = locationX + 1;
        if(direction.equals("W")) newLocationX = locationX - 1;

        this.roverStatus = new RoverStatus(newLocationX, newLocationY, direction);
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = "";

        if (direction.equals("N")) newDirection = "E";
        if (direction.equals("S")) newDirection = "W";
        if (direction.equals("E")) newDirection = "S";
        if (direction.equals("W")) newDirection = "N";


        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = "";

        if (direction.equals("N")) newDirection = "W";
        if (direction.equals("S")) newDirection = "E";
        if (direction.equals("E")) newDirection = "N";


        this.roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
