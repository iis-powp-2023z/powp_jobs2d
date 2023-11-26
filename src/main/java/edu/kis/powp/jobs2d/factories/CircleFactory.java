package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class CircleFactory implements ShapeFactory {

    @Override
    public ComplexCommand createShape(Job2dDriver driver) {
        List<DriverCommand> commands = new ArrayList<>();

        for (int i = 0; i < 360; i++) {
            commands.add(new edu.kis.powp.jobs2d.command.OperateTo((int) (100 * Math.cos(i * Math.PI / 180)), (int) (100 * Math.sin(i * Math.PI / 180))));
        }

        return new ComplexCommand(commands);
    }
}