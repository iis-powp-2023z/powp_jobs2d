package edu.kis.powp.factory;

import java.util.ArrayList;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Triangle {
	Job2dDriver driver;

	public Triangle(Job2dDriver driver) {
		this.driver = driver;
	}

	public void figureScript(){
		ArrayList<DriverCommand> commands = new ArrayList<>();
		commands.add(new SetPositionCommand(driver, -120, -120));
		commands.add(new OperateToCommand(driver, 120, -120));
		commands.add(new OperateToCommand(driver, 0, 0));
		commands.add(new OperateToCommand(driver, -120, -120));

		ComplexCommand complexCommand = new ComplexCommand(commands);
		complexCommand.run();
	}
}
