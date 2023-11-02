package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.features.CircleFactory;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCircleTest implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();
        DriverCommand circleCommand = CircleFactory.createCircle(50);
        circleCommand.execute(driver);
    }
}
