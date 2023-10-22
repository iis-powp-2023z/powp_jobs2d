package edu.kis.powp.jobs2d.features;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class RectangleFactory implements Testable {
    public static DriverCommand createRectangle(int width, int height) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(0, 0));
        command.addCommand(new OperateToCommand(width, 0));
        command.addCommand(new OperateToCommand(width, height));
        command.addCommand(new OperateToCommand(0, height));
        command.addCommand(new OperateToCommand(0, 0));
        return command;
    }

    @Override
    public void runTest() {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();
        DriverCommand rectangleCommand = RectangleFactory.createRectangle(200, 100);
        rectangleCommand.execute(driver);
    }
}
