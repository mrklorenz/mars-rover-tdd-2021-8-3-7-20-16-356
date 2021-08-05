package com.afs.tdd;

import java.util.Objects;

public class RoverStatus {
    private final int locationX;
    private final int locationY;
    private final String direction;

    public RoverStatus(int x, int y, String direction) {
        this.locationX = x;
        this.locationY = y;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoverStatus)) return false;
        RoverStatus that = (RoverStatus) o;
        return locationX == that.locationX && locationY == that.locationY && direction.equals(that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationX, locationY, direction);
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
