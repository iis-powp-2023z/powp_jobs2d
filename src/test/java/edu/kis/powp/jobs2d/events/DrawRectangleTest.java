package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.features.RectangleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawRectangleTest implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();
        DriverCommand rectangleCommand = RectangleFactory.createRectangle(200, 100);
        rectangleCommand.execute(driver);
    }
}
