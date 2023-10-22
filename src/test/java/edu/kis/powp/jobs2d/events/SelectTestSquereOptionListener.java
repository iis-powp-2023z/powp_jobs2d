package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.SquereFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestSquereOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestSquereOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SquereFactory squereFactory = new SquereFactory();
        ComplexCommand complexCommand = squereFactory.createSquere();
        complexCommand.execute(driverManager.getCurrentDriver());
    }
}
