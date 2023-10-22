package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> driverCommands;

    public ComplexCommand()
    {
        driverCommands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command)
    {
        driverCommands.add(command);
    }

    public void addCommands(List<DriverCommand> commands)
    {
        driverCommands.addAll(commands);
    }

    public void clearCommands()
    {
        driverCommands.clear();
    }

    @Override
    public void execute()
    {
        for (DriverCommand comm : driverCommands)
        {
            comm.execute();
        }
    }
}
