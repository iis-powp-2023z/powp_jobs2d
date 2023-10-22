package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand {
	ArrayList<DriverCommand> driverCommands;

	public ComplexCommand(ArrayList<DriverCommand> driverCommands) {
		this.driverCommands = driverCommands;
	}

	public void run(){
		for (DriverCommand driverCommand : driverCommands) {
			driverCommand.execute();
		}
	}
}
