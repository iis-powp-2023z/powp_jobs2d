package command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SquareFactory {

    public static ComplexCommand createSquare(Job2dDriver driver, int x, int y, int size) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver, x, y));
        command.addCommand(new OperateToCommand(driver, x + size, y));
        command.addCommand(new OperateToCommand(driver, x + size, y + size));
        command.addCommand(new OperateToCommand(driver, x, y + size));
        command.addCommand(new OperateToCommand(driver, x, y));
        return command;
    }
}
