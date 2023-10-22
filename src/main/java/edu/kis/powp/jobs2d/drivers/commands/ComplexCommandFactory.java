package edu.kis.powp.jobs2d.drivers.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {
    private final Job2dDriver driver;

    public ComplexCommandFactory(Job2dDriver driver) {
        this.driver = driver;
    }

    public ComplexCommand getRectangleCommands(int x, int y, int width, int height) {
        ComplexCommand instructions = new ComplexCommand();
        instructions.addCommand(new SetPositionCommand(driver, x, y));
        instructions.addCommand(new OperateToCommand(driver, x + width, y));
        instructions.addCommand(new OperateToCommand(driver, x + width, y + height));
        instructions.addCommand(new OperateToCommand(driver, x, y + height));
        instructions.addCommand(new OperateToCommand(driver, x, y));
        return instructions;
    }

    public ComplexCommand getTriangleCommands(int x, int y, int width, int height) {
        ComplexCommand instructions = new ComplexCommand();
        instructions.addCommand(new SetPositionCommand(driver, x, y));
        instructions.addCommand(new OperateToCommand(driver, x + width, y));
        instructions.addCommand(new OperateToCommand(driver, x + width / 2, y - height));
        instructions.addCommand(new OperateToCommand(driver, x, y));
        return instructions;
    }
}
