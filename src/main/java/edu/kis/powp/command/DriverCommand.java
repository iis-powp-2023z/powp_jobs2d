package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand {

    /**
     * Executes the command using a Job2dDriver.
     *
     * @param driver the Job2dDriver to execute the command with.
     */
    void execute(Job2dDriver driver);
}
