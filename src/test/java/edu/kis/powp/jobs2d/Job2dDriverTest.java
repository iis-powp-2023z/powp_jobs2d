package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.drivers.BasicJob2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class Job2dDriverTest {
	private static Job2dDriver driver = new BasicJob2dDriver();

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		DriverCommand setPositionCommand = new SetPositionCommand(0, 0);
		DriverCommand operateToCommand = new OperateToCommand(100, 100);

		setPositionCommand.execute(driver);
		operateToCommand.execute(driver);
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("Driver operateTo action...");
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
		}
	};
}
