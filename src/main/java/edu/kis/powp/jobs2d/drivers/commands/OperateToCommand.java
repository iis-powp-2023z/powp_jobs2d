package edu.kis.powp.jobs2d.drivers.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private final Job2dDriver driver;
    private final int x;
    private final int y;

    public OperateToCommand(Job2dDriver driver, int x, int y) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver must not be null");
        }
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(this.x, this.y);
    }
}
