package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
	ArrayList<DriverCommand> driverCommands;

	public ComplexCommand(ArrayList<DriverCommand> driverCommands) {
		this.driverCommands = driverCommands;
	}

	public void execute(){
		for (DriverCommand driverCommand : driverCommands) {
			driverCommand.execute();
		}
	}
}
