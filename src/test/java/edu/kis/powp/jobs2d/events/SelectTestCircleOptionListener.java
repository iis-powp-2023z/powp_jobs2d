package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.CircleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCircleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestCircleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CircleFactory circleFactory = new CircleFactory();
        ComplexCommand complexCommand = circleFactory.createShape(driverManager.getCurrentDriver());
        complexCommand.execute(driverManager.getCurrentDriver());
    }
}