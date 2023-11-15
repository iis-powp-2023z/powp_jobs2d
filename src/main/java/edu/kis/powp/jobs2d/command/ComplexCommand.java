package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> CommandList;
    public ComplexCommand(List<DriverCommand> list){
        this.CommandList=list;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : CommandList){
            command.execute(driver);
        }
    }
}
