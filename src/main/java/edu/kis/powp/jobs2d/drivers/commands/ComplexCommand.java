package edu.kis.powp.jobs2d.drivers.commands;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private final ArrayList<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : this.commands) {
            command.execute();
        }
    }
}
