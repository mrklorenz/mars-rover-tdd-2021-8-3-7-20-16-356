package com.afs.tdd;

public class TurnLeftCommand implements RoverCommand{
    private final MarsRover rover;

    public TurnLeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
