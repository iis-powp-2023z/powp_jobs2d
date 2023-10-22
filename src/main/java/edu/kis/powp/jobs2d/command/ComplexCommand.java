package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> listOfCommands;
    public ComplexCommand(List<DriverCommand> list){
        this.listOfCommands = list;
    }
    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : listOfCommands){
            command.execute(driver);
        }
    }
}
