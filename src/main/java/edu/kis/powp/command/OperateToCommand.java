package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * A command that moves the Job2dDriver to a specific position using operateTo method.
 *
 */
public class OperateToCommand implements DriverCommand {

    private final int x;
    private final int y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(x, y);
    }
}

