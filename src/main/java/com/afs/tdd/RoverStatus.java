package com.afs.tdd;

public class RoverStatus {
    private final int locationX;
    private final int locationY;
    private final String direction;

    public RoverStatus(int x, int y, String direction) {
        this.locationX = x;
        this.locationY = y;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }
}
