package com.afs.tdd;

public class MoveCommand implements RoverCommand {
    private final MarsRover rover;

    public MoveCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
    }
}
