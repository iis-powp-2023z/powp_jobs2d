package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateTo;
import edu.kis.powp.jobs2d.command.SetPosition;

import java.util.ArrayList;
import java.util.List;

public class RectangleFactory implements ShapeFactory {

    @Override
    public ComplexCommand createShape(Job2dDriver driver) {
        List<DriverCommand> commands = new ArrayList<>();

        // Add commands for drawing a rectangle
        commands.add(new SetPosition(0, 0));
        commands.add(new OperateTo(0, 70));
        commands.add(new OperateTo(100, 70));
        commands.add(new OperateTo(100, 0));
        commands.add(new OperateTo(0, 0));

        return new ComplexCommand(commands);
    }
}
