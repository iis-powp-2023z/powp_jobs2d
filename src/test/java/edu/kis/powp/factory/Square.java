package edu.kis.powp.factory;

import java.util.ArrayList;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Square {
	Job2dDriver driver;

	public Square(Job2dDriver driver) {
		this.driver = driver;
	}

	public void figureScript(){
		ArrayList<DriverCommand> commands = new ArrayList<>();
		commands.add(new SetPositionCommand(driver, -120, -120));
		commands.add(new OperateToCommand(driver, 120, -120));
		commands.add(new OperateToCommand(driver, 120, 120));
		commands.add(new OperateToCommand(driver, -120, 120));
		commands.add(new OperateToCommand(driver, -120, -120));

		ComplexCommand complexCommand = new ComplexCommand(commands);
		complexCommand.run();
	}
}
