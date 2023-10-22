package edu.kis.powp.command;

import java.util.List;
import java.util.ArrayList;

public class ComplexCommandBuilder {
    private final List<DriverCommand> complexCommandList = new ArrayList<>();
    public ComplexCommandBuilder addCommand(DriverCommand driverCommand) {
        complexCommandList.add(driverCommand);
        return this;
    }
    public ComplexCommand build() {
        return new ComplexCommand(complexCommandList);
    }
}
