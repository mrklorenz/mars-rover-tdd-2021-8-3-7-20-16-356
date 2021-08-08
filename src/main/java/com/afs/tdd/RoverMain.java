package com.afs.tdd;

public class RoverMain {
    public static void main(String[] args) {
        RoverStatus roverStatus = new RoverStatus(0, 0, "N");
        String commands = "M";
        MarsRover rover = new MarsRover(roverStatus);

        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();

        for (Character command : commands.toCharArray()) {
            if (command.equals('M')) {
                roverCommandInvoker.addCommand(new MoveCommand(rover));
            }
            if (command.equals('L')) {
                roverCommandInvoker.addCommand(new TurnLeftCommand(rover));
            }
            if (command.equals('R')) {
                roverCommandInvoker.addCommand(new TurnRightCommand(rover));
            }
        }

        roverCommandInvoker.executeCommands();

        System.out.println(rover.getRoverStatus().getLocationX());
        System.out.println(rover.getRoverStatus().getLocationY());
        System.out.println(rover.getRoverStatus().getDirection());
    }
}
