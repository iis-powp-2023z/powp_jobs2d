package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory
{
    private List<DriverCommand> commands = new ArrayList<>();

    public static ComplexCommand getSquare(Job2dDriver job2dDriver)
    {
        return new ComplexCommandBuilder()
                .addCommand(new SetPositionCommand(job2dDriver, 40, 40))
                .addCommand(new OperateToCommand(job2dDriver, 60, 40))
                .addCommand(new OperateToCommand(job2dDriver, 60, 20))
                .addCommand(new OperateToCommand(job2dDriver, 40, 20))
                .addCommand(new OperateToCommand(job2dDriver, 40, 40))
                .build();
    }

    public static ComplexCommand getTriangle(Job2dDriver job2dDriver)
    {
        return new ComplexCommandBuilder()
                .addCommand(new SetPositionCommand(job2dDriver, 40, 40))
                .addCommand(new OperateToCommand(job2dDriver, 60, 40))
                .addCommand(new OperateToCommand(job2dDriver, 50, 60))
                .addCommand(new OperateToCommand(job2dDriver, 40, 40))
                .build();
    }
}
