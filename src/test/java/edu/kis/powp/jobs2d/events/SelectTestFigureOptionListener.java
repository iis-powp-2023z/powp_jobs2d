package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.TestJobs2dPatterns;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.commands.ComplexCommandFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ComplexCommandFactory factory = new ComplexCommandFactory(driverManager.getCurrentDriver());
		if (e.getActionCommand().equals(TestJobs2dPatterns.FIGURE_JOE_1)) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals(TestJobs2dPatterns.FIGURE_JOE_2)) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals(TestJobs2dPatterns.DRAW_RECTANGLE)) {
			ComplexCommand instructions = factory.getRectangleCommands(20, 20, 100, 50);
			instructions.execute();
		} else if (e.getActionCommand().equals(TestJobs2dPatterns.DRAW_TRIANGLE)) {
			ComplexCommand instructions = factory.getTriangleCommands(15, 20, 110, 50);
			instructions.execute();
		}
	}
}
