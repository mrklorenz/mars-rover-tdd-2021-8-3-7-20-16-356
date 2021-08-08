package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoverCommandInvoker {
    private final List<RoverCommand> roverCommandList = new ArrayList<>();

    public void addCommand(RoverCommand rover){
        roverCommandList.add(rover);
    }

    public void executeCommands(){
        for(RoverCommand roverCommand : roverCommandList){
            roverCommand.execute();
        }
        roverCommandList.clear();
    }
}
