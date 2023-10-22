package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.TriangleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestTriangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TriangleFactory triangleFactory = new TriangleFactory();
        ComplexCommand complexCommand = triangleFactory.createTriangle();
        complexCommand.execute(driverManager.getCurrentDriver());
    }
}
