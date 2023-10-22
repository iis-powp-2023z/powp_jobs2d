package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.command.ComplexCommandFactory;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Figure Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals("Figure Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals("Figure Pythagorean Triangle")) {
			ComplexCommandFactory.getTriangle(driverManager.getCurrentDriver()).execute();
		} else if (e.getActionCommand().equals("Figure Rectangle")) {
			ComplexCommandFactory.getRectangle(driverManager.getCurrentDriver()).execute();
		}
	}
}
