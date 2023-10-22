package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandBuilder
{
    private final List<DriverCommand> driverCommands;

    public ComplexCommandBuilder()
    {
        driverCommands = new ArrayList<>();
    }

    public ComplexCommandBuilder addCommand(DriverCommand driverCommand)
    {
        driverCommands.add(driverCommand);
        return this;
    }

    public ComplexCommand build()
    {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommands(driverCommands);
        return complex;
    }
}
