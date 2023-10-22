package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class CircleFactory {

    public static DriverCommand createCircle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 100));
        int num_of_segments = 360; //A number specifying how many lines the circle will consist of

        // Add OperateToCommand commands to draw a circle
        for (int i = 0; i < num_of_segments; i++) {
            int x = (int) (100 * Math.sin(Math.toRadians(i)));
            int y = (int) (100 * Math.cos(Math.toRadians(i)));
            complexCommand.addCommand(new OperateToCommand(x, y));
        }
        return complexCommand;
    }
}
