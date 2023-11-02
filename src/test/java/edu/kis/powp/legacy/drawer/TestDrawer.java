package edu.kis.powp.legacy.drawer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.BasicJob2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

/**
 * Drawer test.
 * 
 * @author Dominik
 */
public class TestDrawer {
	/**
	 * Drawer test.
	 */
	public static void main(String[] args) {
		Job2dDriver driver = new BasicJob2dDriver();

		DriverCommand setPositionCommand = new SetPositionCommand(-100, -60);
		DriverCommand operateToCommand = new OperateToCommand(60, 130);

		setPositionCommand.execute(driver);
		operateToCommand.execute(driver);
	}
}
