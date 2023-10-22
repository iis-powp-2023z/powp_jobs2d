package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {
    public static DriverCommand getRectangle(Job2dDriver job2dDriver) {
        return new ComplexCommandBuilder()
                .addCommand(new SetPositionCommand(-100, -50, job2dDriver))
                .addCommand(new OperateToCommand(100, -50, job2dDriver))
                .addCommand(new OperateToCommand(100, 50, job2dDriver))
                .addCommand(new OperateToCommand(-100, 50, job2dDriver))
                .addCommand(new OperateToCommand(-100, -50, job2dDriver))
                .build();
    }
    public static DriverCommand getTriangle(Job2dDriver job2dDriver) {
        return new ComplexCommandBuilder()
                .addCommand(new SetPositionCommand(-100, -100, job2dDriver))
                .addCommand(new OperateToCommand(-100, 100, job2dDriver))
                .addCommand(new OperateToCommand(50, -100, job2dDriver))
                .addCommand(new OperateToCommand(-100, -100, job2dDriver))
                .build();
    }
}
