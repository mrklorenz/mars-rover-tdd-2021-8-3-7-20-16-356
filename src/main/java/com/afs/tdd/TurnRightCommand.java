package com.afs.tdd;

public class TurnRightCommand implements RoverCommand{
    private final MarsRover rover;

    public TurnRightCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
