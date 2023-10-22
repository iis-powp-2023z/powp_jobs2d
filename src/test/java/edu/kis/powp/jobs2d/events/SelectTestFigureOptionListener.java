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
		if (e.getActionCommand().equals(FigureNameEvent.FIGURES_JOE_1)) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals(FigureNameEvent.FIGURES_JOE_2)) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals(FigureNameEvent.TRIANGLE)) {
			ComplexCommandFactory.getTriangle(driverManager.getCurrentDriver()).execute();
		} else if (e.getActionCommand().equals(FigureNameEvent.RECTANGLE)) {
			ComplexCommandFactory.getRectangle(driverManager.getCurrentDriver()).execute();
		}
	}
}
