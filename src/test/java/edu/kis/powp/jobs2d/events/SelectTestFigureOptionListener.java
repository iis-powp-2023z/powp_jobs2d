package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import edu.kis.powp.jobs2d.TestJobs2dPatterns;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Objects.equals(e.getActionCommand(), TestJobs2dPatterns.FIGURE_JOE_1)) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (Objects.equals(e.getActionCommand(), TestJobs2dPatterns.FIGURE_JOE_2)) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
