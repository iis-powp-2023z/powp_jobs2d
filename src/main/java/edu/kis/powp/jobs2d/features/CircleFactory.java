package edu.kis.powp.jobs2d.features;


import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CircleFactory implements Testable {
    public static DriverCommand createCircle(int radius) {
        ComplexCommand command = new ComplexCommand();
        int segments = 360; // Można dostosować liczbę segmentów dla płynniejszego okręgu

        command.addCommand(new SetPositionCommand(radius, 0));

        for (int i = 0; i < segments; i++) {
            double angle = 2 * Math.PI * i / segments;
            int x = (int) (radius * Math.cos(angle));
            int y = (int) (radius * Math.sin(angle));
            command.addCommand(new OperateToCommand(x, y));
        }

        return command;
    }

    @Override
    public void runTest() {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();
        DriverCommand circleCommand = CircleFactory.createCircle(50);
        circleCommand.execute(driver);
    }
}
