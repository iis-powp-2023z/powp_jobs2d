package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.command.COMMAND;
import edu.kis.powp.command.Command;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class RectangleFactory {

    public static DriverCommand createRectangle() {
        Command complexCommand = new Command();
        complexCommand.addCommand(new SetPositionCommand(-100, -100));
        complexCommand.addCommand(new OperateToCommand(100, -100));
        complexCommand.addCommand(new OperateToCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand(-100, 100));
        complexCommand.addCommand(new OperateToCommand(-100, -100));
        return complexCommand;
    }
}
